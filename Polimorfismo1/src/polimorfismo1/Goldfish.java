
package polimorfismo1;


public class Goldfish extends Peixe{
    
    public Goldfish(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }
    
    @Override
    public String toString() {
        return "Goldfish\n" + "Peso: " + peso + "\nIdade: " + idade + "\nMembros: " + membros + "\nCor da Escama: " + corEscama;
    }
    
}
