/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap21_EstruturaDadosGenericosPersonalizados.Filas;

import cap21_EstruturaDadosGenericosPersonalizados.ListaEncadeadas.List.EmptyListException;

/**
 *
 * @author developer
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        // utiliza o método enqueueÿ
        queue.enqueue(-1);
        queue.print();
        queue.enqueue(0);
        queue.print();
        queue.enqueue(1);
        queue.print();
        queue.enqueue(5);
        queue.print();

        // remove os objetos da fila
        try {
            int removedItem;

            while (true) {
                removedItem = queue.dequeue(); // utiliza método dequeueÿ
                System.out.printf("%n%d dequeued%n", removedItem);
                queue.print();
            }
        } catch (EmptyListException emptyListException) {
            emptyListException.printStackTrace();
        }
    }
}
