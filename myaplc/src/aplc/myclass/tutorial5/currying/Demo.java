package aplc.myclass.tutorial5.currying;

import java.util.function.Function;

public class Demo {

	/**
	 * Currying is the process of taking a function that accepts n arguments and turning it into n functions that each accepts a single argument. 
	 * The arity of a function is the number of arguments that it accepts.
	 */
	
	/**
	 * standard-function
	 */
	int mod( int i1, int i2 ) {
		return i1 % i2;
	}
	
	/**
	 * with currying concept...
	 * 	//subset of HoF
	 */
	
	//without lambda
//	Function<Integer, Integer> mod2 (int i1){ //curried-function
//		return new Function<Integer, Integer>()
//		{
//			@Override
//			public Integer apply(Integer i2) {
//				return i1 % i2;
//			}
//		};
//	}
	
	//with lambda
	Function<Integer, Function<Integer, Integer>> mod2 = i1 -> i2 -> i1 % i2;
	
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		/**
		 * Scenario 2
		 */
		int i1 = 9;
		//Function<Integer, Integer> func = demo.mod2(i1); //partial-app, wo lambda
		Function<Integer, Integer> func = demo.mod2.apply(i1); //partial-app, w lambda
		
		//int i2; //yet to be introduced
		
		System.out.println( compute( func ) );
		
		
		/**
		 * Scenario 1
		 */
		//int i1 = 9, i2 = 3;
		//System.out.println( demo.mod(i1, i2) ); 
		//vs
		//System.out.println( demo.mod2(i1).apply(i2) );
		
	}
	
	static int compute( Function<Integer, Integer> func ) {
		int i2 = 3;
		return func.apply(i2);
	}
	
	
}
