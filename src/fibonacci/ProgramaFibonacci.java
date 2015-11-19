package fibonacci;

import java.util.Scanner;

public class ProgramaFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner lerdados = new Scanner(System.in);
		
		System.out.println("Digite o maximo: ");
		int max = lerdados.nextInt();
		
		new Fibonacci(max);

	}

}


