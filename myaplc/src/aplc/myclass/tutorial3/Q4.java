package aplc.myclass.tutorial3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import tut3.tutorial.demo.Data;

public class Q4 {

	//immutability issue
		//origin of data structure is being altered...
	//In FP, we avoid this issue...
	
	public static void main(String[] args) {
		
		Q4 q = new Q4();
		//q.imp( Data.list ).forEach(System.out::println);
		
		//q.test();
		
		Collections.sort( Data.list );
		
	}
	
	//prior to java 9 - Factory API List.of()
	List<Integer> test(){
		final List<Integer> list = Arrays.asList(
				12,34,21,4,56,77,88,44,885,2,5,7,98,54
		);
		System.out.println("BEFORE SORTING>>>>>");
		list.forEach( e -> System.out.println(e) );
		Collections.sort(list);
		System.out.println("AFTER SORTING>>>>>");
		list.forEach( e -> System.out.println(e) );
		return list;
	}
	//prior to java 9 - Factory API List.of()
	
	//however, after java 9 - with Factory API List.of() checks the collection for immutability
		//so any operation intends to alter the data structure will be caught as Exception
	
	List<Integer> imp( List<Integer> col ){
		//Collections or sorting algorithm ie., bubble/insertion/selection sort
		//jinloong
		List unmodifiableList = Collections.unmodifiableList(col);
		List newList = new ArrayList<>(unmodifiableList);
		Collections.sort( newList ); //sorting operation is performed to the same collection...
		//this function sort() manipulates / mutates the origin structue of the source
		return newList;
	}
	
	//expected function code presents the newly sorted elements are being exported to a new collection
		//it does not introduce immutability issue 
	List<Integer> fun( List<Integer> col ){
		return col.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
	}
	
}
