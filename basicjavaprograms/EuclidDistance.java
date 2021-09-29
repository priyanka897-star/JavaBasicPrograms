package basicjavaprograms;

import java.util.Scanner;

public class EuclidDistance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter X Point");
		int x = scanner.nextInt();
		System.out.println("Enter Y Point");
		int y = scanner.nextInt();
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("The Euclidean distance is :" + distance);
	}

}