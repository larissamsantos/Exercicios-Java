
public class PrintFibonacci {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1 + "\n" + num2);
		for (int i=1; num2<=1000; i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			System.out.println(num2);
		}

	}
}
