package s15_TratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PilhaDeChamadaDeMetodoEFinally {
    public static void main(String[] args) {
        pilha1();

    }

    static void pilha1() {
        System.out.println("**** METODO1 PILHA");
        pilha2();
        System.out.println("**** METODO1 PILHA FIM");
    }

    static void pilha2() {
        System.out.println("**** METODO2 PILHA");
        Scanner sc = new Scanner(System.in);

        String[] nomes;

        Integer p, i = 0;

        try {

            System.out.println("Digite um conjunto de nomes:");
            nomes = sc.nextLine().split(" ");
            System.out.println("Digite uma posição:");
            p = sc.nextInt();
            i = nomes.length;
            System.out.println(nomes[p]);

        } catch (ArrayIndexOutOfBoundsException ee) {
            System.out.println("O array possue " + i);
            ee.printStackTrace(); // vai imprimir na tela o rastreamento do stack, vai mostrar toda a chamada de
                                  // metodos que acarretou naquela exceção
        } catch (InputMismatchException e) {
            System.out.println("voce digitou carater em vez de inteiro ");
        } finally {
            /**
             * é o bloco que contem o codigo a ser executado independentemente de ter
             * ocorrido ou não uma exceção
             * 
             * exemplo: fechar um arquivo, conexao do bd, ou outro recurso específico ao
             * final do processmento.
             */

        }

        sc.close();

        System.out.println("**** METODO2 PILHA FIM");
    }
}
