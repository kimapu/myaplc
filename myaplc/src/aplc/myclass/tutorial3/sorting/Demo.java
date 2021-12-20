package aplc.myclass.tutorial3.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	/**
	 * Write a functional code for sorting the name list given as follows. Bruce,
	 * Dory, Gill, Mary
	 */

	public static void main(String[] args) {
		//new Demo().m1();
		new Demo().demo();
	}

	void m1() {

		//functional - Factory method of();
		List<String> elem = List.of("mary", "gill", "dory", "bruce");
		elem.forEach(System.out::println);
		Collections.sort(elem);//imperative-sort introduces unsupported operation becos, immutable collection considered.
		

	}

	
	void demo() {
		// collection for String objects
		List<String> nameLst = Arrays.asList("mary", "gill", "dory", "bruce");
		System.out.println(">>> Original List before sorting...");
		nameLst.forEach(System.out::println);

		// sorted list after invoking the method arrange()...
		List<String> sortLst = new Demo().arrange(nameLst);

		// show elem
		System.out.println(">>> Sorted List...");
		sortLst.forEach(System.out::println);

		System.out.println(">>> Original List after sorting...");
		nameLst.forEach(System.out::println);
	}

	List<String> arrange(List<String> lst) {
		// imperative-sort
		// Collections.sort(lst); //immutability issue raised in turn side-effect...
		// return lst;

		// functional-sort
		return lst.stream().sorted().collect(Collectors.toList());
	}


}
