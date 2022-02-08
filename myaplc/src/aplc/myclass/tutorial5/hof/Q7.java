package aplc.myclass.tutorial5.hof;

import java.util.function.Function;

public class Q7 {
	
	static Function<Integer, Function<Integer, Integer>> add = a -> (b -> a + b);
	static Function<Integer, Function<Integer, Integer>> mul = a -> (b -> a * b);
	
	static int compute( int a, int b, int c, int d ) {
		//f(a, b, c, d) = (a + b) * (c + d)
		return mul
				.apply(add.apply(a).apply(b))
				.apply(add.apply(c).apply(d));
	}

	//alternatively, 
	static int f1( Function<Integer,  Function<Integer, Integer>> fn, int x, int y ) {
		return fn.apply(x).apply(y);
	}
	
	public static void main(String[] args) {
		
		int result1 = compute(1,2,3,4);
		System.out.println( "Result: "+result1 );
		
		//alternatively
		int r1 = f1( add, 1, 2 );
		int r2 = f1( add, 3, 4 );
		int result2 = f1(mul, r1, r2);
		System.out.println( "Result: "+result2 );
	}
	
	
}
