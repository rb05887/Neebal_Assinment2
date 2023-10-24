package test;

import java.util.Scanner;

public class A3_Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the lower bound: ");
		int lowerBound = sc.nextInt();

		System.out.print("Enter the upper bound: ");
		int upperBound = sc.nextInt();

		int first = 0, second = 1, next;

		System.out.println("Fibonacci numbers within the range are:");

		while (first <= upperBound) {
			if (first >= lowerBound) {
				System.out.println(first);
			}
			next = first + second;
			first = second;
			second = next;
		}
	}
}
