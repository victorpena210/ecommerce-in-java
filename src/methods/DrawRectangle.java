package methods;

import java.util.Scanner;

public class DrawRectangle {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please, enter height of rectangle: ");
		int userInputHeight = scanner.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int userInputWidth = scanner.nextInt();
		
		drawRectangle(userInputHeight,userInputWidth);
	}
	
	public static void drawRectangle(int height, int width) {
		 for (int i = 0; i < width; i++) {

	            System.out.print("*");

	        }

	        System.out.println();



	        // Middle lines

	        for (int i = 1; i < height - 1; i++) {

	            System.out.print("*");

	            for (int j = 0; j < width - 2; j++) {

	                System.out.print(" ");

	            }

	            System.out.println("*");

	        }



	        // Bottom line

	        for (int i = 0; i < width; i++) {

	            System.out.print("*");

	        }

	        System.out.println();

	    }
	}
