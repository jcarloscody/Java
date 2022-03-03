/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.struturedata.Aula4ListaLigadaGenerica;

/**
 *
 * @author developer
 */
public class Elemento<TIPO> {
    private TIPO valor;
    private Elemento<TIPO> proximo;
    
    public Elemento(TIPO novoValor){
        this.valor = novoValor;
    }

    public TIPO getValor() {
        return valor;
    }

    public void setValor(TIPO valor) {
        this.valor = valor;
    }

    public Elemento<TIPO> getProximo() {
        return proximo;
    }

    public void setProximo(Elemento<TIPO> proximo) {
        this.proximo = proximo;
    }
    
}
