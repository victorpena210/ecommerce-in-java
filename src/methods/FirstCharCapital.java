package methods;

import java.util.Scanner;

public class FirstCharCapital {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("please, enter any text: ");
		String userInput = scanner.nextLine();
		
		System.out.println(firstCharToTitleCase(userInput));
	}
	
	public static String firstCharToTitleCase(String string){
		
		return string.substring(0,1).toUpperCase() + string.substring(1);
		
	}

}
