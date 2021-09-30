package basicjavaprograms;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int number = scanner.nextInt();
		scanner.close();
		if (number % 2 == 0) {
			System.out.println(" Number is Even");
		} else {
			System.out.println("Number is Odd");
		}
	}

}
