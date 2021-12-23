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
public class StackInheritance<T> extends List<T> {
    // construtor

    public StackInheritance() {
        super("stack");
    }

    // adiciona objeto à pilha
    public void push(T object) {
        insertAtFront(object);
    }

    // remove objeto da pilha
    public T pop() throws EmptyListException {
        return removeFromFront();
    }

}
