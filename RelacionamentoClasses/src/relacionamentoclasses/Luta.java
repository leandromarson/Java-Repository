
package relacionamentoclasses;

import java.util.Random;


public class Luta implements LutaInterface {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    
    
    
    
    

    private Lutador getDesafiado() {
        return desafiado;
    }

    private void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    private Lutador getDesafiante() {
        return desafiante;
    }

    private void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    private int getRounds() {
        return rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    private boolean isAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
    
   
    @Override
    public void lutar() {
        if(this.isAprovada()){
            this.getDesafiado().apresentar();
            this.getDesafiante().apresentar();
            this.setRounds(2);
            Random rand = new Random();
            int []v = new int[this.getRounds()];
            for(int x=0;x<this.getRounds();x++){
            v[x]= rand.nextInt(3);
            }
            
            int e = 0,l1=0,l2=0;
            
            int vencedor = 0;
            for(int i=0;i<this.getRounds();i++){
                switch (v[i]) {
                    case 0:
                        e++;
                        break;
                    case 1:
                        l1++;
                        break;
                    case 2:
                        l2++;
                        break;
                    default:
                        break;
                }
            }
            if(l1>l2){
                vencedor=1;
            }else if(l2>l1){
                vencedor=2;
            }else if(l2>l1){
                vencedor=2;
            }
            
            
            switch(vencedor){
                case 0:
                    System.out.println("Empatou!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                break;
                    
                case 1:
                    
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                break;
                
                case 2:
                    
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();                            
                break;
            }
            
            
            
            
        }else{
            System.out.println("Não pode lutar!");
        }

    }

    @Override
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l2.getCategoria()==l2.getCategoria()&& l1!=l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("Luta aprovada!");
            
        }else{
            this.setAprovada(true);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("Não pode marcar a luta!");
        }
             
        
    }
    
    
    
}
