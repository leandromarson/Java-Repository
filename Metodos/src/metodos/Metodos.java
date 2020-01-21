/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Killer
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    static void soma(int a,int b){
        int s = a+b;
        System.out.println("A soma é: "+s);
    }
    
    static int somar(int a,int b){
        int s = a+b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicio pelo MAIN");
        soma(5023,4872);
        
        int sm = somar(57,12);
        System.out.println("A soma com return é: "+sm);
        
        System.out.println("Objetos");
        
        Operacoes s = new Operacoes();        
        System.out.println(s.contador(5, 15));
       
        
    }
    
}
