/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Killer
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = new int[4];
        n[0]=3;
        n[1]=5;
        n[2]=8;
        n[3]=9;
        int x[] = {2,4,7,6,3,5,1,0};
        
        System.out.println("Total de casas de N: "+n.length);
        System.out.println("Total de casas de X: "+x.length);
        for(int c = 0;c<n.length;c++){
            System.out.print(n[c]);
            
        }
        System.out.println("");
        for(int c = 0;c<x.length;c++){
            System.out.print(x[c]);
            
        }
        System.out.println("");
        
        
        String mes[]={"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int tot[]={31,28,31,30,31,30,31,31,30,31,30,31};
        
        int ano = new Date().getYear();
        if(ano%4==0){
            tot[1]=29;
        }
        
        
        for(int c=0;c<mes.length;c++){
            System.out.println("O mes de "+mes[c]+" tem "+tot[c]+" dias");
            
        }
        System.out.println("");
        int vet[]= {3,2,1,5,6,7,8,3,9,7};
        Arrays.sort(vet);//ordena os vetores
        
        for(int vetor:vet){
            System.out.println(vetor);
        }System.out.println("");
        int posicao = Arrays.binarySearch(vet, 5);
        System.out.println("O valor 5 esta na posicao: "+posicao);
        
        System.out.println("");
        int num[]= new int[100];
        Arrays.fill(num, 100);
        for(int valor:num){
            System.out.print(valor+" ");
        }
    }
    
}
