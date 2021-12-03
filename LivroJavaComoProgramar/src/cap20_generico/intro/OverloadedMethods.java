/*
. Utilizamos arrays 
das classes empacotadoras de tipo para definir nosso exemplo de método genérico, porque somente tipos por referência podem ser 
usados para especificar os tipos genéricos em métodos e classes genéricos.
 */
package cap20_generico.intro;

// Imprimindo elementos do array com métodos sobrecarregados.
public class OverloadedMethods {

    public static void main(String[] args) {
        // cria arrays de Integer, Double e Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray); // passa um array de Integerÿ2
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray); // passa um array Doubleÿ
        System.out.print("%nArray characterArray contains:%n");
        printArray(characterArray); // passa um array de Characterÿ
    }
    
    /*Quando o compilador encontra uma chamada de método, ele tenta localizar uma declaração de método com o mesmo nome e 
com parâmetros que correspondam aos tipos de argumento da chamada. */

    // método printArray para imprimir um array de Integer
    public static void printArray(Integer[] inputArray) {
        // exibe elementos do array
        for (Integer element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    // método printArray para imprimir um array de Double
    public static void printArray(Double[] inputArray) {
        // exibe elementos do array
        for (Double element : inputArray) {
            System.out.printf("%s ", element);
        }

        System.out.println();
    }

    // método printArray para imprimir um array de Character
    public static void printArray(Character[] inputArray) {
        // exibe elementos do array
        for (Character element : inputArray) {
            System.out.printf("%s ", element);
        }

        System.out.println();
    }
} // fim da classe OverloadedMethods
