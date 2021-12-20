package tut3.tutorial.demo;

import java.util.List;

public class Q10 {

	//bret
	boolean fun( List<Integer> list ) {
		return list.stream().anyMatch(I -> I %2==0);
	}
	
}