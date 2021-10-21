package tut6.tutorial.demo;

public class Demo {

	public static void main(String[] args) {
		System.out.println( ">>> Iterative technique..." );
		nLines( 5 );
		
		System.out.println();
		System.out.println( ">>> Recursive technique..." );
		nLines2(5);

	}

	/**
	 * Recursion technique
	 */
	static void nLines2(int n) {
		if (n > 1) { // stop-case
			nLines2(n - 1); // recursive-call
		}
		System.out.println(n-1);
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
