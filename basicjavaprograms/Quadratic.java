package basicjavaprograms;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a,b,c Values  ");// a*x*x + b*x + c.
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		double delta = (b * b) - (4 * a * c);
		double root1 = (double) (-b + Math.sqrt(delta)) / (2 * a);
		double root2 = (double) (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("The two roots of Equation are :" + root1 + " and " + root2);

	}

}