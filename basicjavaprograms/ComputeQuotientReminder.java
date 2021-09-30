package basicjavaprograms;

import java.util.Scanner;

public class ComputeQuotientReminder {

	public static int ComputeQuotient(int dividend, int divider) {
		int quotient = dividend / divider;
		return quotient;
	}

	public static int ComputeReminder(int dividend, int divider) {

		int remainder = dividend % divider;
		return remainder;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Dividend");
		final int dividend = scanner.nextInt();
		System.out.println("Enter a Divider");
		final int divider = scanner.nextInt();
		scanner.close();
		System.out.println("Quotient is " + ComputeQuotient(dividend, divider));
		System.out.println("Remainder is " + ComputeReminder(dividend, divider));
	}

}