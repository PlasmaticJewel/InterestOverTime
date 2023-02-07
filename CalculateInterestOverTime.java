
/*
* Nathan Wheeler
* 2/1/23
* CSC-D01-2023sp-128649
* Intro to the Java programming language
* Chapter 2 HW
* nrwheeler2201@student.stcc.edu
* This program will take an amount of money after an investment, and take input of amount of time and the rate of interest, and will output the ammount of money invested.
*/
//Intro
import java.util.Scanner;

public class CalculateInterestOverTime {

	public static void inputphrase(String input) {
		System.out.println("Enter the " + input);
	}

	public static void main(String[] args) {

//Gather inputs

		System.out.println("Welcome to Interest over time calculator!");
		inputphrase("final account value. \n -->");
		Scanner scanner = new Scanner(System.in);
		double output = scanner.nextDouble();
		// System.out.println(output);
		inputphrase("rate of interest in percent \n-->");
		double interest = scanner.nextDouble();
		inputphrase("time in years of the investment");
		double time = scanner.nextDouble(); // in Years

		// Begin calculations
		
		double money;
		money = output / Math.pow(1+interest, time);
		System.out.println(money);
		System.out.println("Thank you for using the investment calculator!");
	}
}