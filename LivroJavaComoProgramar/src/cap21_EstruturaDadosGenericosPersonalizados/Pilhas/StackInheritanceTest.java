/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap21_EstruturaDadosGenericosPersonalizados.Pilhas;

import cap21_EstruturaDadosGenericosPersonalizados.ListaEncadeadas.List.EmptyListException;

/**
 *
 * @author developer
 */
public class StackInheritanceTest {

    public static void main(String[] args) {
        StackInheritance<Integer> stack = new StackInheritance<>();

        // utiliza o método pushÿ
        stack.push(-1);
        stack.print();
        stack.push(0);
        stack.print();
        stack.push(1);
        stack.print();
        stack.push(5);
        stack.print();

        // remove itens de pilha
        try {
            int removedItem;

            while (true) {
                removedItem = stack.pop(); // utiliza o método popÿ
                System.out.printf("%n%d popped%n", removedItem);
                stack.print();
            }
        } catch (EmptyListException emptyListException) {
            emptyListException.printStackTrace();
        }
    }
}
