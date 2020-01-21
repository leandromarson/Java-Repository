
package heranca2;


public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;

    

    
    

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
    
    public final void fazerAniversario(){
        System.out.println("Fazendo Aniversario...");
        this.setIdade(this.getIdade()+1);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
    
}
