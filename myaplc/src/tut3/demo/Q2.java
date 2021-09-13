package tut3.demo;

import java.util.List;
import java.util.stream.Stream;

public class Q2 {

	Integer imp(List<Integer> col, Integer target) {
		// bryan; dennis
		Integer found = null; //local state - introduces local side-effect
		for (int i = 0; i < col.size(); i++) {
			if (col.get(i).equals(target))
			{
				found = target;
				break;
			}
		}
		return found;
	}
	
	Integer fun( List<Integer> col, Integer target ) {
		//dennis
		return col.stream().filter(elem -> elem.equals(target)).findAny().orElse(null);
		
		//break-down the functions in pipeline
//		Stream<Integer> elems = col.stream();
//		Stream<Integer> filter = elems.filter( elem -> elem.equals(target) );
//		return filter.findAny().orElse(null);
		
	}
	
	public static void main(String[] args) {
		Q2 q2 = new Q2();
		Integer result = q2.fun(Data.list, 885);
		System.out.println( result );
	}

}
