
package polimorfismo2;


public class Cachorro extends Lobo{

    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    
    public void reagir(String frase){
        if("toma comida".equals(frase) || "Olá".equals(frase)){
            System.out.println("Abanar e Latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora,int min){
        if(hora<12){
            System.out.println("Abanar");
        }else if(hora>=18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e Latir");
        }
    }
    
    public void reagir(boolean dono){
        if(dono==true){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e Latir");
        }
    }
    
    public void reagir(int idade, float peso){
        if(idade<5){
            if(peso<10){
                System.out.println("Abanar");
            }else{
                System.out.println("Latir");
            }
        }else{
            if(peso<10){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }  
        }
    }
    //assinaturas diferentes
    
       
    @Override
    public void emitirSom(){
        System.out.println("Au Au!!");
    }
 
    @Override
    public String toString() {
        return "Cachorro\n" + "Peso: " + peso + "\nIdade: " + idade + "\nMembros: " + membros + "\nCor do Pelo: " + corPelo;
    }
    
    
}
