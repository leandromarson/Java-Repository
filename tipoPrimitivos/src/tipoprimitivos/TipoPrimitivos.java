/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoprimitivos;

import java.util.Scanner;

/**
 *
 * @author Killer
 */
public class TipoPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome");
        String nome = s.nextLine();
        System.out.println("Digite a nota");
        float nota = s.nextFloat();
        System.out.println("Digite a idade");
        int idade = s.nextInt();
        String valor = Integer.toString(idade);
        String val1 = "30";
        
        int inteiro = Integer.parseInt(val1);
        float real = Float.parseFloat(val1);
        
        
        System.out.println("A nota é "+nota);
        System.out.printf("A nota de %s é %.2f e a idade e %d\n",nome,nota,idade);
        System.out.println(valor);
        System.out.println(inteiro);
        System.out.printf("%.2f",real);
        
        
    }
    
}
