/*
 * Escreve um programa em JAVA que recebe três notas referentes às provas do aluno. Calcular a
 * média e informar se o aluno aprovou, caso a média seja maior ou igual a 9,5, ou se reprovou,
 * caso contrário.
 */

package notasdealuno;

import java.util.Scanner;

/**
 *
 * @author Mr Cérebro
 */
public class NotasDeAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor! Informe a primeira nota: ");
        int primeiraNota = teclado.nextByte();
        System.out.print("Por favor! Informe a segunda nota: ");
        int segundaNota = teclado.nextByte();
        System.out.print("Por favor! Informe a terceira nota: ");
        int terceiraNota = teclado.nextByte();
        float media = ((primeiraNota + segundaNota + terceiraNota) / 3);
        System.out.println("Média: " + media);
        if (media >= 9.5)
            System.out.println("Aluno aprovou!");
        else
            System.out.println("Aluno reprovou!");
    }
    
}
