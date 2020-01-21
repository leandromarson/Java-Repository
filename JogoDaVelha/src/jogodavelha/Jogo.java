package jogodavelha;

import java.util.Scanner;

public class Jogo {
    private Tabuleiro tabuleiro;
    private int rodada =1, vez =1;
    private Jogador j1;
    private Jogador j2;
    public Scanner s = new Scanner(System.in);
    
    public Jogo(){
        tabuleiro = new Tabuleiro();
        iniciarJogadores();
        
        while(Jogar());
    }
    
    public void iniciarJogadores(){
        System.out.println("Quem será o Jogador 1?");
        if(escolherJogador()==1)
            this.j1 = new Humano(1);
        else
            this.j1 = new Computador(1);
        
        System.out.println("--------------------");
        
        System.out.println("Quem será o Jogador 2?");
        if(escolherJogador()==1)
            this.j2 = new Humano(2);
        else
            this.j2 = new Computador(2);
    }
    
    public int escolherJogador(){
        int opcao = 0;
        
        do{
            System.out.println("1. Humano");
            System.out.println("2. Computador");
            System.out.println("Opção: ");
            opcao = s.nextInt();
            if(opcao!=1&&opcao!=2)
                System.out.println("Opção invalida!");
        }while(opcao!=1&&opcao!=2);
        return opcao;
    }
    
    public boolean Jogar(){
        if(ganhou()==0){
            System.out.println("--------------------");
            System.out.println("\nRodada"+rodada);
            
            if(vez()==1)
                j1.jogar(tabuleiro);
            else
                j2.jogar(tabuleiro);
            
            if(tabuleiro.tabuleiroCompleto()){
                System.out.println("Tabuleiro Completo. Jogo EMPATADO");
                return false;
            }
            vez++;
            rodada++;
            return true;
        }else{
            if(ganhou()==-1)
                System.out.println("Jogador 1 ganhou!");
            else
                System.out.println("Jogador 2 ganhou!");
            
            return false;
        }
    }
    
    public int vez(){
        if(vez%2==1)
            return 1;
        else
            return 2;
    }
    
    public int ganhou(){
        if(tabuleiro.checaLinhas()==1)
            return 1;
        if(tabuleiro.checaColunas()==1)
            return 1;
        if(tabuleiro.checaDiagonais()==1)
            return 1;
        
        if(tabuleiro.checaLinhas()==-1)
            return -1;
        if(tabuleiro.checaColunas()==-1)
            return -1;
        if(tabuleiro.checaDiagonais()==-1)
            return -1;
      return 0;      
    }
    
}
