package fibonacci;

public class Fibonacci {

	public Fibonacci(int maximo) {
		int numero = 0;
		int proximo_numero = 1;
		int auxiliar;

		while (numero <= maximo) {
			System.out.println(numero + ", ");
			auxiliar = proximo_numero;
			proximo_numero = proximo_numero + numero;
			numero = auxiliar;
		}
	}

}
