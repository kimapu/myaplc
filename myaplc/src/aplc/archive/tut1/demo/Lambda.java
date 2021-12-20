package tut1.demo;

import java.util.function.Function;

public class Lambda {

	public Lambda() {
		// TODO Auto-generated constructor stub
	}

	//increment(int) returns int
	//lambda expression for the normal function that we made
	//inherently, an function object.
	Function<Integer, Integer> increment = i -> i + 1;
	//equivalent
//	int increment( int i ) {
//		return i + 1;
//	}
	
	public static void main(String[] args) {
	
		Lambda l = new Lambda();
		
		System.out.println( l.increment.apply(10) );//11
		
	}
	
	
}
