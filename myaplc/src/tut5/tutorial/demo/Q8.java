package tut5.tutorial.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q8 {

	public static void main(String[] args) {

		List<Membership> list = new ArrayList<>();
		list.add(new Membership(100));
		list.add(new Membership(200));
		list.add(new Membership(300));
		list.add(new Membership(400));

		//jianbin
		List<Membership> newList = list.stream()
			.map( elem -> new Membership(elem.point+10) )
			.collect( Collectors.toList() );	
		newList.forEach( System.out :: println );
	}
}

class Membership {
	int point;

	Membership(int pt) {
		this.point = pt;
	}
}
