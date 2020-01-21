
package polimorfismo2;


public class Lobo extends Mamifero{

    public Lobo(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    
    
    
    @Override
    public void emitirSom(){
        System.out.println("Auuuuuuuuuuuuuuuuuuuu!!");
    }
 
    @Override
    public String toString() {
        return "Lobo\n" + "Peso: " + peso + "\nIdade: " + idade + "\nMembros: " + membros + "\nCor do Pelo: " + corPelo;
    }
    
    
}
