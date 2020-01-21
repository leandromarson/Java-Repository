package jogodavelha;

import java.util.Scanner;

public class Humano extends Jogador{
    
    public Scanner s = new Scanner(System.in);

    public Humano(int jogador){
        super(jogador);
        this.jogador = jogador;
        System.out.println("Jogador 'Humano' criado!");
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
                System.out.println("Linha: ");
                tentativa[0] = s.nextInt();
                if(tentativa[0]>3||tentativa[0]<1)
                    System.out.println("Linha inválida!");
            }while(tentativa[0]>3||tentativa[0]<1);
            
            do{
                System.out.println("Coluna: ");
                tentativa[1] = s.nextInt();
                if(tentativa[1]>3||tentativa[1]<1)
                    System.out.println("Coluna inválida!");
            }while(tentativa[1]>3||tentativa[1]<1);
            
            tentativa[0]--;
            tentativa[1]--;
            
            if(!checaTentativa(tentativa, tabuleiro))
                System.out.println("Esse local ja foi marcado!");
            
        }while(!checaTentativa(tentativa, tabuleiro));
    }
    
}
