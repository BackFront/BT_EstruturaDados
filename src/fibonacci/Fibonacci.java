package fibonacci;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {

		int n;
		System.out.println("Digite um número: ");

		@SuppressWarnings("resource")
		Scanner f = new Scanner(System.in);
		n = f.nextInt();

		for (int i = 0; Fibo(i) < n; i++) {

			System.out.println(Fibo(i));
		}

	}

	public static int Fibo(int n) {
		if (n < 2) {
			return n;
		} else {
			return Fibo(n - 1) + Fibo(n - 2);
		}
	}
}
