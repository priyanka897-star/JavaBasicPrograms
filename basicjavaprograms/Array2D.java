package basicjavaprograms;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int m = scanner.nextInt();// value for row
		System.out.println("Enter Number of Columns: ");
		int n = scanner.nextInt();
		int[][] array = new int[m][n];
		System.out.print("Enter Array Elemets for 2D Array: ");
		for (int i = 0; i < m; i++) // 'i' for rows
		{
			for (int j = 0; j < n; j++) // 'j' is for columns
			{
				// Storing user input in a TwoDimensional Array
				System.out.println(array[m][n]);
				System.out.println("Enter element of array");
				int arrayelement = scanner.nextInt();
				array[i][j] = arrayelement;

			}

		}

	}

}