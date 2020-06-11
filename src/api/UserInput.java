package api;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		System.out.println("Please enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int total = num1 + num2;
		System.out.println("Addition of two numbers: " + num1+ " and "+ num2 + " is " + total);
		sc.close();

	}

}
