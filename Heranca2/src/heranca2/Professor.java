package heranca2;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public Professor(String nome, int idade, char sexo, String especialidade, float salario) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.salario = salario;
    }
    
    public void ReceberAum(float aumento){
            this.setSalario(this.getSalario()+aumento);
            
        }

        public  String getEspecialidade() {
            return especialidade;
        }

        public  void setEspecialidade(String especialidade) {
            this.especialidade = especialidade;
        }

        public  float getSalario() {
            return salario;
        }

        public  void setSalario(float salario) {
            this.salario = salario;
        }

    @Override
    public String toString() {
        return "Professor{"+"nome= " + nome + ", idade= " + idade + ", sexo= " + sexo + ", especialidade= " + especialidade + ", salario= " + salario + '}';
    }
        
        
     
    
}
