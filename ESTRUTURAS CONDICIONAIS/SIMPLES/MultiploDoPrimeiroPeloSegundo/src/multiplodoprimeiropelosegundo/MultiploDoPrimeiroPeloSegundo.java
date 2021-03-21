/*
 * Escreva um programa em JAVA que receba dois números inteiros,
 * verifique se o primeiro é múltiplo do segundo e mostre
 * uma mensagem a informar.
 */

package multiplodoprimeiropelosegundo;

import java.util.Scanner;

/**
 *
 * @author Mr Cérebro
 */
public class MultiploDoPrimeiroPeloSegundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor! Digite o primeiro número: ");
        int num1 = teclado.nextByte();
        System.out.print("Por favor! Digite o segundo número: ");
        int num2 = teclado.nextByte();
        System.out.println("================= RESULTADO =================");
        if (num1 % num2 == 0)
            System.out.println("O número " + num1 + " é múltiplo do número " + num2);
        if (!(num1 % num2 == 0))
            System.out.println("O número " + num1 + " não é múltiplo do número " + num2);
            
    }
    
}
