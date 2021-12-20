package tut5.tutorial.demo;

import java.util.function.Function;

public class Q7 {

	//q7
	/**
	 * double f(int a, int b, int c, int d) {
			return (a+b)*(c+d);
		}

	 */
	Function<Integer, Function<Integer, Integer>> add = a -> (b -> a + b);
	Function<Integer, Function<Integer, Integer>> multiply = a -> (b -> a * b);
	
	double f( int a, int b, int c, int d ) {
		return multiply
				.apply( add.apply(a).apply(b) )
				.apply( add.apply(c).apply(c) );
	}
	
	
}
