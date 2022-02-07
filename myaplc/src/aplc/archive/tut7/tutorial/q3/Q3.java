package aplc.archive.tut7.tutorial.q3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3 {

	//generic-function
	public static double sumList( List<? extends Number> lst ) {
		return lst.stream()
				.mapToDouble(Number::doubleValue)
				.sum();
	}
	
	public static void main(String[] args) {
	    List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
	    List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0, 4.0);
	    List<Float> floats = Arrays.asList(1.0f, 2.0f, 3.0f, 4.0f);
	    List<BigDecimal> bigDecimals = Arrays.asList(
	        new BigDecimal("1.0"),
	        new BigDecimal("2.0"),
	        new BigDecimal("3.0"),
	        new BigDecimal("4.0")
	    );
	    System.out.printf("ints sum is %s%n", sumList(ints));
	    System.out.printf("doubles sum is %s%n", sumList(doubles));
	    System.out.printf("floats sum is %s%n", sumList(floats));
	    System.out.printf("bigdecimals sum is %s%n", sumList(bigDecimals));
	}

	
}
