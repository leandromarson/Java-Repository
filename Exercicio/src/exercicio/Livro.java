
package exercicio;

import java.util.Random;


public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 1;
    }

    
    
    public void detalhes(){
        System.out.println("-------------------");
        System.out.println("Título: "+this.getTitulo());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Total de Pag.: "+this.getTotPaginas());
        System.out.println("Leitor: "+this.getLeitor().getNome()+" Sexo: "+this.getLeitor().getSexo()+" Idade: "+this.getLeitor().getIdade());
        System.out.println("Esta aberto?: "+this.isAberto());
        System.out.println("Pag. Atual: "+this.getPagAtual());
        System.out.println("-------------------");
    }
    
    
    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private int getTotPaginas() {
        return totPaginas;
    }

    private void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if(!this.isAberto()){
            this.setAberto(true);
            
        }else{
            System.out.println("O livro já esta aberto!");
        }
    }

    @Override
    public void fechar() {
        if(this.isAberto()){
            this.setAberto(false);
        }else{
            System.out.println("O livro já esta fechado!");
        }
    }

    @Override
    public void folhear(int pag) {
        if(this.isAberto()){
            if(this.getPagAtual()<this.getTotPaginas()){
                this.setPagAtual(pag);
            }else{
                System.out.println("Não existe essa página");
            }
        }else{
            System.out.println("O livro está fechado!");
        }
    
    }

    @Override
    public void avancarPag() {
        if(this.isAberto()){
            if(this.getPagAtual()<this.getTotPaginas()){
                this.setPagAtual(this.getPagAtual()+1);
            }else{
                System.out.println("Não pode avançar a página!");
            }
        }else{
            System.out.println("O livro está fechado!");
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto()){
            if(this.getPagAtual()>1){
                this.setPagAtual(this.getPagAtual()-1);
            }else{
                System.out.println("Não pode voltar a página!");
            }
        }else{
            System.out.println("O livro está fechado!");
        }
    }
    
    
}
