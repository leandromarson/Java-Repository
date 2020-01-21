/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author Killer
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,p=0,i=0,ac=0,m=0,s=0,qv=0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um numero <br><em>(0 interrompe)</em></html>)",JOptionPane.WARNING_MESSAGE));
        if(n%2==0)
        {
            p++;
        }else{
            i++;
        }
        if(n>100){
            ac++;
        }
        s+=n;
        
        qv++;
        
        }while(n!=0);
        m=s/qv;
        
        JOptionPane.showMessageDialog(null, "<html>Resultado Final<br>----------------<br>Quantidade de Valores inseridos: "+qv+"<br>Total de pares: "+p+"<br>Total de impares: "+i+"<br>Numeros acima de 100: "+ac+"<br>Media: "+m+"</html>");
    }
    
}
