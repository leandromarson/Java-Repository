
package exercicio;


public class Exercicio {

    
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Aristoteles",1000,'M');
        Livro l = new Livro("Pão de Fejao","Zé Bostola",1000,p);
        
        l.detalhes();
        l.fechar();
        l.abrir();
        l.folhear(1000);
        l.detalhes();
        l.avancarPag();
        l.detalhes();
        l.voltarPag();
        l.detalhes();

    }
    
}
