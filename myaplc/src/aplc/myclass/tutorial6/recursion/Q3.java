package aplc.myclass.tutorial6.recursion;

import java.util.concurrent.TimeUnit;

public class Q3 {

	public static void main(String[] args) throws Exception{
		countdown( 5 );
	}
	
	/**
	 * countdown(n) method
	 */

	static void countdown(int n) throws Exception{
		TimeUnit.SECONDS.sleep(1);
		//Thread.sleep(1000);
		if (n == 0) {
			System.out.println("Timeout!");
		} else {
			System.out.println(n);
			countdown(n - 1);
		}
	}

}
