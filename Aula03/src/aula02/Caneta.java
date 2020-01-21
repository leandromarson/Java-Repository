package aula02;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Tendes ens tu un mudelo: "+this.modelo);
        System.out.println("Asta caneta possuíras a cor: "+this.cor);
        System.out.println("Tens uma ponta di tamanho: "+this.ponta);
        System.out.println("Esta mesma possuis carga du valor de: "+this.carga);
        System.out.println("Possuirás em sua forma atual a presença de tampa?: "+this.tampada);
    }
    
    void rabiscar(){
        if(this.tampada==true){
            System.out.println("Deves Destampardes a Caneta para rabiscardes!!");
            if(this.carga==0){
            System.out.println("Para rabiscardes asta preciso que necessitardes duma carga");
            }
        }
        else{
            if(this.carga==0){
            System.out.println("Para rabiscardes asta preciso que necessitardes duma carga");
            }else{
            System.out.println("Rabiscardes");
            this.carga-=1;
            }
        }  
    }
    void tampar(){
        if(this.tampada==true){
            System.out.println("Tua caneta ja estardes tampada abestalhado!");
        }else{
            System.out.println("A butardes a tampa...");
            this.tampada=true;
        }
        
    }
    void destampar(){
        if(this.tampada==false){
            System.out.println("Tua caneta ja estardes destampada abestalhado!");
        }else{
            System.out.println("A desbutardes a tampa...");
            this.tampada=false;
        }
    }
    
    
    
    
}
