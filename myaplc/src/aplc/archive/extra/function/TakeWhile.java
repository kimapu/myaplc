package extra.function;

import java.util.List;

public class TakeWhile {
	
	public static void main(String[] args) {
		List<String> list = List.of("a", "b", "c", "d", "e");
		
		list.stream()
		        .takeWhile(element -> !element.equals("d"))
		        .forEach(System.out::println);
	}

}
