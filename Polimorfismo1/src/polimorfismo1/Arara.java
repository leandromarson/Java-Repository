
package polimorfismo1;


public class Arara extends Ave{
    
    public Arara(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros, corPena);
    }
    
    @Override
    public String toString() {
        return "Arara\n" + "Peso: " + peso + "\nIdade: " + idade + "\nMembros: " + membros + "\nCor da Pena: " + corPena;
    }
    
}
