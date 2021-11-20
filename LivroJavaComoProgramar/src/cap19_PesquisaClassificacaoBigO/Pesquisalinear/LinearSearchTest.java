/*
Pesquisar dados envolve determinar se um valor (chamado de chave de pesquisa) está presente nos dados e, se estiver, encontrar a sua localização. Dois algoritmos de pesquisa famosos são a pesquisa linear simples e a mais rápida, porém mais complexa,
pesquisa binária. A classificação coloca os dados em uma ordem crescente ou decrescente, com base em uma ou mais chaves de 
classificação. 


Algoritmo de pesquisa linear
O algoritmo de pesquisa linear pesquisa cada elemento em um array sequencialmente. Se a chave de pesquisa não corresponder a um elemento no array, o algoritmo testa cada elemento e, quando alcança o fim do array, informa o usuário que a chave de 
pesquisa não está presente
 */
package cap19_PesquisaClassificacaoBigO.Pesquisalinear;

// Pesquisando sequencialmente um item em um array.
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchTest {
    // realiza uma pesquisa linear nos dados ÿ

    public static int linearSearch(int data[], int searchKey) {
        // faz um loop pelo array sequencialmente ÿ
        for (int index = 0; index < data.length; index++) {
            if (data[index] == searchKey) {
                return index; // retorna o índice de inteiros ÿ
            }
        }
        return -1; // inteiro não foi localizado ÿ
    } // fim do método linearSearch ÿ

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();

        int[] data = new int[10]; // cria o array

        for (int i = 0; i < data.length; i++) // preenche o array
        {
            data[i] = 10 + generator.nextInt(90);
        }

        System.out.printf("%s%n%n", Arrays.toString(data)); // exibe o array

        // obtém a entrada de usuário
        System.out.print("Please enter an integer value (-1 to quit): ");
        int searchInt = input.nextInt();

        // insere repetidamente um inteiro; -1 termina o programa
        while (searchInt != -1) {
            int position = linearSearch(data, searchInt); // realiza a pesquisa
            if (position == -1) // não encontrado
            {
                System.out.printf("%d was not found%n%n", searchInt);
            } else // encontrado
            {
                System.out.printf("%d was found in position %d%n%n",
                        searchInt, position);
            }

            // obtém a entrada de usuário
            System.out.print("Please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();
        }
    } // fim de main
} // fim da classe LinearSearchTest
