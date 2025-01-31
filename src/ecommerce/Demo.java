package ecommerce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	
	public static void main(String[] args) {
		
		
		User user1 = new User();
		System.out.println("user1.getID() = " + user1.getId());
		System.out.println("user1.getCounter() = " + user1.getCounter());

		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		User user2 = new User();
		System.out.println("user2.getId() = " + user2.getId());
		System.out.println("user2.getCounter() = " + user2.getCounter());
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		System.out.println("user1.getCounter() = " + user1.getCounter());
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		User user3 = new User();
		user3.doAnyStaticAction();
		
		
		
		
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
