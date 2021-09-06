package tut3.demo;

import java.util.*;

public class Q1 {

	//2 demo code 1) imperative; 2) functional
	
	//imp()
	void imp( List<Integer> col ) {
		//for
		for (int i = 0; i < col.size(); i++) {
			System.out.println( col.get(i) );
		}
	}
	
	//fun()
	void fun( List<Integer> col ) {
		col.stream()
			.forEach( elem -> System.out.println( elem ) );
	}
	
//	void fun( int[] arr ) {
//		arr.stream()
//			.forEach( elem -> System.out.println( elem ) );
//	}
	
	public static void main(String[] args) {
	
		Q1 q = new Q1();
		//q.imp( Data.list );
		q.fun( Data.list );
	
	}

}
