package basicjavaprograms;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Temperature");
		double temperature = scanner.nextDouble();
		System.out.println("Enter Wind Speed");
		double windSpeed = scanner.nextDouble();
		double windChill;
		if (temperature > 50 && (windSpeed < 3 || windSpeed > 120)) {
			windChill = 35.74 + (0.6215 * temperature) + (((0.4275 * temperature) - 35.75) * Math.pow(windSpeed, 0.16));
			System.out.println("The WindChill value is :" + windChill);
		} else {
			System.out.println("Enter Valid Tempreture or Wind Speed");
		}
	}

}