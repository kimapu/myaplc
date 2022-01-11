package aplc.myclass.tutorial3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {

	/**
	 * 4.	Sort all elements in ascending order.
	 */
	
	int[] imp( int[] arr  ){
		Arrays.sort(arr);
		return arr;
	}
	
	List<Integer> fun( int[] arr  ){
		return Arrays.stream( arr )
				.sorted()
				.mapToObj( Integer :: valueOf )
				.collect( Collectors.toList() );
	}
	
}
