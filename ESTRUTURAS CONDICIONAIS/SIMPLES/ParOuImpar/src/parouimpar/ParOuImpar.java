/*
 * Implemente um programa em JAVA que peça ao utilizador um número inteiro,
 * verifique se ele é par ou ímpar e mostre uma mensagem com esta informação.
 */

package parouimpar;
import java.util.Scanner;

/**
 *
 * @author Mr Cérebro
 */
public class ParOuImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        System.out.print("Por favor! Insira um valor: ");
        int num = ler.nextInt();
        if (num % 2 == 0)
            System.out.println("O número " + num + " é PAR!");
        if (num % 2 == 1)
            System.out.println("O número " + num + " é ÍMPAR!");
    }
    
}
