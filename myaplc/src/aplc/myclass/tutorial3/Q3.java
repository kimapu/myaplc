package aplc.myclass.tutorial3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {

	/**
	 * 3.	Double up each array element by 2 and store them in another array list.
	 * 
	 */
	
	public static void main(String[] args) {
		//new Q3().imp( Data.arr ).forEach(System.out :: println );;
	}
	
	List<Integer> imp( int[] arr ) {
		//logic-step
		//loop -> doubleup -> store
		List<Integer> newLst = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int doubler = arr[i] * 2; //math-function ie., f(x) = x * 2
			newLst.add(doubler);
		}
		return newLst;
	}
	
	List<Integer> fun( int[] arr ) //1,2,3,4,5
	{	
		List<Integer> col = Arrays.stream( arr ).boxed().collect(Collectors.toList()); 
		return col.stream()
				//.map( UtilFunction.doubler ) //transform curr elem to a new elem
				
				//alternatively, we can write the lambda function explicitly
				.map( elem -> elem * 2 ) //new elem is introduced after applying the func
				//.collect( Collectors.toCollection( LinkedList :: new ) );
				.collect( Collectors.toList() ); 
	}
	
}
