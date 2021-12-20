package aplc.myclass.tutorial3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q1 {

	/**
	 * 1.	Iterate and display through all elements of array list
	 */
	
	//imperative coding
	void imp(){
		int[] numLst = Data.arr;
		//show
		//loop -> printout
		for (int i : numLst) {
			System.out.print( i +" " );
		}
	}
	
	//functional coding
	void fun(){
		int[] numLst = Data.arr;
		//stream of elements - stream()
		//IntStream stream = Arrays.stream(numLst);
		//stream.forEach( System.out :: println ); //method-reference
		//shorthand, 
		Arrays.stream(numLst).forEach( elem -> System.out.print( elem + " " ) ); //lambda-expr
		
	}
	
}
