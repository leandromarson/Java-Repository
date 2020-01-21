/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritimeticos;

/**
 *
 * @author Killer
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        System.out.println("Media "+m);
    
        int num = 5;
        num++;
        System.out.println(num);
        
        int n = 5;
        int val = 5 + n++;
        System.out.println(val);
        System.out.println(n);
        int nn = 5;
        val = 5 + ++nn;
        System.out.println(val); 
        
        val = 5 + n--;
        System.out.println(val);
        System.out.println(n);
        
        val = 5 + --n;
        System.out.println(val);
        System.out.println(n);
        
        System.out.println("Atribuiçao");
        int a=3;
        int b=4;
        
        a+=b;
        System.out.println(a);
        a-=b;
        System.out.println(a);
        a*=b;
        System.out.println(a);
        a/=b;
        System.out.println(a);
        a%=b;
        System.out.println(a);
        
        System.out.println("classe math");
        
        System.out.println("Arredondamento");
        
        int i = -10;
        System.out.println(Math.abs(i));
        
        System.out.println("Arredondar para baixo");
        
        double j = 3.9;
        System.out.println(Math.floor(j));
        
        System.out.println("Arredondar para cima");
        
        double c = 4.1;
        System.out.println(Math.ceil(c));
        
        System.out.println("Arredondar Aritimeticamente");
        
        double z = 4.3;
        double k = 5.8;
        System.out.println(Math.round(z));
        System.out.println(Math.round(k));
        
        
        System.out.println("Numero random de 0 a 1");
        double rd1 = Math.random();
        System.out.println(rd1);
        
        
        System.out.println("Numero random de 5 a 1000");
        double rd2 = 5+Math.random()*(1000-5);
        System.out.println(rd2);
     
          
        System.out.println(0==0);
        
               
        
        
        
        
        
    }
    
}
