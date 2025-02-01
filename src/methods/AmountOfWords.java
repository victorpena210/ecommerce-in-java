package methods;


import java.util.Scanner;

public class AmountOfWords {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("please, enter any text: ");
		
		String userInput = scanner.nextLine();
		
		System.out.println();
		
		System.out.println(getWordsAmount(userInput));
		
	}
	
	private static int getWordsAmount(String text) {
		int counter = 0;
		
		String[] userSentence = text.split(" ");
		for(String word: userSentence) {
			counter++;
		}
		System.out.println("counter test: " + counter);
		return counter;
	}
	

	

}
