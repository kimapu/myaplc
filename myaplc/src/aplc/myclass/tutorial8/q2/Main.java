package aplc.myclass.tutorial8.q2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Demo.show( getStudents() );
		
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
