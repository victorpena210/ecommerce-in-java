package methods;

import java.util.Scanner;

public class SumDigitsInNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("please,enter integer: ");
		int number = scanner.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);

	}
	
	public static int sumDigitsInNumber(int x) {
		int sumOfDigits = 0;
		String numberString = String.valueOf(x);
		String[] digits = numberString.split("");
		
		for(String digit : digits) {
			sumOfDigits +=Integer.parseInt(digit);
		}
		return sumOfDigits;
	
		
	}
	

}
