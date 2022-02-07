package aplc.archive.tut6.tutorial.demo;

import java.util.function.UnaryOperator;

public class Q4 {

	public static void main(String[] args) {
		
		System.out.println( Q4.sum.apply(5) ); // 0+1+2+3+4+5
		System.out.println( Q4.rev.apply("hello") );
	}
	
	/**
	 * 	a.	the Factorial number
	 */
	static final UnaryOperator<Integer> fac = n -> n == 0
	        ? 1
	        : n * Q4.fac.apply(n-1);
	

	/**
	 * 	b.	the total of all number on the given n 
	 */
	static final UnaryOperator<Integer> sum = n -> n == 0 
			? n 
			: n + Q4.sum.apply(n - 1);

	/**
	 * 	c.	the reversed string 
	 */
	static final UnaryOperator<String> rev = n -> n.length() == 0 
			? n 
			: n.charAt(n.length() - 1) + Q4.rev.apply(n.substring(0, n.length() - 1));
	
}
