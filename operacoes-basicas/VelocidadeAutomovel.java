import java.util.Scanner;

public class VelocidadeAutomovel {
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.print("Informe a velocidade em Km/h\n\n");
		System.out.print("qual eh a velocidade do automovel? ");
		float velocidade = read.nextFloat();
		double vel = velocidade / 3.6;
		System.out.print("\na velocidade do automovel em m/s eh: " + vel + "\n"); 
	}
}