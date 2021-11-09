// Métodos StringBuilder insert, delete e deleteCharAt.
package cap14_stringCaracteresExpressoesregulares.StringBuilder;

/**
 *
 * @author developer
 */
public class StringBuilderInsertDelete {

    public static void main(String[] args) {
        Object objectRef = "hello";
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'K';
        int integerValue = 7;
        long longValue = 10000000;
        float floatValue = 2.5f; // o sufixo f indica que 2.5 é um tipo float
        double doubleValue = 33.333;

        StringBuilder buffer = new StringBuilder();

        buffer.insert(0, objectRef); // Cada método recebe seu segundo argumento, e o insere no índice especificado pelo primeiro argumento
        buffer.insert(0, " "); // cada um desses contém dois espaçosÿ
        buffer.insert(0, string);
        buffer.insert(0, " ");
        buffer.insert(0, charArray);
        buffer.insert(0, " ");
        buffer.insert(0, charArray, 3, 3);
        buffer.insert(0, " ");
        buffer.insert(0, booleanValue);
        buffer.insert(0, " ");
        buffer.insert(0, characterValue);
        buffer.insert(0, " ");
        buffer.insert(0, integerValue);
        buffer.insert(0, " ");
        buffer.insert(0, longValue);
        buffer.insert(0, " ");
        buffer.insert(0, floatValue);
        buffer.insert(0, " ");
        buffer.insert(0, doubleValue);
        System.out.printf("buffer after inserts:%n%s%n%n", buffer.toString());

        buffer.deleteCharAt(9); // exclui 5 em 2.5
        buffer.delete(2, 6); // exclui .333 em 33.333  . O método delete aceita dois argumentos — o índice inicial e o índice um além do fim dos caracteres a excluir

        System.out.printf("buffer after deletes:%n%s%n", buffer.toString());
    }
}
