package tut3.tuples.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.javatuples.Pair;

public class Demo {

	//data-collection
	static List<String> recordLst = Arrays.asList(
			"Bruce,123456",
			"Dory,987654",
			"Gill,654321",
			"Mary,919191"
			);
	
	//TASK-1: write a function that creates a group of pair 
		//according to the recordLst object.
	
	//chonyonglin; chongweihan;
	//imperative coding...
	static List<Pair> createPair( List<String> col ) {
		List<Pair> pairLst = new ArrayList<>();
		for (String rec : col) {
			String[] token = rec.split("\\,");
			pairLst.add( Pair.with( token[0], token[1]) );
		}
		return pairLst;
	}
	
	//functional coding...
	static List<Pair> createPair( List<String> col, String delimiter ){
		return col.stream()
//			.map( rec -> {
//				String[] token = rec.split("\\"+ delimiter);
//				return Pair.with( token[0], Integer.parseInt( token[1] ));
//			})
			//alternatively,
			.map( rec -> Pair.fromCollection( Arrays.asList( rec.split("\\"+ delimiter) ) ))
			.collect( Collectors.toCollection(ArrayList::new) );
	}
	
	public static void main(String[] args) {

		List<Pair> pairs = createPair( recordLst, "," );
		System.out.println( pairs );
	}

}
