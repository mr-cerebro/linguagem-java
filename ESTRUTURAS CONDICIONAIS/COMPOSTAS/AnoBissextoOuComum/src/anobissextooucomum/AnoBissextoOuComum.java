/*
 * Implementar um programa em C que verifica se o ano digitado pelo utilizador é comum ou
 * bissexto. Um ano é bissexto se for divisível por 4 (mas não por 100) ou por 400. Por exemplo,
 * 2020 é um ano bissexto; já 2021 é comum.
 */

package anobissextooucomum;

import java.util.Scanner;

/**
 *
 * @author Mr Cérebro
 */
public class AnoBissextoOuComum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em que ano estamos? ");
        int ano = teclado.nextInt();
        if (ano % 4 == 0)
            System.out.println("O ano " + ano + " é bissexto");
        else
            System.out.println("O ano " + ano + " é comum");
    }
    
}
