/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao;

/**
 *
 * @author Killer
 */
public class Repeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc=0;
        
        while(cc<10){
            cc++;
            if(cc==2||cc==3||cc==4){
                continue;
            }
            if(cc==7){
                break;
            }
            System.out.println("CAMBALHOTA:"+cc);
            
            
        }
        
        
        int i = 10;
        long l = 1;
        
        i+=l;
        System.out.println(i);
        
        
        
    }
    
}
