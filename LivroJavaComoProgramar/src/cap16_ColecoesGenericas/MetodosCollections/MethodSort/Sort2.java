/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap16_ColecoesGenericas.MetodosCollections.MethodSort;

// Utilizando um objeto Comparator com o método sort.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort2 {

    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Cria e exibe uma lista contendo os elementos do array naipes
        List<String> list = Arrays.asList(suits); // cria List
        System.out.printf("Unsorted array elements: %s%n", list);

        // classifica em ordem decrescente utilizando um comparador ÿ
        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("Sorted list elements: %s%n", list);
    }
} // fim da classe Sort2
