
package heranca2;


public class Heranca2 {

    
    public static void main(String[] args) {
        Visitante v1 = new Visitante("Juvenal",22,'M');
        v1.fazerAniversario();
        System.out.println(v1.toString());
        
        Tecnico t1 = new Tecnico("Claudio",16,'M',1111,"Informática",13284532);
        t1.pagarMensalidade();
        t1.fazerAniversario();
        t1.praticar();
        t1.pagarMensalidade();
        System.out.println(t1.toString());
        
        Bolsista b1 = new Bolsista("Ricardo",17,'M',1124,"ADM",25);
        b1.renovarBolsa();
        b1.pagarMensalidade();
        b1.fazerAniversario();
        System.out.println(b1.toString());
        
        Professor p1 = new Professor("Marileide",42,'F',"Portugues",3243.22f);
        p1.fazerAniversario();
        System.out.println(p1.toString());
        
        
        
    }
    
}
