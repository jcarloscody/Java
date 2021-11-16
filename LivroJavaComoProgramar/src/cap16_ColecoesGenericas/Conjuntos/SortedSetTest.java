/*
A estrutura de coleções também inclui a interface SortedSet (que estende Set) para conjuntos que mantêm seus elementos 
em ordem classificada — a ordem natural dos elementos (por exemplo, números estão em ordem crescente) ou uma ordem especificada por um Comparator.


 */
package cap16_ColecoesGenericas.Conjuntos;

// Usando SortedSets e TreeSets.
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

    public static void main(String[] args) {
        // cria TreeSet a partir do array colors
        String[] colors = {"yellow", "green", "black", "tan", "grey","white", "orange", "red", "green"};
        SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));

        System.out.print("sorted set: ");
        printSet(tree);

        // obtém headSet com base em "orange"
        System.out.print("headSet (\"orange\"): ");
        printSet(tree.headSet("orange")); //o método TreeSet headSet para obter um subconjunto do TreeSet em que cada elemento é menor que "orange"

        // obtém tailSet baseado em "orange"
        System.out.print("tailSet (\"orange\"): ");
        printSet(tree.tailSet("orange"));//chama o método TreeSet tailSet para obter um subconjunto em que cada elemento é maior ou igual a “orange”
        
// obtém primeiro e último elementos
        System.out.printf("first: %s%n", tree.first());
        System.out.printf("last : %s%n", tree.last());
    }

    // envia SortedSet para a saída usando a instrução for aprimorada
    private static void printSet(SortedSet<String> set) {
        for (String s : set) {
            System.out.printf("%s ", s);
        }

        System.out.println();
    }
} // fim da classe SortedSetTest
