package aplc.myclass.tutorial3;

import java.util.Arrays;
import java.util.Iterator;

public class Q2 {

	/**
	 * 2.	Search and display an element, ie., 885.
	 */
	
	void imp( int[] numLst, int target ) 
	{
		//logic-step
		//loop -> if -> show
		for (int i = 0; i < numLst.length; i++) {
			if( numLst[i] == target )
			{
				System.out.println( target ); //sysout introduces side-effect (we wanna avoid)
				break;
			}
		}
	}
	
	int fun( int[] numLst, int target  ) {
		return Arrays.stream(numLst).filter( elem -> elem == target).findAny().orElse(-1);
//		for (int i = 0; i < numLst.length; i++) { //stream
//			if( numLst[i] == target ) //Stream.filter()
//			{
//				System.out.println( target ); //return result
//				break;
//			}
//		}
	}
	
}
