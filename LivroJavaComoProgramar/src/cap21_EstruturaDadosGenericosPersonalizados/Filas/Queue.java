/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap21_EstruturaDadosGenericosPersonalizados.Filas;

import cap21_EstruturaDadosGenericosPersonalizados.ListaEncadeadas.List.EmptyListException;
import cap21_EstruturaDadosGenericosPersonalizados.ListaEncadeadas.List.List;

/**
 *
 * @author developer
 */
public class Queue<T>  {

    private List<T> queueList;

    // construtor
    public Queue() {
        queueList = new List<T>("queue");
    }

    // adiciona o objeto à fila
    public void enqueue(T object) {
        queueList.insertAtBack(object);
    }

    // remove o objeto da fila
    public T dequeue() throws EmptyListException {
        return queueList.removeFromFront();
    }

    // determina se a fila está vazia
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    // gera o conteúdo da fila
    public void print() {
        queueList.print();
    }
}
