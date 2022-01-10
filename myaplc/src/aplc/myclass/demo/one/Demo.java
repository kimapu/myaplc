package aplc.myclass.demo.one;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo");
		//findNemo(names);
		
		System.out.println( ( find(names) != null ) ? "Found Nemo" : "Not found!" ); 
	}

	/**
	 * In FP, we rewrite the function
	 */
	public static String find( List<String> names ) { //pure function
		return names.stream() //for iteration
				.filter( name -> name.equals("Nemo") ) //lambda
				.findAny().orElse(null);
	}
	
	/**
	 * Imperative coding...
	 */
	public static void findNemo(List<String> names) { //Result: impure function
		boolean found = false; //In FP, this introduces local side-effect
		for (String name : names) {
			if (name.equals("Nemo")) {
				found = true;
				break;
			}
		}

		if (found)
			System.out.println("Found Nemo"); //In FP, this introduces side-effect
		else
			System.out.println("Sorry, Nemo not found");
	}

}
