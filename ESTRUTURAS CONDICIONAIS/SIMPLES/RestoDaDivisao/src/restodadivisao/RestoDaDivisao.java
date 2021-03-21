/*
 * Implemente um programa em C que receba dois números inteiros,
 * calcule o resto da divisão inteira do número maior
 * pelo número menor e imprima o resultado.
 */

package restodadivisao;
import java.util.Scanner;

/**
 *
 * @author Mr Cérebro
 */
public class RestoDaDivisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor! Qual é o primeiro número?    ");
        int num1 = teclado.nextByte();
        System.out.print("Por favor! Qual é o segundo número?     ");
        int num2 = teclado.nextByte();
        if (num1 > num2){
            int resto = num1 % num2;
            System.out.println("O resto da divisão de " + num1 + " com " + num2 + " é igual a " + resto);
        }
        if (num2 > num1){
            int resto = num2 % num1;
            System.out.println("O resto da divisão de " + num2 + " com " + num1 + " é igual a " + resto);
        }
    }
    
}
