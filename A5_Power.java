package test;

import java.util.Scanner;

public class A5_Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1=sc.nextInt();
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		int c=(int)Math.pow(n1, n2);
		System.out.println(c);
		

	}

}
