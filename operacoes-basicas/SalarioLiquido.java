import java.util.Scanner;

public class SalarioLiquido {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		System.out.print("SALARIO LIQUIDO DE UM FUNCIONARIO\n\n");

		System.out.print("qual eh o valor da hora por aula? ");
		int valorHora = read.nextInt();
		System.out.print("qual eh o numero de aulas? ");
		int numeroAulas = read.nextInt();
		System.out.print("qual eh o valor percentual de desconto do INSS? ");
		int valorINSS = read.nextInt();
		float salario = valorHora * numeroAulas;
		double desconto = salario * valorINSS / 100;
		double salarioLiquido = salario - desconto;

		System.out.print("\no salario liquido eh: " + salarioLiquido + "\n\n");
	}
}