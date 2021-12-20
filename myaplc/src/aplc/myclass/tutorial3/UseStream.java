package aplc.myclass.tutorial3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UseStream {

	/**
	 * To get Stream from a source....
	 * 
	 *  3 ways to do that...
	 *  	1) Arrays.stream(  )
	 *  	2) Stream.of( )
	 *  	3) Collection.stream()
	 */
	
//	2) Stream.of( )
	void m1()
	{
		Stream<Integer> stream = Stream.of(1,2,3);
		stream.forEach(System.out :: println);	
	}
	
	
//	3) Collection.stream()
	void m2() {
		
		List<String> nameLst = Arrays.asList("ali", "ahmed", "mutu");
		nameLst.stream()
			.filter(name -> name.equals("mutu"))
			.forEach(System.out :: println);
				
		
	}
	
	
	
}
