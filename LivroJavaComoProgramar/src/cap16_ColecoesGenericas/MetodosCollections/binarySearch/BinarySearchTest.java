/*
O algoritmo de pesquisa binária de alta velocidade — que discutimos em detalhes na Seção 19.4 — é incorporado à estrutura 
das coleções do Java como um método static Collections binarySearch. Esse método localiza um objeto em uma List (por 
exemplo, uma LinkedList ou uma ArrayList). Se o objeto for encontrado, seu índice é retornado. Se o objeto não for localizado, 
binarySearch retorna um valor negativo.
 */
package cap16_ColecoesGenericas.MetodosCollections.binarySearch;

// Método binarySearch de Collections.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class BinarySearchTest {

    public static void main(String[] args) {
        //cria um ArrayList <String> a partir do conteúdo do array colors
        String[] colors = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));

        Collections.sort(list); // classifica a ArrayListÿ
        System.out.printf("Sorted ArrayList: %s%n", list);

        // pesquisa vários valores na lista
        printSearchResults(list, "black"); // primeiro item
        printSearchResults(list, "red"); // item do meio
        printSearchResults(list, "pink"); // último item
        printSearchResults(list, "aqua"); // abaixo do mais baixo
        printSearchResults(list, "gray"); // não existe
        printSearchResults(list, "teal"); // não existe
    }

    // realiza pesquisa e exibe o resultado
    private static void printSearchResults(List<String> list, String key) {
        int result = 0;

        System.out.printf("%nSearching for: %s%n", key);
        result = Collections.binarySearch(list, key);

        if (result >= 0) {
            System.out.printf("Found at index %d%n", result);
        } else {
            System.out.printf("Not Found (%d)%n", result);
        }
    }
} // fim da classe BinarySearchTest
