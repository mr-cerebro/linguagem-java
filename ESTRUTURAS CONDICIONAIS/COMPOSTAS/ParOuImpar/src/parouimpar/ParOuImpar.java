/*
 * Implemente um programa em JAVA que receba um número
 * inteiro e informe se o mesmo é par ou ímpar.
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
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor! Digite um número: ");
        int numero = teclado.nextByte();
        System.out.println("========== RESULTADO ==========");
        if (numero % 2 == 0)
            System.out.println("O número " + numero + " é PAR!");
        else
            System.out.println("O número " + numero + " é ÍMPAR!");
    }
    
}
