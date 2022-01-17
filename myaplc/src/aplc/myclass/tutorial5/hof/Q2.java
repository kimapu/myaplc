package aplc.myclass.tutorial5.hof;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 *
 *	2.	Given the username as follows. 
 *		Write a functional Java/Javascript code to find a username called “salleh”. 
 *		Display the name if found, otherwise, display a null.
 */

public class Q2 {

	/**
	 * Predicate functional interface
	 */
	boolean startFrom( String param ) {
		return param.startsWith("TP");
	}
	
	//lambda w/ Predicate
	Predicate<String> startTP = param -> param.startsWith("TP");

	public static void main(String[] args) {
		
		//System.out.println( new Q2().startTP.test("APU123456") );
		
		//test q2
		Q2 q2 = new Q2();
		
		String found = Q2.find( q2.username , "salleh", q2.eq);
		System.out.println( "Target: "+found );
		
	}

	/**
	 * code solution...
	 */
	String[] username = { "ali", "ahmad", "maria", "john", "derick", "salleh" };
	private BiPredicate<String, String> eq = (param1, param2) -> param1.equals(param2);
	static String find( String[] src, String target, BiPredicate<String, String> eq) {
		return Arrays.stream(src)
				.filter( elem -> eq.test(elem, target))
				.findAny().orElse(null);
	}
	
	
}
