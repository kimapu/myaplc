package aplc.myclass.tutorial3;

import java.util.Arrays;
import java.util.Iterator;

public class Q2 {

	/**
	 * 2.	Search and display an element, ie., 885.
	 */
	
	public static void main(String[] args) {
		//new Q2().imp(Data.arr, 885);
		int elem = new Q2().fun(Data.arr, 1885);
		System.out.println( elem );
	}
	
	void imp( int[] numLst, int target ) 
	{
		//logic-step
		//loop -> if -> show
		for (int i = 0; i < numLst.length; i++) {
			if( numLst[i] == target )
			{
				System.out.println( target ); //sysout introduces side-effect (we wanna avoid)
				break;
			}else {
				System.out.println( "-1" );
			}
		}
	}
	
	int fun( int[] numLst, int target  ) {
		return Arrays.stream(numLst) //for
				.filter( elem -> elem == target) //if
				.findAny() //found
				.orElse(-1); //not found!
	}
	
}
