package heranca2;

public final class Bolsista extends Aluno{
    
    private int bolsa;
    
    public Bolsista(String nome, int idade, char sexo, int matricula, String curso, int bolsa) {
        this.matricula = matricula;
        this.curso = curso;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.bolsa = bolsa;
        
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
    public void renovarBolsa(){
        System.out.println("Renovar bolsa de "+this.nome);
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome+" é bolsista, mensalidade facilitada");
    }

    @Override
    public String toString() {
        return "Bolsista{"+"nome= " + nome + ", idade= " + idade + ", sexo= " + sexo + ", matricula= " + matricula + ", curso= " + curso + ", bolsa= " + bolsa + '}';
    }
    
    
    
    
}
