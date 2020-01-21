
package polimorfismo1;


public class Canguru extends Mamifero{
    
    public Canguru(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    
    public void usarBolsa(){
        System.out.println("Usando Bolsa...");
    }
    
    @Override
    public void locomover(){
        System.out.println("Saltitando Saltitando...");
    }
    
    @Override
    public String toString() {
        return "Canguru\n" + "Peso: " + peso + "\nIdade: " + idade + "\nMembros: " + membros + "\nCor do Pelo: " + corPelo;
    }
}
