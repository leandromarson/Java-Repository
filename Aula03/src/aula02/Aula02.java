package aula02;

public class Aula02 {
    
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.cor="Azul";
        c1.ponta=0.5f;
        c1.tampada=false;
        c1.carga=10;
        c1.modelo="Bic";
        c1.status();
        c1.tampar();
        c1.rabiscar();
        c1.destampar();
        c1.destampar();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo="Bic";
        c2.carga=0;
        c2.ponta=0.9f;
        c2.tampada=true;
        c2.cor="Preta";
        c2.status();
        c2.rabiscar();
        c2.destampar();
        c2.rabiscar();
        
        Tanque t1 = new Tanque();
        
        t1.modelo="Tiger";
        t1.cor="Verde";
        t1.combustivel=0;
        t1.vel=90.5f;
        t1.municao=10;
        
        t1.status();
        t1.andar();
        t1.atirar();
        
        Tanque t2 = new Tanque();
        
        t2.modelo="M1 Abrams";
        t2.cor="Deserto";
        t2.combustivel=10;
        t2.vel=99.5f;
        t2.municao=0;
        
        t2.status();
        t2.andar();
        t2.atirar();
        
        
    }
    
}
