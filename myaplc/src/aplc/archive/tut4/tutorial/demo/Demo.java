package aplc.archive.tut4.tutorial.demo;

public class Demo {

	//purity concept in programming
		//concerns with the function that we made
		//able to guarantee the consistent output...!
	
	//plus(int, int) : int
	int plus(int i, int j) { //pure function? Yes.
		return i + j;
	}
	
	//bad example
	private class Multipler{
		
		int multiplier = 2;
		
		//mul(double) : double
		double mul( double d ) //side effect is being observed becos the external access.
		{
			return d * multiplier;
		}
				
	}
	
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		Multipler mulpr = demo.new Multipler();
		
//		System.out.println( mulpr.mul(2) ); //4
//		mulpr.multiplier = 3;
//		System.out.println( mulpr.mul(2) ); //6
		
		
//		int r1 = demo.plus(10, 20); //30
//		int r2 = demo.plus(10, 20); //30
//		int r3 = demo.plus(10, 20); //30
		
//		System.out.println( Math.random() );
//		System.out.println( Math.random() );
//		System.out.println( Math.random() );
		
		//trying q7
		int a = 10, b = 20, c = 30, d = 40;
		
		System.out.println( demo.f(a, b, c, d) );
		/**
		 *  Returning 30
			Returning 70
			2100
		 */
//		System.out.println( demo.add(10, 30) );
//		System.out.println( demo.add(10, 30) );
//		System.out.println( demo.add(10, 30) );
	}
	
	
	//q7-referential transparency issue
	int add(int a, int b) { //pure function? Yes.  However, the function has a side effect so impure.
	    int result = a + b;
	    //System.out.println("Returning " + result); //introduces side effect...
	    return result;
	}

	//in this situation, we may make a function that utilise existing function.
	//formula: result = (a+b) * (c+d)
	int f( int a, int b, int c, int d) 
	{
		//return (a+b) * (c+d);
		return (a+b) * add(c, d);
	}
	
	
	
	
	
}
