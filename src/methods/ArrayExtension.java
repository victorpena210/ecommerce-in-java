package methods;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExtension { 
	
	public static int MULTIPLIER = 2;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please, enter length of initial array: ");
		int baseArrayLength = scanner.nextInt();
		
		int[] randomArray = generateRandomArray(baseArrayLength);
		
		for(int i = 0; i < randomArray.length; i++) {
			System.out.println(randomArray[i]);
		}
		
		randomArray = extendArray(randomArray);
		
		System.out.println("*************");
		
		for(int i = 0; i < randomArray.length; i++) {
			System.out.println(randomArray[i]);
		}
		
		
		

	}
	
	public static int[] extendArray(int[] arr) {
		int newArrayLength = arr.length*2;
		int[] resultArray = Arrays.copyOf(arr, newArrayLength);
		for(int i = arr.length; i < newArrayLength; i++) {
			 resultArray[i] = arr[i-arr.length] * MULTIPLIER;
		}
	
		return resultArray;
		
	}
	

	
	
	
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
