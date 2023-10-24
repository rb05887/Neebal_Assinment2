package test;

import java.util.Scanner;

public class A2_Coordinate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the x-coordinate: ");
		double x = sc.nextDouble();
		System.out.print("Enter the y-coordinate: ");
		double y = sc.nextDouble();
		if (x > 0 && y > 0) {
			System.out.println("Ist Quadrant");
		} else if (x < 0 && y > 0) {
			System.out.println("IInd Quadrant");
		} else if (x < 0 && y < 0) {
			System.out.println("IIIrd Quadrant");
		} else if (x > 0 && y < 0) {
			System.out.println("IVth Quadrant");
		} else if (x==0) {
			System.out.println("Yaxis");
		}else if(y==0) {
			System.out.println("Xaxis");
		}else {
			System.out.println("Invalid entry");
		}
	}
}
