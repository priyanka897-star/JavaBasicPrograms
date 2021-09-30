package basicjavaprograms;

import java.util.Scanner;

public class PrimeFactors {

	public static void Find_PrimeFactor(int Number) {
         
		int i, count = 0;
		for (i = 2; i <= Number / 2; i++) {
			if (Number % i == 0) {
				count++;
				Number /= i;
			}
		}
		if (Number != 1 && count == 0) {
			System.out.println(Number);
         }

	}

	public static void Find_Factors(int Number) {
		int i;

		for (i = 1; i < Number; i++) {
			if (Number % i == 0) {
				// Calling Find_Prime Function for every factor
				Find_PrimeFactor(i);
			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Please Enter any number to Find it's Prime Factors :  ");
		int Number = scanner.nextInt();
		scanner.close();
		System.out.println("\n Prime Factors of a Given Number are : \n");
		Find_Factors(Number);

	}
}
