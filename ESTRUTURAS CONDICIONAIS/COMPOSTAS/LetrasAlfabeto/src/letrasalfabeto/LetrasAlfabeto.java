/*
 * Escreva um programa em JAV que solicite duas letras e
 * informe qual delas aparece primeiro no alfabeto.
 */

package letrasalfabeto;

import java.util.Scanner;
import java.util.stream.IntStream;

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
        System.out.println("Por favor! Informe a primeira letra: ");
        IntStream primeiraLetra = teclado.next().chars();
        
    }
    
}
