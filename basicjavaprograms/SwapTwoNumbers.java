package basicjavaprograms;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number 1 value");
		int number1 = scanner.nextInt();
		System.out.println("Enter Number 2  value");
		int number2 = scanner.nextInt();
		System.out.println("Before Swap");
		System.out.println("Number 1 = " + number1);
		System.out.println("Number 2 = " + number2);
		int temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("After swap");
		System.out.println("Number 1 = " + number1);
		System.out.println("Number 2 = " + number2);
	}

}
