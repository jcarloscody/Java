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
public class Elemento {
    private String valor;
    private Elemento proximo;
    
    public Elemento(String novoValor){
        this.valor = novoValor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
    
}
