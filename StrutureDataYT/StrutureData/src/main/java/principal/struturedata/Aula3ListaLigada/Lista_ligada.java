/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.struturedata.Aula3ListaLigada;

/**
 *
 * @author developer
 */
public class Lista_ligada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;
        
    public Lista_ligada(){
        this.tamanho = 0;
    }

    public Elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void adicionar(String novoValor){
        Elemento novoElemento = new Elemento(novoValor);
        if (this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;            
        }else{
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;            
        }
        this.tamanho++;
    }
    
    public void remover(String valorProcurado){
        Elemento anterior = null;
        Elemento atual = this.primeiro;
        for(int i=0; i < this.getTamanho(); i++){            
            if (atual.getValor().equalsIgnoreCase(valorProcurado)){
                if (this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;
                }else if (atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                }else if (atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else{ //trata dos elementos do meio
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;//o anterior vai guardar o atual e o atual vai pegar o proximo
            atual = atual.getProximo(); //aqui temos a fila andando - incrementando
        }
    }
    
    public Elemento get(int posicao){
        Elemento atual = this.primeiro;
        for(int i=0; i < posicao; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }
    
}
