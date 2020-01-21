
package polimorfismo1;


public class Ave extends Animal{
    
    protected String corPena;
    
    public Ave(float peso, int idade, int membros, String corPena) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
        this.corPena = corPena;
    }
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som da Ave...");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public String toString() {
        return "Ave\n" + "Peso: " + peso + "\nIdade: " + idade + "\nMembros: " + membros + "\nCor da Pena: " + corPena;
    }
    
    
    
}
