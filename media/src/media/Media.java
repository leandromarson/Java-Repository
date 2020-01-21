/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Killer
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escreva N1");
        float n1 = s.nextFloat();
        System.out.println("Escreva N2");
        float n2 = s.nextFloat();
        
        float media = (n1+n2)/2;
        
        System.out.println("Média: "+media);
        
        if(media>9){
            System.out.println("Parabens!");
        }
        
        
        System.out.println("Escreva o ano de nascimento");
        int anoN = s.nextInt();
        int anoA = LocalDate.now().getYear();
        
        int idade= anoA-anoN;
        
        System.out.println("Sua idade é: "+idade);
        
        if(idade>=18){
            System.out.println("Pode dirigir");
        }else{
            System.out.println("Nao pode dirigir");
        }
        
        
    }
    
}
