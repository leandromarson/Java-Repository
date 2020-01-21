
package relacionamentoclasses;


public class Lutador implements LutadorInterface{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;    

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    
    
    String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(peso<52.2){
            this.categoria="Invalido";
        }else if(peso<=70.3){
            this.categoria="Leve";
        }else if(peso<=83.9){
            this.categoria="Médio";
        }else if(peso<=120.2){
            this.categoria="Pesado";
        }else{
            this.categoria="Invalido";
        }
    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }
    
       
    
    @Override
    public void apresentar() {
        System.out.println("----------------------------------------");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Origem: "+this.getNacionalidade());
        System.out.println(getIdade()+" anos");
        System.out.println("Pesando: "+this.getPeso()+" Kg");
        System.out.println("Ganhou: "+this.getVitorias());
        System.out.println("Perdeu: "+this.getDerrotas());
        System.out.println("Empatou: "+this.getEmpates());
        System.out.println("----------------------------------------");
    }

    @Override
    public void status() {
        System.out.println("----------------------------------------");
        System.out.println(this.getNome());
        System.out.println("É um peso "+this.getCategoria());
        System.out.println(this.getVitorias()+" vitórias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println(this.getEmpates()+" empates");
        System.out.println("----------------------------------------");
    }

    @Override
    public void ganharLuta() {
        System.out.println(this.getNome()+" Ganhou a Luta!");
        this.setVitorias(this.getVitorias()+1);
    }

    @Override
    public void perderLuta() {
        System.out.println(this.getNome()+" Perdeu a Luta!");
        this.setDerrotas(this.getDerrotas()+1);
    }

    @Override
    public void empatarLuta() {
        System.out.println(this.getNome()+" Empatou a Luta!");
        this.setEmpates(this.getEmpates()+1);
    }
}
