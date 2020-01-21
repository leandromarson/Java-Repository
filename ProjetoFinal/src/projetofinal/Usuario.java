
package projetofinal;


public class Usuario extends Pessoa{
    
    private String login;
    private int totAssistido;

    
    public Usuario(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    
    
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido()+1);
    }
    
    
    @Override
    protected void ganharExp() {
        this.setExperiencia(this.getExperiencia()+1);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    

    @Override
    public String toString() {
        return "Usuario" + super.toString()+ "\nLogin: " + login + "\nTotal de Videos Assistidos: " + totAssistido + "\n";
    }
    
    
    
    
}
