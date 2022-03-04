/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.struturedata.Aula5IteratorListaLigada;
public class IteratorListaLigada<TIPO> {
    private Elemento<TIPO> elemento;
    
    public IteratorListaLigada(Elemento<TIPO> atual){
        this.elemento = atual;
    }
    
    public boolean temProximo(){
        if (elemento.getProximo() == null){
            return false;
        }else{
            return true;
        }
    }
    
    public Elemento<TIPO> getProximo(){
        elemento = elemento.getProximo();
        return elemento;
    }
}
