package tut6.tutorial.demo;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Demo {

	public static void main(String[] args) {
		System.out.println(">>> Iterative technique...");
		nLines(5);

		System.out.println();
		System.out.println(">>> Recursive technique...");
		nLines2(5);

	}

	/**
	 * Recursive lambda  ->
	 * 	ternary operator 
	 * 		? : 
	 */
	static final BiFunction<Integer, Integer, Long> power = 
			(base, expo) -> expo != 0 
				? Demo.power.apply(base, expo - 1) * base 
				: 1;
			
	static final BinaryOperator<Long> power2 = 
			(base, expo) -> expo != 0 
				? Demo.power2.apply(base, expo - 1) * base 
				: 1;
	/**
	 * Recursion function
	 */
	static long power(int base, int expo) {
		if (expo != 0) {
			return power(base, expo - 1) * base;
		} else {
			return 1;
		}
	}

	/**
	 * Recursion technique
	 */
	static void nLines2(int n) {
		if (n > 1) { // stop-case
			nLines2(n - 1); // recursive-call
		}
		System.out.println(n - 1);
	}

	/**
	 * 
	 * Iterative technique - for
	 */
	static void nLines(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
	}

}
