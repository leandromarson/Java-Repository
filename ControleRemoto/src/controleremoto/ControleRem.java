
package controleremoto;


public class ControleRem implements Controlador{
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRem(){
        volume=50;
        ligado=false;
        tocando=false;
    }
    
    
    
    
    
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Ligando...");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Desligando...");
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado?: "+this.isLigado());
        System.out.println("Volume: "+this.getVolume()+" ");
        for(int i = 0;i<=this.getVolume();i+=10){
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("Esta tocando?: "+this.isTocando());
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");

    }

    @Override
    public void maisVolume() {
        if(this.isLigado() && this.getVolume()<100){
            setVolume(getVolume()+5);
            System.out.println("Volume: "+getVolume());
        }else{
             System.out.println("Não pode aumentar o volume!");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado() && this.getVolume()>0){
            setVolume(getVolume()-5);
            System.out.println("Volume: "+getVolume());
        }else{
             System.out.println("Não pode diminuir o volume!");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume()>0){
            setVolume(0);
            System.out.println("Volume: "+getVolume());
            System.out.println("Mudo!");
        }else{
             System.out.println("Não pode mutar!");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume()==0){
            setVolume(50);
            System.out.println("Volume: "+getVolume());
            System.out.println("Mudo desligado!");
        }else{
             System.out.println("Não pode desmutar!");
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
            System.out.println("Tocando...");
        }else{
             System.out.println("Não pode reproduzir!");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
            System.out.println("Pause!");
        }else{
            System.out.println("Não pode pausar!");
        }

    }
    
    
    
    
    
    
}
