
public class PrintFactorial {
	public static void main(String[] args) {
		// Imprima os fatoriais de 1 a 10
		int fatorial = 1;
		System.out.println("O fatorial de 0 é 1");
		for (int i = 1; i <=10; i++) {
			fatorial *= i;
			System.out.println("O fatorial de " + i + " é " + fatorial);
		}

	}

}
