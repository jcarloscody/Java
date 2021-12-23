/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap21_EstruturaDadosGenericosPersonalizados.Pilhas;

import cap21_EstruturaDadosGenericosPersonalizados.ListaEncadeadas.List.EmptyListException;
import cap21_EstruturaDadosGenericosPersonalizados.ListaEncadeadas.List.List;

/**
 *
 * @author developer
 */
public class StackComposition<T> {

    private List<T> stackList;

    // construtor
    public StackComposition() {
        stackList = new List<T>("stack");
    }

    // adiciona objeto à pilha
    public void push(T object) {
        stackList.insertAtFront(object);
    }

    // remove objeto da pilha
    public T pop() throws EmptyListException {
        return stackList.removeFromFront();
    }

    // determina se a pilha está vazia
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    // gera saída do conteúdo de pilha
    public void print() {
        stackList.print();
    }

}
