package basicjavaprograms;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = scanner.nextInt();
		int isPrime = 0;
		int counter1, counter2;
		for (counter1 = 2; (counter1) <= number; counter1++) {
			if (number % counter1 == 0) {
				isPrime = 1;
				for (counter2 = 2; counter2 <= (counter1 / 2); counter2++) {
					if ((counter1 % counter2) == 0)
						isPrime = 0;
				}
				if (isPrime == 1)
					System.out.println("Prime factor is :" + counter1);

			}
		}
	}
}
