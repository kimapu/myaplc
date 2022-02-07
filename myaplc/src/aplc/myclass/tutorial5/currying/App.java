package aplc.myclass.tutorial5.currying;

import java.util.function.Function;

public class App {

	static Coursework cw = new Coursework();
	
	public static void main(String[] args) {
		
		//dummy function design becos the assessment can be done in different occasion...
		Function<Double, Double> test = doFinal( doTest1() );

		System.out.println("\n>>> Compiling marks...");
		
		System.out.println( "Coursework marks: "+ cw.compile(test, 0) );
		
	}
 	
	static Function<Double, Function<Double, Double>> doTest1() {
		System.out.println( ">>> performing Class Test 1..." );
		return App.cw.performTst1(77);
		//alternatively, the returing obj can be persisted in binary file...
	}
	
	static Function<Double, Double> doFinal( Function<Double, Function<Double, Double>> func ) {
		System.out.println( ">>> performing Class Test 2..." );
		return App.cw.performTst2(func, 88.0);
		//alternatively, the returing obj can be persisted in binary file...
	}
	
}

class Coursework{
	
	private Function<Double, Function<Double, Function<Double, Double>>> computeCW =
			tst1 -> tst2 -> extra -> tst1 + tst2 + extra;
	
	Function<Double, Function<Double, Double>> performTst1(double marks){
		return computeCW.apply(marks);
	}
	
	Function<Double, Double> performTst2( Function<Double, Function<Double, Double>> func, double marks ){
		return func.apply(marks);
	}
	
	double compile( Function<Double, Double> func, double marks ) {
		return func.apply(marks);
	}
}