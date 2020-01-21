
package projetofinal;


public abstract class Pessoa {
    
    protected String nome;
    protected int idade;
    protected char sexo;
    protected float experiencia;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
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
            this.sexo=sexo;
        }else{
            System.out.println("Sexo Invalido!");
        }
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + "\nExperiencia: " + experiencia;
    }
    
    protected abstract void ganharExp();
    
}
