package aplc.myclass.tutorial5.hof;

import java.util.function.Function;

public class Demo {


	//function sample
	Integer m1( Integer i ) {
		return i;
	}
	
	//lambda w/ Function functional interface...
	Function<Integer, Integer> m2 = i -> i;
	Function<Integer, Integer> doubler = i -> i * 2;
	Function<Integer, Integer> div2 = i -> i / 2;
	
	//HoF - used in this get operation... 
	Integer get( Function<Integer, Integer> function, int param ) {
		return function.apply(param);
	}

	Integer getValue( Function<String, Integer> function, String param ) {
		return function.apply(param);
	}
	
	public static void main(String[] args) {
		Demo dm = new Demo();
		
		int i1 = 99, i2 = 88;
		
		int r1 = dm.get(dm.m2, i1);
		int r2 = dm.get(dm.doubler, i2);
		int r3 = dm.get(dm.div2, i2);
		
		int intValue = dm.getValue( Integer :: valueOf, "100"); //method-ref
		
		System.out.println( r1 );
		System.out.println( r2 );
		System.out.println( r3 );	
	}
	
}
