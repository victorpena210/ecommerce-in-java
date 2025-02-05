package methods;

import java.util.Scanner;

public class GreatestCommonDivisor {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("please, enter two numbers separated by space: ");
		String userInput = scanner.nextLine();
		
		String[] inputArgumentsArray = userInput.split("\\s+");
		int number1 = Integer.parseInt(inputArgumentsArray[0]);
		int number2 = Integer.parseInt(inputArgumentsArray[1]);
		System.out.println(gcdRecursive(number1,number2));

	}
	
	public static int gcdRecursive(int a, int b) {
		if(b ==0) {
			return a;
		} else {
			return gcdRecursive(b, a%2);
		}
	}
	

}
