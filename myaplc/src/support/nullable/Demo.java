package support.nullable;

import java.util.Optional;

/**
 * 
 *  nullable concept ?
 *
 *		NullPointerException exception (Runtime exception)
 */

public class Demo {

	/**
	 * What is the NullPointerExcption? How?
	 */
	boolean checkStartWithID( String str1 ) {
		
		Optional<String> str = Optional.ofNullable(str1);
		/**
		 * Check the first char start with 'ID'xxxx 
		 */
//		return str.startsWith("ID");
		
		return str.isPresent() ? str.get().startsWith("ID") : false;
	}
	

	public static void main(String[] args) {
		Demo d = new Demo();
		
		System.out.println( d.checkStartWithID("ID12356") );
		System.out.println( d.checkStartWithID(null) );
		
	}
	
	
	void m1() {
		
	}
	
}
