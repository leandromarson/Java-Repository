
package polimorfismo1;


public class Polimorfismo1 {

    public static void main(String[] args) {
        
        
        Reptil r = new Reptil(50.3f,3,4,"Verde Escuro");
        
        System.out.println(r.toString());
        System.out.println("");
        r.locomover();
        r.alimentar();
        r.emitirSom();
        System.out.println("");      
        
        Mamifero m = new Mamifero(85.4f,2,4,"Preto");
        
        System.out.println(m.toString());
        System.out.println("");
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("");
        
        Peixe p = new Peixe(0.35f,1,0,"Verde");
        
        System.out.println(p.toString());
        System.out.println("");
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();
        System.out.println("");
        
        Ave a = new Ave(0.85f,2,2,"Branca");
        
        System.out.println(a.toString());
        System.out.println("");
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        System.out.println("");
        
        //subclasse de subclasse
        Cachorro k = new Cachorro(20.3f,3,4,"Amarelo");
        
        System.out.println(k.toString());
        System.out.println("");
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
        k.enterrarOsso();
        System.out.println("");
        
        Canguru c = new Canguru(40.3f,3,4,"Caramelo");
        
        System.out.println(c.toString());
        System.out.println("");
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        System.out.println("");
        
        Cobra cb = new Cobra(1.4f,2,0,"Preto");
        
        System.out.println(cb.toString());
        System.out.println("");
        cb.locomover();
        cb.alimentar();
        cb.emitirSom();
        System.out.println("");
        
        Tartaruga t = new Tartaruga(4.9f,50,4,"Verde Bosta");
        
        System.out.println(t.toString());
        System.out.println("");
        t.locomover();
        t.alimentar();
        t.emitirSom();
        System.out.println("");
        
        Goldfish g = new Goldfish(0.2f,2,0,"Gold");
        
        System.out.println(g.toString());
        System.out.println("");
        g.locomover();
        g.alimentar();
        g.emitirSom();
        g.soltarBolha();
        System.out.println("");
        
        Arara ar = new Arara(3.3f,4,2,"Azul");
        
        System.out.println(ar.toString());
        System.out.println("");
        ar.locomover();
        ar.alimentar();
        ar.emitirSom();
        ar.fazerNinho();
        System.out.println("");
        
        
    }
    
}
