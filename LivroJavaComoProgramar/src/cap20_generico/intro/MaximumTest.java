/*
 O aplicativo utiliza um método genérico maximum para determinar e retornar o maior dos seus três argumentos do 
mesmo tipo. Infelizmente, o operador relacional > não pode ser utilizado com tipos por referência. Entretanto, é possível comparar 
dois objetos da mesma classe se essa classe implementar a interface genérica Comparable<T> (do pacote java.lang). Todas as 
classes empacotadoras de tipo para tipos primitivos implementam essa interface


Ao declarar uma classe que implementa Comparable<T>, você deve implementar o método compareTo a fim de comparar o 
conteúdo dos dois objetos dessa classe e retornar os resultados da comparação. Como especificado na documentação da interface 
Comparable<T>, compareTo deve retornar 0 se os objetos forem iguais, um inteiro negativo se object1 for menor que object2
ou um inteiro positivo se object1 for maior que object2. Por exemplo, o método compareTo da classe Integer compara os valores de int armazenados em dois objetos Integer. Um benefício da implementação da interface Comparable<T> é que objetos 
Comparable<T> podem ser utilizados com os métodos de classificação e pesquisa da classe Collections (pacote java.util).
 */
package cap20_generico.intro;

// O método genérico maximum retorna o maior dos três objetos.
public class MaximumTest {

    public static void main(String[] args) {
        System.out.printf("Maximum of %d, %d and %d is %d%n%n", 3, 4, 5,
                maximum(3, 4, 5));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f%n%n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
        System.out.printf("Maximum of %s, %s and %s is %s%n", "pear",
                "apple", "orange", maximum("pear", "apple", "orange"));
    }

    // determina o maior dos três objetos Comparable ÿ
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        /*As declarações do parâmetro de tipo que limitam o parâmetro 
sempre utilizam a palavra-chave extends, independentemente de o parâmetro de tipo estender uma classe ou implementar uma 
interface*/
        T max = x; // supõe que x é inicialmente o maior 

        if (y.compareTo(max) > 0) {
            max = y; // y é o maior até agora ÿ
        }
        if (z.compareTo(max) > 0) {
            max = z; // z é o maior ÿ
        }
        return max; // retorna o maior objeto ÿ
    }

    /*public static Comparable maximum(Comparable x, Comparable y, Comparable z) {
        Comparable max = x; // supõe que x é inicialmente o maior 

        if (y.compareTo(max) > 0) {
            max = y; // y é o maior até agora
        }
        if (z.compareTo(max) > 0) {
            max = z; // z é o maior
        }
        return max; // retorna o maior objeto
    }*/
} // fim da classe MaximumTest
