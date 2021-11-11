/*
A classe Collections também fornece os métodos addAll, frequency e disjoint. 

O método Collections addAll aceita dois argumentos — uma Collection na qual inserir o(s) novo(s) elemento(s) e um array que fornece elementos a serem inseridos. 
O método frequency de Collections aceita dois argumentos — uma Collection a ser pesquisada e um Object a ser procurado na coleção. O método frequency retorna o número de vezes que o segundo argumento aparece na coleção. 
O método Collections disjoint aceita duas Collections e retorna true se elas não tiverem nenhum elemento em comum.
 */
package cap16_ColecoesGenericas.MetodosCollections.MetodosAddAllFrequencyDisjoint;

// Métodos Collections addAll, frequency e disjoint.
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Algorithms2 {

    public static void main(String[] args) {
        // inicializa list1 e list2
        String[] colors = {"red", "white", "yellow", "blue"};
        List<String> list1 = Arrays.asList(colors);
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("black"); // adiciona “black” ao final da list2
        list2.add("red"); // adiciona “red” ao final da list2
        list2.add("green"); // adiciona “green” ao final da list2
        System.out.print("Before addAll, list2 contains: ");

        // exibe os elementos em list2
        for (String s : list2) {
            System.out.printf("%s ", s);
        }

        Collections.addAll(list2, colors); // adiciona Strings colors à list2ÿ

        System.out.printf("%nAfter addAll, list2 contains: ");

        // exibe os elementos em list2
        for (String s : list2) {
            System.out.printf("%s ", s);
        }

        // obtém frequência de "red" 
        int frequency = Collections.frequency(list2, "red");
        System.out.printf("%nFrequency of red in list2: %d%n", frequency);

        // verifica se list1 e list2 têm elementos em comum 
        boolean disjoint = Collections.disjoint(list1, list2);

        System.out.printf("list1 and list2 %s elements in common%n", (disjoint ? "do not have" : "have"));
    }
} // fim da classe Algorithms2
