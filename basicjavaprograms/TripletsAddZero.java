package basicjavaprograms;

import java.util.Scanner;

public class TripletsAddZero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of an array :");
		int arrayLength = scanner.nextInt();
		int mainArray[] = new int[arrayLength];
		int c;
		for (c = 0; c < arrayLength; c++) {
			System.out.println("Enter element of array :");
			mainArray[c] = scanner.nextInt();
		}
		findTriplets(mainArray, arrayLength);

	}

	public static void findTriplets(int[] array, int n) {
		boolean isfound = false;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						isfound = true;
						System.out.println("The Triplets are :" + array[i] + " " + array[j] + " " + array[k]);
					}
				}
			}
		}
		if (isfound == false)
			System.out.println(" not exist ");

	}
}
