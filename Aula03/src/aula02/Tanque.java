
package aula02;


public class Tanque {
    String modelo;
    String cor;
    float vel;
    int combustivel;
    int municao;
    
    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Velocidade: "+this.vel);
        System.out.println("Combustivel: "+this.combustivel);
        System.out.println("Munição: "+this.modelo);
    }
            
    void andar(){
        if(this.combustivel==0){
            System.out.println("Nao pode andar sem combustivel");
            this.combustivel-=1;
        }else{
            System.out.println("Andando");
        }
        
    }
    
    void atirar(){
        if(this.municao==0){
            System.out.println("Sem munição");
        }else{
            System.out.println("Pow");
            this.municao-=1;
        }
    }
}
