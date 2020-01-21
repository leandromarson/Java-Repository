
package polimorfismo1;


public class Cachorro extends Mamifero{
    
    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    
    public void enterrarOsso(){
        System.out.println("Enterrando o Osso...");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o Rabo...");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Au Au!!");
    }
 
    @Override
    public String toString() {
        return "Cachorro\n" + "Peso: " + peso + "\nIdade: " + idade + "\nMembros: " + membros + "\nCor do Pelo: " + corPelo;
    }
    
}
