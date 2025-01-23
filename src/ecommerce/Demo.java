package ecommerce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	
	public static void main(String[] args) {
		
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		Stream<Integer> numberStream = numbers.stream();
		
		System.out.println(numbers.stream());
		
		
		
		List<String> names = Arrays.asList("Alice", "bob", "Charlie", "david");
		List<String> filteredNames = names.stream()
			    .filter(name -> name.startsWith("C"))
			    .collect(Collectors.toList());
		System.out.println(filteredNames);
		
		
		
	}


}
