/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author Killer
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=443,n2=8,rb,r;
        
        rb=n1>n2?0:1;
        r=n1>n2?n1+n2:n1-n2;
        System.out.println(rb);
        System.out.println(r);
        
        System.out.println(5>4);
        System.out.println(3<2);
        System.out.println(5>=5);
        System.out.println(6<=20);
        System.out.println(33==33);
        System.out.println(2!=2);
        
        String str = "OLOKO";
        String str2 = "OLOKO";
        String str3 = new String("OLOKO");//estrutura diferente
        String res;
        
        res= str==str2?"igual":"diferente";
        System.out.println(res);
        System.out.println(str==str3);
        System.out.println(str.equals(str3));//funciona
        
        //tabela da vdd
        
        boolean p=true,q=false;
        
        System.out.println(p&&q);
        System.out.println(p||q);
        System.out.println(p^q);
        System.out.println(p&&!q);
        
        boolean s;
        int a=0,b=0;
        s=a==0&&b==0;
        
        
        System.out.println(s);
        
        
        
        
        
        
       
       
        
        
        
        
        
        
    }
    
}
