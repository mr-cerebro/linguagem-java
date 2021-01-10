import java.util.Scanner;

public class HipotenusaTrianguloRetangulo {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		System.out.print("\nHIPOTENUSA DE UM TRIANGULO RETANGULO!\n\n");

		System.out.print("qual eh o valor do primeiro cateto? ");
		int priCateto = read.nextInt();
		System.out.print("qual eh o valor do segundo cateto? ");
		int segCateto = read.nextInt();

		double hipo = Math.sqrt((priCateto * priCateto) + (segCateto * segCateto));

		System.out.print("\no valor da hipotenusa de um triangulo retangulo eh " + hipo + "\n\n");
	}
}