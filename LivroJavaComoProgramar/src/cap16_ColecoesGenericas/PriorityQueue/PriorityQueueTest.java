/*
 Lembre-se de que uma fila é uma coleção que representa uma fila de espera — normalmente, inserções são feitas na parte 
de trás de uma fila e exclusões são feitas a partir da frente. Na Seção 21.6, discutiremos e implementaremos uma estrutura de fila 
de dados.

 a interface Queue do Java e a classe PriorityQueue do pacote java.util. A interface Queue
estende a interface Collection e fornece operações adicionais para inserção, remoção e inspeção de elementos em uma fila. 
PriorityQueue, que implementa a interface Queue

A classe PriorityQueue fornece funcionalidades que permitem inserções na ordem de classificação na estrutura de dados 
subjacente e exclusões a partir da frente da estrutura de dados subjacente. 
 */
package cap16_ColecoesGenericas.PriorityQueue;

// Programa de teste de PriorityQueue.

import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        // fila de capacidade 11 ÿ
        PriorityQueue<Double> queue = new PriorityQueue<>();

        // insere elementos na filaÿ
        queue.offer(3.2); // offer, para inserir um elemento na posição apropriada com base na ordem de  prioridade
        queue.offer(9.8);
        queue.offer(5.4);

        System.out.print("Polling from queue: ");

        // exibe elementos na fila
        while (queue.size() > 0) { //size, para obter o número de elementos da fila de prioridade.
            System.out.printf("%.1f ", queue.peek()); // visualiza o elemento superior, peek para obter  uma referência ao elemento de mais alta prioridade da fila de prioridade (sem remover esse elemento),
            queue.poll(); // remove o elemento superior,  offer, para inserir um elemento na posição apropriada com base na ordem de prioridade
        }
    }
} // fim da classe PriorityQueueTest
//clear para remover todos 