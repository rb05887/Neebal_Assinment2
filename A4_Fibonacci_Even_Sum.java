package test;

public class A4_Fibonacci_Even_Sum {

	public static void main(String[] args) {
		int count = 10;
		int[] evenFibonacci = new int[count];
		int a = 0, b = 1; 
		for (int i = 0; i < count;) {
			if (a % 2 == 0) {
				evenFibonacci[i] = a;
				i++;
			}
			int next = a + b;
			a = b;
			b = next;
		}
		System.out.println("First 10 even Fibonacci numbers:");
		for (int num : evenFibonacci) {
			System.out.println(num);
		}
	}
}
