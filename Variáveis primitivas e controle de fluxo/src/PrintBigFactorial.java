
public class PrintBigFactorial {

	public static void main(String[] args) {
		// Testando tipos de vari�vel
		int fatorial = 1;
		System.out.println("O fatorial de 0 � 1");
		for (int i = 1; i <=20; i++) {
			fatorial *= i;
			System.out.println("O fatorial de " + i + " � " + fatorial);
		}
		//Aqui d� erro pois o resultado � maior do que o comportado por int
		
		long fatorialLong = 1;
		System.out.println("O fatorial de 0 � 1");
		for (int i = 1; i <=20; i++) {
			fatorialLong *= i;
			System.out.println("O fatorial de " + i + " � " + fatorialLong);
		}
		//N�o d� mais erro
		
		long fatorialLonger = 1;
		System.out.println("O fatorial de 0 � 1");
		for (int i = 1; i <=30; i++) {
			fatorialLonger *= i;
			System.out.println("O fatorial de " + i + " � " + fatorialLonger);
		}
		//Volta a dar erro pois os resultados tem mais bytes que os comportados pelo tipo long


	}

}
