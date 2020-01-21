
package polimorfismo1;


public class Peixe extends Animal{

    protected String corEscama;
    
    public Peixe(float peso, int idade, int membros, String corEscama) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
        this.corEscama = corEscama;
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Peixe...");
    }
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    @Override
    public String toString() {
        return "Peixe\n" + "Peso: " + peso + "\nIdade: " + idade + "\nMembros: " + membros + "\nCor da Escama: " + corEscama;
    }
    
    
}
