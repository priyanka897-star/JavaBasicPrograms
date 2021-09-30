package basicjavaprograms;

import java.util.Scanner;

public class LeepYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Year :");
		int year = scanner.nextInt();
		final int LOWERLIMIT = 1000;
		final int UPPERLIMIT = 9999;
		scanner.close();
		if (year >= LOWERLIMIT && year <= UPPERLIMIT)
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				System.out.println(year + " is a Leap Year");
			else
				System.out.println(year + " is not a Leap Year");

		else
			System.out.println("Enter 4 Digit number for Year ");

	}
}
