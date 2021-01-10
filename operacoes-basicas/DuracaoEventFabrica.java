import java.util.Scanner;

public class DuracaoEventFabrica {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		System.out.print("\nDURACAO DE EVENTOS DE UMA FABRICA!\n\n");

		System.out.print("digite o tempo em segundos: ");
		int temp = read.nextInt();

		int hh = temp / 3600;
		int mm = (temp % 3600) / 60;
		int ss = (temp % 3600) % 60;

		System.out.print("\no evento durou: " + hh + ":" + mm + ":" + ss + "\n\n");
	}
}