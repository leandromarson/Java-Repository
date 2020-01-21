package heranca2;

public abstract class Aluno extends Pessoa{
    protected int matricula;
    protected String curso;

    
    
    
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
       
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno "+this.nome);
    }

    @Override
    public String toString() {
        return "Aluno{"+"nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "matricula=" + matricula + ", curso=" + curso + '}';
    }
    
    
    
}
