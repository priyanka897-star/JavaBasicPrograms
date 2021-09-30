package basicjavaprograms;

import java.util.Scanner;

public class LargestNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Three Numbers :");
		final int number1 = scanner.nextInt();
		final int number2 = scanner.nextInt();
		final int number3 = scanner.nextInt();
		scanner.close();
		if (number1 > number2 && number1 > number3) {
			System.out.println("Largest Number is :" + number1);
		} 
		else if (number2 > number1 && number2 > number3) {
			System.out.println("Largest Number is :" + number2);
		} 
		else {
			System.out.println("Largest Number is :" + number3);
		}
	}
}
