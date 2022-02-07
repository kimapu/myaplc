package aplc.archive.tut5.tutorial.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo {

	//q1() -> bret
	//HOF	: it takes others function as argument and/or return a function as its result
	//Func	: a set of instructions that perform a task either by input-argument values/objects 
				//in turn returning result by value/object
	
	//q2() -> kaijun
	public Predicate<String> checkSalleh = name -> name.equals("salleh"); //Function as value
	public Predicate<String> checkAli = name -> name.equals("ali");
	
	String q2( List<String> username ) {
		return username.stream()
				.filter( checkSalleh :: test ) //method-reference = FunctionAsArgument
				//.findFirst()
				.findAny()
				.orElse(null);
	}
	
	String q2_updated( List<String> username, Predicate<String> condition ) {
		return username.stream()
				.filter( condition ) 
				.findAny()
				.orElse(null);
	}
	
	String q2_copy( List<String> username ) { //imperative-style
		for (String elem : username) { 
			if( elem.equals("salleh") ) //filter by test the condition 
			{
				return elem;
			}
			else 
			{
				return null;
			}
		}
		return null;
	}
	
	//q3() -> jason
	BiFunction<String, String, String> join = (a, b) -> String.join("", a, b);
	String q3( String str1, String str2 ) {
		return join.apply(str1, str2);
	}
	
	//q4() -> jason
	BiFunction<Integer, Integer[], Integer> total = (x, a) -> 
		x * Arrays.stream(a)
			.mapToInt(Integer :: intValue) //transform the Integer obj typed to the primitive typed stream (IntStream)
			.sum();
	int q4( int x, Integer[] a ) {
		return total.apply( x, a );
	}
	//alternatively, kaijun
	static Function<int[], Integer> addAll = (arr)-> Arrays.stream(arr).reduce(0, Integer :: sum);
	static BiFunction<Integer, Integer, Integer> multi = (a, b)-> a*b;
	public static void test(int[] arr, int x){
	    System.out.println(multi.apply(addAll.apply(arr), x));
	}
	
	//q5() -> bryan
	//f(20, 15) = 20 + 15
	BiFunction<Integer, Integer, Integer> f = (a, b)-> a + b; //yet curried function 
	
	Function<Integer, Function<Integer, Integer>> add = a -> (b -> a + b); //curried function! partial-app
	Function<Integer, Integer> q5a( int a ) {
		return add.apply(a);//partially executed the function add()
	}
	int q5b( Function<Integer, Integer> math, int b ) {
		return math.apply(b);
	}
	
	int compute( int a ) throws Exception{
		Function<Integer, Integer> pa = q5a(a);
		
		Thread.sleep(3000);
		
		int b = 50;
		int result = q5b( pa, b );
		return result;
	}
	
}
