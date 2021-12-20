package aplc.myclass.tutorial3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> lst = Arrays.asList(1,2,3);
		lst.stream().map( elem -> elem ).collect( Collectors.toList() );
		
	}
	
}
