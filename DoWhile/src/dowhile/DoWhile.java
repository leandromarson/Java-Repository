/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

import java.util.Scanner;

/**
 *
 * @author Killer
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc=0;
        do{
            System.out.println("XUMPAIRIOMATE!!");
            System.out.println(cc);
            cc++;
        }while(cc<4);
        
        int n, s=0;
        String resp;
        Scanner t = new Scanner(System.in);
        do{
            System.out.print("Digite um numero: ");
            n=t.nextInt();
            s+=n;
            System.out.println("Quer continuar?(S/N) ");
            resp=t.next();
            
        }while(resp.equals("S"));
        System.out.println("A soma de todos os valores é "+s);
        
        
        int c =1;
        do{
            if(c%5!=0) System.out.println(c);
            else break;
            c+=1;
            
        }while(c<=10);
        
        
    }
    
}
