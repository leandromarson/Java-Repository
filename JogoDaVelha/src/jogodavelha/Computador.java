package jogodavelha;

import java.util.Random;

public class Computador extends Jogador {
    
    Random r = new Random();
    
    public Computador(int jogador){
        super(jogador);
        System.out.println("Jogador 'Computador' criado!");
    }
    
    
    @Override
    public void jogar(Tabuleiro tabuleiro) {
        Tentativa(tabuleiro);
        tabuleiro.setPosicao(tentativa, jogador);
    }

    @Override
    public void Tentativa(Tabuleiro tabuleiro) {
        do{
            do{
                tentativa[0] = r.nextInt(3);
            }while(tentativa[0]>3||tentativa[0]<1);
            
            do{
                tentativa[1] = r.nextInt(3);
            }while(tentativa[1]>3||tentativa[1]<1);
            
            tentativa[0]--;
            tentativa[1]--;
            
            if(!checaTentativa(tentativa, tabuleiro))
                System.out.println("Esse local ja foi marcado!");
            
        }while(!checaTentativa(tentativa, tabuleiro));
    }
    
}
