import java.util.Scanner;

public class AreaPerimetro {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.print("\ninforme os valores de um rectangulo para calcular a area e perimetro\n\n");
		System.out.print("qual eh o valor do primeiro lado? ");
		int lado1 = read.nextInt();
		System.out.print("qual eh o valor do segundo lado? ");
		int lado2 = read.nextInt();
		int area = lado1 * lado2;
		int perimetro = 2 * (lado1 + lado2);
		System.out.print("\no valor da area eh: " + area + "\n\n");
		System.out.print("o valor do perimetro eh: " + perimetro);
	}
}