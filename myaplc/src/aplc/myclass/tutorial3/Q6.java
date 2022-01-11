package aplc.myclass.tutorial3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q6 {

	/**
	 * 6.	Generate numbers from 2 to 20 with a gap of 2.  //Stream.iterate
	 * 		Join this generated numbers with the array list above. //Stream.map()
	 * 		Display all elements of the newly created array list. //calling program
	 */
	
	List<Integer> fun( List<Integer> lst, int min, int max ){
		return Stream.concat(
				lst.stream(), 
				Stream.iterate(min, n -> n <= max, n -> n + 2))
				.collect(Collectors.toList());
	}	
	
	
	public static void main(String[] args) {
		int min = 2, max = 20;
		
//		for (int n = min; n <= max; n += 2) {
//			System.out.println( n );
//		}
		//equivalent,
//		Stream<Integer> newList = Stream.iterate(min, n -> n <= max, n -> n + 2);
		
		//Alternatively,
		Stream<Integer> newList = Stream.iterate(min, n -> n + 2); //causes infinate loop...
		Stream<Integer> collect10 = newList.limit(10); 
		
		collect10.forEach(System.out::println);
		
		
		
	}
	
}
