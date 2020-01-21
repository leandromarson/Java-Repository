
package polimorfismo1;


public class Tartaruga extends Reptil{
    
    public Tartaruga(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }
    
    @Override
    public void locomover(){
        System.out.println("Andando Devagar...");
    }
    
    @Override
    public String toString() {
        return "Tartaruga\n" + "Peso: " + peso + "\nIdade: " + idade + "\nMembros: " + membros + "\nCor da Escama: " + corEscama;
    }
    
}
