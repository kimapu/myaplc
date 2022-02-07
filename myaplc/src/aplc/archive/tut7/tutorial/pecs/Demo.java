package aplc.archive.tut7.tutorial.pecs;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	//PECS - Producer extends, Consumer super
	
	//append()
	//? super Double == any unknown-type is a supertype of Double
	static void append( List<? super Double> lst,  double i ) { //set
		lst.add( i );
	}  
	
	//access()
	//? extends Number == any unknown-type is-a-kind-of Number type
	static void access( List<? extends Number> lst ) { //get
		lst.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		List<Number> ints = new ArrayList<>();
		append( ints, 100.9 );
		ints.add(200);
		//show
		access(ints);
	}
		
	
}
