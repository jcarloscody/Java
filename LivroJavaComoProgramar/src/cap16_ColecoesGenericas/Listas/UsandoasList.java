/*Erro comum de programação 16.2
Passar um array que contém dados para toArray pode causar erros de lógica. Se o número de elementos no array for menor que o 
número de elementos na lista em que toArray é chamado, um novo array é alocado para armazenar os elementos da lista — sem 
preservar os elementos do argumento de array. Se o número de elementos no array for maior que o número de elementos na lista, 
os elementos do array (iniciando no índice zero) serão sobrescritos pelos elementos da lista. Os elementos do array que não são
sobrescritos retêm seus valores*/

package cap16_ColecoesGenericas.Listas;

// Visualizando arrays como Lists e convertendo Lists em arrays.
import java.util.LinkedList;
import java.util.Arrays;

public class UsandoasList {

    // cria uma LinkedList, adiciona elementos e converte em array
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));//A classe Arrays fornece o método asList static para visualizar um array (às vezes chamado array de apoio) como uma coleção List. Uma visualização List permite que você manipule o array como se ele fosse uma lista. 

        links.addLast("red"); // adiciona como o último item 
        links.add("pink"); // adiciona ao final ÿ
        links.add(3, "green"); // adiciona no terceiro índice ÿ
        links.addFirst("cyan"); // adiciona como primeiro itemÿ

        // obtém elementos LinkedList como um array ÿ
        colors = links.toArray(new String[links.size()]);//Quaisquer modificações feitas por meio da visualização  List alteram o array, e todas as modificações feitas no array alteram a visualização List. A única operação permitida na visualização retornada por asList é set, o que altera o valor da visualização e o array de apoio. Qualquer outra tentativa de alterar a visualização (como adicionar ou remover elementos) resulta em uma UnsupportedOperationException.

        System.out.println("colors: ");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
