package tut3.demo;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	//In functional java, a collection/array is populated into a stream of elements
		//Stream object provides handy operations to the programming
	
	//3 ways to work with the Stream depending on the data source (arr/collection)
	
	public static void main(String[] args) {
		
		//1)
		Stream<Integer> s1 = Stream.of(12,34,21,4,56,77,88,44,885,2,5,7,98,54);
		s1.forEach( elem -> System.out.println(elem) );
		//2)
		IntStream s2 = Arrays.stream( Data.arr ); //src: arr
		s2.forEach( elem -> System.out.println(elem) );
		//3)
		Stream<Integer> s3 = Arrays.asList(12,34,21,4,56,77,88,44,885,2,5,7,98,54).stream();
		s3.forEach( elem -> System.out.println(elem) );
		//4)
		Stream<Integer> s4 = Data.list.stream();
		s4.forEach( elem -> System.out.println(elem) );
		
	}

}
