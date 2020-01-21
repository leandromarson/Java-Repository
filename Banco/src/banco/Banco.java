
package banco;


public class Banco {

    
    public static void main(String[] args) {
        
        ContaBanco p1 = new ContaBanco();
        
        p1.abrirConta(1, "CC", "Jubileu");
        
        ContaBanco p2 = new ContaBanco();
        
        p2.abrirConta(2, "CP", "Creuza");
        
        p1.depositar(300);
        p2.depositar(500);
        
        p2.sacar(100);
        
        p1.sacar(350);
        p1.fecharConta();
        
        
        p1.status();
        p2.status();
        
    }
    
}
