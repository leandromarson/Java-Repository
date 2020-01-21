
package polimorfismo1;


public class Mamifero extends Animal{

    protected String corPelo;
    
    public Mamifero(float peso, int idade, int membros, String corPelo) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
        this.corPelo = corPelo;
    }
    
    @Override
    public void locomover() {
        System.out.println("Correndo...");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando...");

    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero...");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    @Override
    public String toString() {
        return "Mamífero\n" + "Peso: " + peso + "\nIdade: " + idade + "\nMembros: " + membros + "\nCor do Pelo: " + corPelo;
    }
    
}
