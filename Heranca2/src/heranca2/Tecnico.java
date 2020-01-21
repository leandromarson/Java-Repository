package heranca2;

public final class Tecnico extends Aluno {
      
    private int registroProfissional;
    
    public Tecnico(String nome, int idade, char sexo, int matricula, String curso, int registroProfissional) {
        this.matricula = matricula;
        this.curso = curso;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.registroProfissional = registroProfissional;
        
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    public void praticar(){
        System.out.println("Praticando...");
    }

    @Override
    public String toString() {
        return "Tecnico{"+"nome= " + nome + ", idade= " + idade + ", sexo= " + sexo + ", matricula= " + matricula + ", curso= " + curso + ", registro profissional= " + registroProfissional + '}';
    }
    
    
    
}
