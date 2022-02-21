package aplc.myclass.tutorial8.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Coursework {

	/**
	 * function that compute marks multiply 25%
	 */
	public static Function<Integer, Double> mul25 = marks -> marks * 0.25;
	
	/**
	 * 
	 * @return List<Double>
	 */
	public static List<Double> compute( List<Student> studentLst ){
		if ( !studentLst.isEmpty() ) {
			return studentLst.stream()
					.map(student -> Stream.of( student.getMarks() )
								.map( m -> mul25.apply(m) )
								.mapToDouble(Number::doubleValue)
								.sum())
					.collect( Collectors.toCollection( ArrayList :: new ) );
		} else {
			return null;
		}
		
	}
	
	public static Optional<List<Double>> compute2( List<Student> studentLst ) {
		return Optional.of(
					studentLst.stream()
					.map(student -> Stream.of( student.getMarks() )
								.map( m -> mul25.apply(m) )
								.mapToDouble(Number::doubleValue)
								.sum())
					.collect( Collectors.toCollection( ArrayList :: new ) )
				);
	}
	
}
