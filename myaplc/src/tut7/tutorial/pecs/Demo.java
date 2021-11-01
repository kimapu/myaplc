package tut7.tutorial.pecs;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	//append()
	static void append( List<? super Double> lst,  double i ) {
		lst.add( i );
	}
	
	//access()
	static void access( List<? extends Number> lst ) {
		lst.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		List<Number> ints = new ArrayList<>();
		append( ints, 100.9 );
		ints.add(200.9);
		//show
		access(ints);
	}
		
	
}
