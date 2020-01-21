
package exercicio;


public class Pessoa {
    
    private String nome;
    private int idade;
    private char sexo;
    
    public void fazerAniver(){
        this.setIdade(this.getIdade()+1);
    }

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    char getSexo() {
        return sexo;
    }

    private void setSexo(char sexo) {
        if(sexo=='M'||sexo=='F'||sexo=='m'||sexo=='f'){
        this.sexo = sexo;
        }
    }
    
    
    
    
    
}
