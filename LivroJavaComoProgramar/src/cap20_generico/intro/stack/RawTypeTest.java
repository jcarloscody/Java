/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap20_generico.intro.stack;

/**
 *
 * @author developer
 */
public class RawTypeTest {
    public static void main(String[] args)
 {
 Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
 Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

// Pilha de tipos brutos atribuídos à classe Stack da variável de tipos brutosÿ
Stack rawTypeStack1 = new Stack(5); 
// Stack <Double> atribuído à Stack da variável de tipos brutosÿ
Stack rawTypeStack2 = new Stack<Double>(5); 

// Pilha dos tipos brutos atribuídos à variável Stack<Integer>ÿ
Stack<Integer> integerStack = new Stack(10); 

testPush("rawTypeStack1", rawTypeStack1, doubleElements);
 testPop("rawTypeStack1", rawTypeStack1);
 testPush("rawTypeStack2", rawTypeStack2, doubleElements);
 testPop("rawTypeStack2", rawTypeStack2);
 testPush("integerStack", integerStack, integerElements);
 testPop("integerStack", integerStack);
 } 
  // método genérico insere elementos na pilha
 public static <T> void testPush(String name, Stack<T> stack,
 T[] elements)
 {
 System.out.printf("%nPushing elements onto %s%n", name);

 // insere elementos na Stack
 for (T element : elements)
 {
 System.out.printf("%s ", element);
 stack.push(element); // insere o elemento na pilha
 }
 }

 // método genérico testPop remove elementos da pilha
 public static <T> void testPop(String name, Stack<T> stack)
 {
 // remove elementos da pilha
 try
 {
 System.out.printf("%nPopping elements from %s%n", name);
 T popValue; // armazena o elemento removido da pilha

 // remove elementos da Stack
 while (true)
 {
 popValue = stack.pop(); // remove da pilha
 System.out.printf("%s ", popValue);
 }
 } // fim do try
 catch(EmptyStackException emptyStackException)
{
 System.out.println();
 emptyStackException.printStackTrace();
 }
 }
}
