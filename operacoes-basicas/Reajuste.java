import java.util.Scanner;

public class Reajuste {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		System.out.print("informe um numero: ");
		int num = read.nextInt();
		double reajuste = (num + (num * 10 / 100));

		System.out.print("\no valor com reajuste de 10% eh igual a " + reajuste + "\n");
	}
}