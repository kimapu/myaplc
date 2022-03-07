package aplc.myclass.tutorial8.q2;

import java.util.List;
import java.util.Optional;

public class Demo {

	
	public static void show( List<Student> studentLst ) {
		
		/**
		 * NullPointerException is concerned so Optional is a trick!
		 */
//		Optional.ofNullable( Coursework.compute(studentLst) ).ifPresentOrElse(
//				elem -> elem.forEach( e -> System.out.println(Math.round(e)) ), 
//				() -> System.out.println("No marks!") );
		
		Coursework.compute2( studentLst ).ifPresentOrElse(
				elem -> elem.forEach( e -> System.out.println(Math.round(e)) ), 
				() -> System.out.println("No marks!")
				);
		
		//alternatively, 
//		List<Double> ml = null;
		//1)
//		if( ml != null ) {
//			ml.forEach( e -> System.out.println(Math.round(e)) );
//		}
		//2)
		//Optional.ofNullable(ml).ifPresent( elem -> elem.forEach( e -> System.out.println(Math.round(e)) ) );
		
	}

	
}
