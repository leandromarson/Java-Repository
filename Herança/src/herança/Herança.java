
package herança;


public class Herança {

    
    public static void main(String[] args) {
        
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       
       p1.setNome("Pedro");
       p2.setNome("Maria");
       p3.setNome("Claudio");
       p4.setNome("Fabiana");
       
       p1.setSexo('M');
       p2.setSexo('F');
       p3.setSexo('M');
       p4.setSexo('F');
       
       p1.setIdade(20);
       p2.setIdade(18);
       p3.setIdade(43);
       p4.setIdade(23);
       
       p2.setCurso("Informática");
       p3.setSalario(10000.30f);
       p4.setSetor("Estoque");
       
       System.out.println(p1.toString());
       System.out.println(p2.toString());
       System.out.println(p3.toString());
       System.out.println(p4.toString());

    }
    
}
