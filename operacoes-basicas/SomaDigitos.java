import java.util.Scanner;

public class SomaDigitos {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		int num = 0, soma = 0;
		System.out.print("\ninsere um numero de 0 a 999: ");
		num = read.nextInt();

		soma += num % 10;
		num /= 10;

		soma += num % 10;
		num /= 10;

		soma+= num % 10;
		num /= 10;

		System.out.print("\na soma dos digitos eh " + soma + "\n");
	}
}