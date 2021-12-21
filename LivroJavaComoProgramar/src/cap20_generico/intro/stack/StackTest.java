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
public class StackTest {
    public static void main(String[] args)
{
 double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
 int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

// Criando um Stack<Double> e um Stack<Integer>ÿ
Stack<Double> doubleStack = new Stack<>(5); 
Stack<Integer> integerStack = new Stack<>(); 

 // coloca os elementos de doubleElements em doubleStack
testPushDouble(doubleStack, doubleElements);
 testPopDouble(doubleStack); // remove de doubleStack

 // coloca os elementos de integerElements em integerStack
testPushInteger(integerStack, integerElements);
 testPopInteger(integerStack); // remove de integerStack
 }

 // testa o método push com a pilha de double
 private static void testPushDouble(
 Stack<Double> stack, double[] values)
 {
 System.out.printf("%nPushing elements onto doubleStack%n");

 // insere elementos na Stack
 for (double value : values)
 {
 System.out.printf("%.1f ", value);
stack.push(value); // insere em doubleStackÿ
 }
 }

 // testa o método pop com a pilha de double
 private static void testPopDouble(Stack<Double> stack)
 {
 // remove elementos da pilha
 try
 {
 System.out.printf("%nPopping elements from doubleStack%n");
 double popValue; // armazena o elemento removido da pilha

 // remove todos os elementos da Stack
 while (true)
 {
popValue = stack.pop(); // remove de doubleStackÿ
 System.out.printf("%.1f ", popValue);
 }
 }
 catch(EmptyStackException emptyStackException)
{
 System.err.println();
 emptyStackException.printStackTrace();
 }
 }

 // testa o método push com a pilha de integer
 private static void testPushInteger(
 Stack<Integer> stack, int[] values)
 {
 System.out.printf("%nPushing elements onto integerStack%n");
// insere elementos na Stack
 for (int value : values)
 {
 System.out.printf("%d ", value);
stack.push(value); // insere em integerStackÿ
 }
 }

 // testa o método pop com a pilha de integer
 private static void testPopInteger(Stack<Integer> stack)
 {
 // remove elementos da pilha
 try
 {
 System.out.printf("%nPopping elements from integerStack%n");
 int popValue; // armazena o elemento removido da pilha

 // remove todos os elementos da Stack
 while (true)
 {
popValue = stack.pop(); // remove de intStackÿ
 System.out.printf("%d ", popValue);
 }
 }
 catch(EmptyStackException emptyStackException)
 {
 System.err.println();
 emptyStackException.printStackTrace();
 }
 } 
    
}
