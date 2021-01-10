import java.util.Scanner;

public class DistEntreDoisPontos {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		System.out.print("\nDISTANCIA ENTRE DOIS PONTOS!\n\n");

		System.out.print("qual eh o valor de x1? ");
		float x1 = read.nextFloat();
		System.out.print("qual eh o valor de x2? ");
		float x2 = read.nextFloat();

		System.out.print("qual eh o valor de y1? ");
		float y1 = read.nextFloat();
		System.out.print("qual eh o valor de y2? ");
		float y2 = read.nextFloat();

		float dist = (float) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.print("\na distancia entre os dois pontos eh: " + dist + "\n");
	}
}