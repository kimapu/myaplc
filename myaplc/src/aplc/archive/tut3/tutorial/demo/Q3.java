package aplc.archive.tut3.tutorial.demo;

import java.util.*;
import java.util.stream.Collectors;

public class Q3 {

	List<Integer> imp(List<Integer> col, int n) { //n=2
		// eugene; bux
		List<Integer> ret = new ArrayList<>();
		for (int i = 0; i < col.size(); i++) {
			ret.add(col.get(i) * n );
		}
		return ret;
	}

	List<Integer> fun(List<Integer> col, int n) {
		//.map & .collect	
		return col.stream()
				.map( elem -> elem * n ) //transform elem to new elem
				.collect( Collectors.toCollection(ArrayList::new) ); //constructor reference
				//.collect( Collectors.toList() );
		
	}

}
