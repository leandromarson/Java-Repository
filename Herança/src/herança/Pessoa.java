
package herança;

public class Pessoa {
    
    private String nome;
    private int idade;
    private char sexo;
    
    public void fazerAniver(){
       this.setIdade(this.getIdade()+1);        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if(sexo=='M'||sexo=='F'||sexo=='m'||sexo=='f'){
            this.sexo = sexo;
        }else{
            System.out.println("Sexo inválido!");
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
    
}
