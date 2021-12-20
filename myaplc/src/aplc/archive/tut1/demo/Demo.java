package aplc.archive.tut1.demo;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {

	static List<String> nameList = Arrays.asList(
				"john", "helen", "jolin", "mick"
			);
	
	//REQ1: show all elements from a collection
	//show()
	static void show( List<String> list ) {
		//jason
		//is this imperative? YES.
		//logic: iteration... how! while/dowhile/for
//		for(int i = 0; i < list.size(); i++){
//			System.out.println( list.get(i) );
//		}
		//This time, we are concerned to review the imperative code in a concise manner
		//delarative style
		list.stream().forEach( elem -> System.out.println( elem ) ); 
		//forEach is an operation from a Stream of elements...
	}
	
	//REQ2: find a target name from a collection
	//declarative style
	static String find( String target, List<String> list )   {
		//functional style
		//1)
//		List<String> lst = list.stream() 
//				.filter( elem -> elem.equals(target) )
//				.collect( Collectors.toList() );
//		return lst.get(0);
		
		//2)
		return list.stream() //replacing loop
			.filter( elem -> elem.equals(target) )//replacing if
			.findAny()
			.orElse(null);
		
		//as long as the function is made to satisfy purity concept...
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Demo...");
		
		show( nameList );
	}

}
