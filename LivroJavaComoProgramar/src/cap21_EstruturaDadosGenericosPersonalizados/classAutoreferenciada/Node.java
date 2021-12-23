/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap21_EstruturaDadosGenericosPersonalizados.classAutoreferenciada;

/**
 *
 * @author developer
 */
public class Node<T> {
    private T data;
    private Node<? extends Object> nextNode; // referência ao próximo nó vinculado
    public Node(T data) { /* corpo do construtor */ 
        this.data = data;
        this.nextNode = null;
    }
    public void setData(T data) { /* corpo do método */ 
        this.data=data;
               
    }
    public T getData() { /* corpo do método */
        return this.data;
    }
    public void setNext(Node<? extends Object> next) { /* corpo do método */ 
        this.nextNode = next;
    }
    public Node<? extends Object> getNext() { /* corpo do método */
        return this.nextNode;
    }
}
