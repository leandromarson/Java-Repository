
package arvorebinaria;


public class Arvore {
    public No raiz;
    
    class No{
        Integer valor;
        No filhoEsquerdo;
        No filhoDireito;
        
        public No(Integer valor){
            this.valor = valor;
        }
    }
    
    public No inserir(int valor){
        return this.inserir(new No(valor), raiz);
    }
    
    public No inserir(No novo,No anterior){
        if(raiz==null){
            raiz=novo;
            return raiz;
        }
        if(anterior != null){
            if(novo.valor<=anterior.valor){
                anterior.filhoEsquerdo=this.inserir(novo, anterior.filhoEsquerdo);
            }else if(novo.valor>anterior.valor){
                anterior.filhoDireito=this.inserir(novo, anterior.filhoDireito);
            }else{
                return null;
            }
        }else{
            anterior = novo;
        }
        return anterior;
    }
    
    public void emOrdem(No no){
        if(no!=null){
            emOrdem(no.filhoEsquerdo);
            System.out.println(no.valor);
            emOrdem(no.filhoDireito);
        }
    }
    
    public void preOrdem(No no){
        if(no!=null){
            System.out.println(no.valor);
            preOrdem(no.filhoEsquerdo);
            preOrdem(no.filhoDireito);
        }
    }
    
    public void posOrdem(No no){
        if(no!=null){
            posOrdem(no.filhoEsquerdo);
            posOrdem(no.filhoDireito);
            System.out.println(no.valor);
        }
    }
    
    public int contagem(No no){
        return(no==null)?0:1+contagem(no.filhoEsquerdo)+contagem(no.filhoDireito);
    }
}
