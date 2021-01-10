import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.print("\ninforme os valores do triangulo, para calcular a area\n\n");
		System.out.print("qual eh o valor da altura? ");
		int altura = read.nextInt();
		System.out.print("qual eh o valor da base? ");
		int base = read.nextInt();
		float area = (altura * base) / 2;

		System.out.print("\no valor da area do triangulo eh: " + area);
	}
}