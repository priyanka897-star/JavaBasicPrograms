package basicjavaprograms;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		int heads = 0;
		int tails = 1;
		int counter = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of  how  many Times you want to Flip coin :");
		int noOfFlips = scanner.nextInt();
		if (noOfFlips >= 0) // if noOfFlips are positive then the Program will execute
		{
			while (counter != noOfFlips) {
				counter++;
				int random = (int) Math.floor(Math.random() * 2);
				if (random == 0)
					tails++;
				else
					heads++;
			}
			System.out.println("Number of Times Heads comes :" + heads);
			System.out.println("Number of Times Tails comes :" + tails);
			double tailsPercentage = (double) tails / noOfFlips * 100;
			double headsPercentage = (double) heads / noOfFlips * 100;
			System.out.println("Heads Percentage is :" + headsPercentage);
			System.out.println("Tails Percentage is :" + tailsPercentage);
		}

		else {
			System.out.println("Enter Positive Number");
		}
	}
}