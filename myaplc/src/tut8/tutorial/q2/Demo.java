package tut8.tutorial.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Demo {

	
	public static void main(String[] args) {
		
		List<Student> studentLst = getStudents();
		
		/**
		 * NullPointerException is concerned so Optional is a trick!
		 */
//		Optional.ofNullable( Coursework.compute(studentLst) ).ifPresentOrElse(
//				elem -> elem.forEach( e -> System.out.println(Math.round(e)) ), 
//				() -> System.out.println("No marks!") );
		
		Coursework.compute2( studentLst ).ifPresentOrElse(
				elem -> elem.forEach( e -> System.out.println(Math.round(e)) ), 
				() -> System.out.println("No marks!")
				);
		
		//alternatively, 
//		List<Double> ml = null;
		//1)
//		if( ml != null ) {
//			ml.forEach( e -> System.out.println(Math.round(e)) );
//		}
		//2)
		//Optional.ofNullable(ml).ifPresent( elem -> elem.forEach( e -> System.out.println(Math.round(e)) ) );
		
	}
	
	static List<Student> getStudents(){
		List<Student> lst = new ArrayList<>();
		lst.add( new Student(new Integer[] {23,56,76,76}) );
		lst.add( new Student(new Integer[] {43,61,66,78}) );
		lst.add( new Student(new Integer[] {12,56,87,78}) );
		lst.add( new Student(new Integer[] {67,23,87,76}) );
		return lst;
	}
	
}
