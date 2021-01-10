import java.util.Scanner;

public class Desconto {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		System.out.print("Desconto de 9% de qualquer compra efetuada!\n\n");

		System.out.print("qual eh o valor da compra? ");
		int compra = read.nextInt();
		double desconto = (compra - (compra * 9 / 100));

		System.out.print("\no novo valor da compra com desconto de 9% eh igual a " + desconto + "\n");
	}
}