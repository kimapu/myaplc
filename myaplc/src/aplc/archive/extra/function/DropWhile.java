package aplc.archive.extra.function;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DropWhile {
	
	public static void main(String[] args) {
		
		List<String> list = List.of("a", "b", "c", "d", "e");
		
		list.stream()
		        .dropWhile(element -> !element.equals("d"))
		        .forEach(System.out::println);
		
	}

}
