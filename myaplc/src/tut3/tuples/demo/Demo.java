package tut3.tuples.demo;

import java.util.Arrays;
import java.util.List;

import org.javatuples.Pair;

public class Demo {

	//data-collection
	static List<String> recordLst = Arrays.asList(
			"Bruce,TP123456",
			"Dory,TP987654",
			"Gill,TP654321",
			"Mary,TP919191"
			);
	
	//TASK-1: write a function that creates a group of pair 
		//according to the recordLst object.
	
	public static void main(String[] args) {

		Pair<String, String> pair1 = Pair.with( "Bruce" , "TP123456" );
		
		
		System.out.println( pair1 );
	}

}
