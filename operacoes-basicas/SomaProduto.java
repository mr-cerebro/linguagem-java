import java.util.Scanner;

public class SomaProduto {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		System.out.print("qual eh o primeiro numero? ");
		int n1 = read.nextInt();
		System.out.print("qual eh o segundo numero? ");
		int n2 = read.nextInt();
		int produto = n1 * n2;
		int soma = n1 + produto;
		System.out.println("o produto do " + n1 + " com " + n2 + " eh igual a " + produto);
		System.out.println("a soma do " + n1 + " com " + produto + " eh igual a " + soma);
	}
}