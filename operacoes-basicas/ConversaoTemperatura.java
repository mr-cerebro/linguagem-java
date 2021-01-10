import java.util.Scanner;

public class ConversaoTemperatura {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		System.out.print("Conversao de Temperatura: Graus Celsius => Graus Fahrenheit\n\n");

		System.out.print("qual eh o valor da temperatura em graus celsius? ");
		int grausCelsius = read.nextInt();

		double grausFahrenheit = (9 * grausCelsius / 5 + 32);

		System.out.print("\na temperatura em Graus Fahrenheit eh: " + grausFahrenheit + "\n\n");
	}
}