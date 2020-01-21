
package polimorfismo1;


public class Cobra extends Reptil{
    
    public Cobra(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }
    
    @Override
    public String toString() {
        return "Cobra\n" + "Peso: " + peso + "\nIdade: " + idade + "\nMembros: " + membros + "\nCor da Escama: " + corEscama;
    }
    
}
