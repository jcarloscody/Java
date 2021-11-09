
package cap14_stringCaracteresExpressoesregulares.StringBuilder;

/**
 *
 * @author developer
 */
public class VariosMetodos {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Hello, how are you?");

        /*os métodos length e capacity para retornar o número de caracteres atualmente em um StringBuilder e o número de caracteres que pode ser armazenado em um StringBuilder sem alocar mais memória, respectivamente.*/
        System.out.printf("buffer = %s%nlength = %d%ncapacity = %d%n%n", buffer.toString(),
                buffer.length(),
                buffer.capacity());

        buffer.ensureCapacity(75);//O método ensureCapacity garante que um StringBuilder tenha pelo menos a capacidade especificada
        System.out.printf("New capacity = %d%n%n", buffer.capacity());

        buffer.setLength(10);//setLength aumenta ou diminui o comprimento de uma StringBuilder
        System.out.printf("New length = %d%nbuffer = %s%n", buffer.length(), buffer.toString());
         System.out.printf("New capacity = %d%n%n", buffer.capacity());
        
        //Aumentar a capacidade de um StringBuilder dinamicamente pode exigir um tempo relativamente longo. Executar um grande
        //número dessas operações pode degradar o desempenho de um aplicativo. Se o tamanho de um StringBuilder vai aumentar significativamente, possivelmente múltiplas vezes, configurar sua capacidade alta no início aumentará o desempenho.
        
        
    }
}
