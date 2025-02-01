package methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class LargestInteger {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> arrayNumbers = new ArrayList<Integer>();
		
		System.out.println("enter a set of numbers seperated by spaces: ");
		String userResult = scanner.nextLine();
		
		String[] numbers = userResult.split(" ");
		for(String num: numbers) {
			arrayNumbers.add(Integer.parseInt(num));
		}
		
		System.out.println("this is an array of numbers: ");
		System.out.println(arrayNumbers);
		 
		Optional<Integer> max = arrayNumbers.stream()
				.max(Integer::compareTo);
		
		System.out.println(max.get());

	}

}
