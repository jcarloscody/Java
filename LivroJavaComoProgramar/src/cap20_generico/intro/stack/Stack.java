package cap20_generico.intro.stack;
/*
O conceito de uma estrutura de dados, como uma pilha, pode ser entendido independentemente do tipo de elemento que ela
manipula. Classes genéricas fornecem um meio de descrever o conceito de uma pilha (ou de qualquer outra classe) de uma maneira
independente do tipo. Podemos então instanciar objetos específicos de tipo da classe genérica. Genéricos fornecem uma boa oportunidade para reutilização de software.
Uma vez que tem uma classe genérica, você pode utilizar uma notação concisa e simples para indicar o(s) tipo(s) que deve(m)
ser utilizado(s) no lugar do(s) parâmetro(s) de tipo da classe. Em tempo de compilação, o compilador garante a segurança de tipo
do seu código e utiliza as técnicas de erasure descritas nas seções 20.3 e 20.4 para permitir que o código do seu cliente interaja com
a classe genérica.
Uma classe Stack genérica, por exemplo, poderia ser a base para criar muitas classes Stack lógicas (por exemplo, “Stack de
Double”, “Stack de Integer”, “Stack de Character”, “Stack de Employee”). Essas classes são conhecidas como classes parametrizadas ou tipos parametrizados porque aceitam um ou mais parâmetros. Lembre-se de que parâmetros de tipo só representam
tipos por referência, o que significa que a classe Stack genérica não pode ser instanciada com tipos primitivos. Entretanto, é possível
instanciar uma Stack que armazena objetos das classes empacotadoras de tipo do Java e permitir que o Java utilize o autoboxing
para converter os valores primitivos em objetos
*/
// Figura 20.7: Stack.java
// Declaração da classe genérica Stack.
import java.util.ArrayList;



public class Stack<T> {
    
private final ArrayList<T> elements; // ArrayList armazena elementos da pilhaÿ

 // construtor sem argumento cria uma pilha do tamanho padrão
 public Stack() {
 this(10); // tamanho padrão da pilha
 }

 // construtor cria uma pilha com o número especificado de elementos
 public Stack(int capacity)
 {
 int initCapacity = capacity > 0 ? capacity : 10; // valida
elements = new ArrayList<T>(initCapacity); // cria a ArrayListÿ
 }

 // insere o elemento na pilha
public void push(T pushValue)
 {
elements.add(pushValue); // insere pushValue na Stackÿ
 }
// retorna o elemento superior se não estiver vazia; do contrário lança uma EmptyStackException
 public T pop()
 {
 if (elements.isEmpty()){ // se a pilha estiver vazia
    throw new EmptyStackException("Stack is empty, cannot pop");}

 // remove e retorna o elemento superior da Stack
 return elements.remove(elements.size() - 1);
 }
 } // fim da classe Stack<T>
