package aplc.myclass.tutorial3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {

	/**
	 * 4.	Sort all elements in descending order.
	 */
	
	Integer[] imp( int[] arr  ){
		Integer[] arr2 = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.valueOf(arr[i]);
		}
		Arrays.sort(arr2, Collections.reverseOrder());
		return arr2;
	}
	
	List<Integer> fun( int[] arr  ){
		return Arrays.stream( arr )
				.sorted()
				.mapToObj( Integer :: valueOf )
				.collect( Collectors.toList() );
	}
}
