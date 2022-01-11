package aplc.myclass.tutorial4.purity;

public class Demo {
 
	// purity concept in programming
		// concerns with the function that we made
		// able to guarantee the consistent output...!

	// plus(int, int) : int
	int plus(int i, int j) { // pure function? Yes.
		return i + j;
	}

	// bad example
	private class Multipler {

		int multiplier = 2;

		// mul(double) : double
		double mul(double d) // side effect is being observed becos the external access.
		{
			return d * multiplier;
		}

	}

	public static void main(String[] args) {

		Demo demo = new Demo();

		Multipler mulpr = demo.new Multipler();

		System.out.println( mulpr.mul(2) ); //4
		mulpr.multiplier = 3;
		System.out.println( mulpr.mul(2) ); //6

//		int r1 = demo.plus(10, 20); //30
//		int r2 = demo.plus(10, 20); //30
//		int r3 = demo.plus(10, 20); //30

//		System.out.println( Math.random() );
//		System.out.println( Math.random() );
//		System.out.println( Math.random() );

		
	}

	
}
