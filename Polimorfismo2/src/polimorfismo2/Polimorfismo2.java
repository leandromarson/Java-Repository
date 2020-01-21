
package polimorfismo2;


public class Polimorfismo2 {

    public static void main(String[] args) {

        Cachorro k = new Cachorro(20.3f,3,4,"Amarelo");
        
        System.out.println(k.toString());
        System.out.println("");
        k.emitirSom();
        System.out.println("");
        System.out.println("Frase");
        k.reagir("Olá");
        k.reagir("Cuzao");
        System.out.println("");
        System.out.println("Dono");
        k.reagir(true);
        k.reagir(false);
        System.out.println("");
        System.out.println("Hora");
        k.reagir(11, 45);
        k.reagir(21, 00);
        System.out.println("");
        System.out.println("Peso e idade");
        k.reagir(2, 12.3f);
        k.reagir(0, 2.5f);
        k.reagir(15, 5.9f);
        k.reagir(19, 20.8f);
    }
    
}
