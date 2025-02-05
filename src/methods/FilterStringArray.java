package methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterStringArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please, enter random words with spaces: ");
		String userInput = scanner.nextLine();
		System.out.print("Please, enter min number of letters: ");
		int userMinInput = scanner.nextInt();
		



		filterWordsByLength(userMinInput, userInput);
		System.out.println(filterWordsByLength(userMinInput, userInput));
		
	}
	
	public static List<String> filterWordsByLength(int minLength, String string) {
		Scanner scanner = new Scanner(System.in);
		
		List<String> filteredArray = new ArrayList<String>();
		
		
		String[] words = string.split(" ");
		for(String word: words) {
			if(word.length() >= minLength) {
			filteredArray.add(word);
			}
		}
	return filteredArray;
		

	}	


}
