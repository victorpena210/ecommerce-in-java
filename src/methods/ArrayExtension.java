package methods;

import java.util.Random;
import java.util.Scanner;

public class ArrayExtension {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please, enter length of initial array: ");
		int baseArrayLength = scanner.nextInt();
		
		int[] randomArray = generateRandomArray(baseArrayLength);
		
		for(int i = 0; i < randomArray.length; i++) {
			System.out.println(randomArray[i]);
		}
		
		

	}
	
//	public static int[] extendArray(int[] arr) {
//		
//		
//	}
	
	
	public static int[] generateRandomArray(int amountOfElements) {
int[] fillArray = new int[amountOfElements];
		
		for(int i = 0; i < amountOfElements; i++ ) {
			Random random = new Random();
			int randomNumber = random.nextInt(100) + 1;
		
			fillArray[i] = randomNumber;
		
		}
		System.out.println();
		return fillArray;
		
		
	}

}
