/*
 * Escreva um programa em JAVA que peça um valor inteiro,
 * verifique se é divisível por 3.
 */

package divisivelportres;
import java.util.Scanner;

/**
 *
 * @author Mr Cérebro
 */
public class DivisivelPorTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor! Digite um valor:     ");
        int num = teclado.nextByte();
        if (num % 3 == 0)
            System.out.println("O número " + num + " é divisível por 3");
        if (!(num % 3 == 0))
            System.out.println("O número " + num + " não é divisível por 3");
    }
    
}
