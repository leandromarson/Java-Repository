
package heranca2;


public class Visitante extends Pessoa{

    public Visitante(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        
        
    }
    
    //Classe pobre    

    @Override
    public String toString() {
        return "Visitante{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
}
