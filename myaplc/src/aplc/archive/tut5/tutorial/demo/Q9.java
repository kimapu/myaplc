package aplc.archive.tut5.tutorial.demo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Q9 {

	public static void main(String[] args) throws Exception{
		
		String fn = "src/tut5/units.txt";
		
		m1(fn);
		
		m2(fn);
		
	}
	
	//zhenyie
	static void m2( String fileName ) throws Exception{
		Path filePath = Paths.get( fileName );
		int sum = Files.readAllLines(filePath)
				.stream()
				.mapToInt(Integer::parseInt) //convert to IntStream
				.sum();
		System.out.println( "Sum: "+ sum );
	}
	
	//jianbin
	static void m1( String fileName ) throws Exception{
		int sum = Files.readAllLines( Paths.get( fileName ))
			.stream()
			.map(Integer::parseInt) //convert to the primitive int
			.reduce(0, Integer::sum);
			//.reduce(0, (e1, e2) -> e1 + e2);
		System.out.println( "Sum: "+ sum );
	}
	
}
