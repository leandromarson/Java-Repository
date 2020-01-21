
package banco;

public class ContaBanco {
    
    
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    

    public ContaBanco() {
        
        this.status=false;
        this.saldo=0;
        
    }
    
    
    
    public void abrirConta(int numConta,String tipo,String dono){
        setNumConta(numConta);
        setTipo(tipo);
        setDono(dono);
        
        if("CC".equals(this.tipo)){
            this.saldo+=50;
            setStatus(true);
            System.out.println("Conta aberta com sucesso!");
            
            
        }else if("CP".equals(this.tipo)){
            this.saldo+=150;
            setStatus(true);
            System.out.println("Conta aberta com sucesso!");
            
        }else{
            System.out.println("Conta Invalida");
        }
    }
    public void fecharConta(){
        if(this.saldo==0){
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }else if(this.saldo!=0){
            System.out.println("Não pode fechar! saldo atual: "+this.saldo);
        }
        
    }
    
    public void depositar(float sd){
        if(this.status==true){
        this.saldo+=sd;
            System.out.println("Deposito feito com sucesso!");
            System.out.println("Saldo do(a) "+getDono()+": "+getSaldo());
        }else{
            System.out.println("Não pode depositar pois a conta está fechada!");
        }
    }
    
    public void sacar(float sc){
        if(this.status==true){
            if(this.saldo>=sc&&sc<=1000){
                this.saldo-=sc;
                System.out.println("Saque feito com sucesso!");
                System.out.println("Saldo do(a) "+getDono()+": "+getSaldo());
                       
            }else{
                
                System.out.println("Não pode sacar esse valor! saldo atual: "+this.saldo);
            }
        }else{
           System.out.println("Não pode sacar pois a conta está fechada!"); 
        }
    }
    
    public void pagarMensal(){
        
        if("CC".equals(this.tipo)){
            this.saldo-=12;            
        }else if("CP".equals(this.tipo)){
            this.saldo-=20;
            
        }
        System.out.println("Mensalidade efetuada com sucesso");
         
    }
    
    
    //get e set
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    
    //status
    
    public void status(){
        System.out.println("Número da Conta: "+getNumConta());
        System.out.println("Tipo da Conta: "+getTipo());
        System.out.println("Dono: "+getDono());
        System.out.println("Saldo: "+getSaldo());
        System.out.println("A conta está aberta?: "+isStatus());
        System.out.println("");
    }
    
    
    
}
