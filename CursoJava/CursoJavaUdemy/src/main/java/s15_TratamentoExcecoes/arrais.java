package s15_TratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class arrais {
    public static void main(String[] args) {
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

        } catch (ArrayIndexOutOfBoundsException ee) { // VAI PEGAR A EXCEÇÃO QUE DETECTA Q O INDICE SOLICITADO NAO
                                                      // EXISTE NO ARRAY
            System.out.println("O array possue " + i);
        } catch (InputMismatchException e) { // VAI PEGAR A EXCEÇÃO QUE DETECTA QUE O INPUT QUE USER DIGITOU ESTÁ
                                             // EQUIVOCADO
            System.out.println("voce digitou carater em vez de inteiro ");
        }
        sc.close();
    }
}
