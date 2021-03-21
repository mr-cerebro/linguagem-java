/*
 * Escreva um programa em JAVA que solicite duas letras e
 * informe qual delas aparece primeiro no alfabeto.
 */

package letrasalfabeto;

import java.util.Scanner;

/**
 *
 * @author Mr Cérebro
 */
public class LetrasAlfabeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor! Informe a primeira letra: ");
        char primeiraLetra = teclado.next().charAt(0);
        System.out.print("Por favor! Informe a segunda letra: ");
        char segundaLetra = teclado.next().charAt(0);
        if (primeiraLetra < segundaLetra)
            System.out.println("A letra " + primeiraLetra + " vem primeiro que a letra " + segundaLetra + " no alfabeto");
        else
            System.out.println("A letra " + segundaLetra + " vem primeiro que a letra " + primeiraLetra + " no alfabeto"); 
    }
}
