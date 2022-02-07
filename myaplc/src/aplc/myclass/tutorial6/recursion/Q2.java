package aplc.myclass.tutorial6.recursion;

public class Q2 {
	
	public static void main(String[] args) {
		fib( 12, 0, 1 );
		System.out.println();
		System.out.println( fac( 5 ) );
	}

	/**
	 * the Fibonacci number 
	 */
	public static void fib(int count, Integer previousNumber, Integer nextNumber) {
	    if (count > 0) {
	        System.out.print(previousNumber + (count == 1 ? "" : ", "));

	        int sumOfPrevTwo = previousNumber + nextNumber;
	        previousNumber = nextNumber;
	        nextNumber = sumOfPrevTwo;
	        fib(count - 1, previousNumber, nextNumber);
	        return;
	    }
	    System.out.println();
	}
	
	
	/**
	 * the Factorial number
	 */
	static int fac(int x){
	    if(x != 1){
	        return x * fac(x-1);
	    }
	    return x;
	}
}
