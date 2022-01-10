package aplc.myclass.tutorial4.purity;

/**
 * 
 * @author kimlee@staffemail.apu.edu.my
 *
 *	
 *	Reading:
 *		https://www.sitepoint.com/what-is-referential-transparency/
 *
 */

public class Q7 {

	// q7-referential transparency issue
	int add(int a, int b) { // pure function? Yes. However, the function has a side effect so impure.
		int result = a + b;
		// System.out.println("Returning " + result); //introduces side effect...
		return result;
	}

	// in this situation, we may make a function that utilise existing function.
	// formula: result = (a+b) * (c+d)
	int f(int a, int b, int c, int d) {
		// return (a+b) * (c+d);
		return (a + b) * add(c, d);
	}

	void test() {
		
		// trying q7
		int a = 10, b = 20, c = 30, d = 40;

		System.out.println( new Q7().f(a, b, c, d));
		/**
		 * Returning 30 Returning 70 2100
		 */
//				System.out.println( demo.add(10, 30) );
//				System.out.println( demo.add(10, 30) );
//				System.out.println( demo.add(10, 30) );
		
	}

}
