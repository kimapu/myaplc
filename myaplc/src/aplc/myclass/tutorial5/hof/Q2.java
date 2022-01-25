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
		
		//System.out.println( new Q2().startTP.test("APU123456") ); //false
		
		//test q2
		Q2 q2 = new Q2();
		
		String found1 = Q2.find( q2.username , "salleh", q2.eq);
		System.out.println( "Target: "+found1 );

		String found2 = Q2.find( q2.username , "SALLEH", q2.eqIgnoreCase);
		System.out.println( "Target: "+found2 );

		String found3 = Q2.find( q2.username , "eh", q2.endWith);
		System.out.println( "Target: "+found3 );
		
		String found4 = Q2.find( q2.username , "sal", q2.startWith);
		System.out.println( "Target: "+found4 );
		
		
	}

	/**
	 * code solution...
	 */
	String[] username = { "ali", "ahmad", "maria", "john", "derick", "salleh" };
	
	private BiPredicate<String, String> eq = (param1, param2) -> param1.equals(param2);
	private BiPredicate<String, String> eqIgnoreCase = (param1, param2) -> param1.equalsIgnoreCase(param2);
	private BiPredicate<String, String> endWith = (param1, param2) -> param1.endsWith(param2);
	private BiPredicate<String, String> startWith = (param1, param2) -> param1.startsWith(param2);
	
	static String find( String[] src, String target, BiPredicate<String, String> eq) {
		return Arrays.stream(src)
				.filter( elem -> eq.test(elem, target))
				.findAny().orElse(null);
	}
	
	
}
