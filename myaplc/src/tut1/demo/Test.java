package tut1.demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//functional programming concept: to design a function that returns result...
//in particular, function can be designed in higher order function

//in imperative programing, it doesn't care about the side-effects...

public class Test {

	//data object (collection)
	static List<Integer> numLst = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
 
	public static void main(String[] args) 
	{
		
		//show( numLst );
//		Integer result = find( 8, numLst );
//		
//		System.out.println( result );
		
		
		
	}
	
	//findNemo()
	////zhenyie
	static boolean findNemo( String str, List<String> names ) {
		return names.stream().anyMatch(s -> s.equals(str));
	}
	//alternatively
	//chihung
	static void findNemo( List<String> names ) { //pure function~
		//functional style
		//stream, forEach, lambda 
		names.stream().forEach(
				
				elem -> {  
					
					if( elem.equalsIgnoreCase("nemo") )
						System.out.println("Found!");
					else
						System.out.println("Not found!");
				}
				
				);
		
	}
	
	

	//find()
	static Integer find( int n, List<Integer> lst ) {
		//?
		//imperative style
		//ranen (for, if)
//		for (int i = 0; i < lst.size(); i++) 
//		{
//			if( lst.get(i) == n ) {
//				return n;
//			}
//		}
//		return null;
		
		//functional style
		return lst.stream()
				.filter( e -> e == n )
				.findAny()
				.orElse(null);
		
	}
	
	//show()
	static void show( List<Integer> lst ) {
		//jianbin (forloop)
		//imperative style
//		int length = lst.size();
//		for (int i = 0; i < length; i++) 
//		{
//			System.out.println( lst.get(i) );
//		}
		
		//functional style
		lst.forEach( System.out::println );
		
	}
	
}
