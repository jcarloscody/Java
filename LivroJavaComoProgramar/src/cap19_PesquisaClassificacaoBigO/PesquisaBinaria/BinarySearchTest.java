/*
Pesquisa binária
O algoritmo de pesquisa binária é mais eficiente que o de pesquisa linear, mas exige que o array seja classificado. A primeira 
iteração desse algoritmo testa o elemento no meio do array. Se isso corresponder à chave de pesquisa, o algoritmo termina. Supondo 
que o array seja classificado em ordem crescente, se a chave de pesquisa for menor que o elemento do meio, ela não poderá localizar 
nenhum elemento na segunda metade do array e o algoritmo continua com apenas a primeira metade do array (isto é, até o primeiro
elemento, mas sem incluir o elemento do meio). Se a chave de pesquisa for maior que o elemento no meio, ela não poderá localizar 
nenhum elemento na primeira metade do array e o algoritmo continua apenas com a segunda metade (isto é, o elemento depois do elemento do meio até o último elemento). Cada iteração testa o valor do meio da parte restante do array. Se a chave de pesquisa não 
corresponder ao elemento, o algoritmo eliminará metade dos elementos restantes. O algoritmo termina localizando um elemento que
corresponde à chave de pesquisa ou reduzindo o subarray ao tamanho zero.
 */
package cap19_PesquisaClassificacaoBigO.PesquisaBinaria;

// Utiliza a pesquisa binária para localizar um item em um array.
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {
    // realiza uma pesquisa binária sobre os dados 

    public static int binarySearch(int[] data, int key) {
        int low = 0; // extremidade baixa da área de pesquisa ÿ
        int high = data.length - 1; // extremidade alta da área de pesquisa ÿ
        int middle = (low + high + 1) / 2; // elemento do meio 
        int location = -1; // valor de retorno; -1 se não localizado 

        do // faz um loop para procurar o elementoÿ
        {
            // imprime os elementos remanescentes do array
            System.out.print(remainingElements(data, low, high));

            // gera espaços para alinhamento
            for (int i = 0; i < middle; i++) {
                System.out.print(" ");
            }
            System.out.println(" * "); // indica o meio atual

            // se o elemento for localizado no meio 
            if (key == data[middle]) {
                location = middle; // a localização é o meio atual 
            } else if (key < data[middle]) // elemento do meio é muito alto
            {
                high = middle - 1; // elimina a metade mais alta 
            } else // elemento do meio é muito baixo 
            {
                low = middle + 1; // elimina a metade mais alta 
            }
            middle = (low + high + 1) / 2; // recalcula o meio 
        } while ((low <= high) && (location == -1));

        return location; // retorna a localização da chave de pesquisa
    } // fim do método binarySearch 

    // método para gerar saída de certos valores no array
    private static String remainingElements(int[] data, int low, int high) {
        StringBuilder temporary = new StringBuilder();

        // acrescenta espaços para alinhamento
        for (int i = 0; i < low; i++) {
            temporary.append(" ");
        }

        // gera a saída dos elementos que permanecem no array 
        for (int i = low; i <= high; i++) {
            temporary.append(data[i] + " ");
        }

        return String.format("%s%n", temporary);
    } // fim do método remainingElements

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();

        int[] data = new int[15]; // cria o array

        for (int i = 0; i < data.length; i++) // preenche o array
        {
            data[i] = 10 + generator.nextInt(90);
        }

        Arrays.sort(data); // binarySearch requer array classificadoÿ
        System.out.printf("%s%n%n", Arrays.toString(data)); // exibe o array

        // obtém a entrada de usuário
        System.out.print("Please enter an integer value (-1 to quit): ");
        int searchInt = input.nextInt();

        // insere repetidamente um inteiro; -1 termina o programa
        while (searchInt != -1) {
            // realiza a pesquisa
            int location = binarySearch(data, searchInt);

            if (location == -1) // não encontrado
            {
                System.out.printf("%d was not found%n%n", searchInt);
            } else // encontrado
            {
                System.out.printf("%d was found in position %d%n%n",
                        searchInt, location);
            }

            // obtém a entrada de usuário
            System.out.print("Please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();
        }
    } // fim de main
} // fim da classe BinarySearchTest
