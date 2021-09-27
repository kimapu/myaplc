package tut5.tutorial.demo;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> username = Arrays.asList( 
				"ali", "ahmad", "maria", "john", "derick", "salleh" 
				);
		
		Demo demo = new Demo();
		
		//q2( List<String> username )
		String result = demo.q2(username);
		System.out.println( result );
		
	}
	
}
