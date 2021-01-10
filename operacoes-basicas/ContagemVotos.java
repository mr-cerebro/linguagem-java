import java.util.Scanner;

public class ContagemVotos {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		System.out.print("\nPRECENTAGEM DE VOTOS!\n\n");

		System.out.print("qual eh o numero de votos em brancos? ");
		int numVotobrancos = read.nextInt();
		System.out.print("qual eh o numero de votos nulos? ");
		int numVotosnulos = read.nextInt();
		System.out.print("qual eh o numero de votos validos? ");
		int numVotosvalidos = read.nextInt();

		int numTotalvotos = numVotobrancos + numVotosnulos + numVotosvalidos;

		double porceBrancos = numVotobrancos * 100 / numTotalvotos;
		double porceNulos = numVotosnulos * 100 / numTotalvotos;
		double porceValidos = numVotosvalidos * 100 / numTotalvotos;

		System.out.print("\no total de votos eh " + numTotalvotos + "\n\n");
		System.out.print("a percentagem de votos em brancos eh " + porceBrancos + "%\n");
		System.out.print("a percentagem de votos nulos eh " + porceNulos + "%\n");
		System.out.print("a percentagem de votos validos eh " + porceValidos + "%\n\n");
	}
}