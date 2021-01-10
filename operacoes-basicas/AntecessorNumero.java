import java.util.Scanner;

public class AntecessorNumero {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("\ninforme um numero: ");
		int numero = read.nextInt();
		int antecessor = numero - 1;
		System.out.print("\nO antecessor do numero " + numero + " eh o numero " + antecessor);
	}
}