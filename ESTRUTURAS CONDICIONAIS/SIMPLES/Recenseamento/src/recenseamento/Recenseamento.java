/*
 * Fazer um programa em JAVA que solicita o género e a idade do utilizador.
 * Informar se pode se recensear.
 */

package recenseamento;
import java.util.Scanner;

/**
 *
 * @author Mr Cérebro
 */
public class Recenseamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Por favor! Qual é o género?   ");
        String genero = ler.nextLine();
        System.out.print("Por favor! Quantos anos tens? ");
        int idade = ler.nextByte();
        System.out.println("");
        System.out.println("============= RESULTADO =============");
        System.out.println("Seu género é:    " + genero);
        System.out.println("Sua idade é:     " + idade + " anos");
        if ((genero.equalsIgnoreCase("M")) || (genero.equalsIgnoreCase("Masculino")) && idade >= 18)
            System.out.println("OBS: Podes se recensear!");
        if ((genero.equalsIgnoreCase("M")) || (genero.equalsIgnoreCase("Masculino")) && idade < 18)
            System.out.println("OBS: Não podes se recensear!");
        if ((genero.equalsIgnoreCase("F")) || (genero.equalsIgnoreCase("Feminino")))
            System.out.printf("OBS: Apenas os jovens do género, \nMasculino podem se recensear!\n");
        System.out.println("=====================================");
    }
    
}
