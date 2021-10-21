package s10_memoria_array_listas;

import java.util.Locale;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tamanho = 0;
        double[] numeros;

        System.out.println("Digite o tamanho desejado: ");
        tamanho = sc.nextInt();

        numeros = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o numero desejado: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Os números digitados foram: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%.0f%n", numeros[i]);
        }

        sc.close();
    }

    /**
     * VETOR é o nome dados aos arrays unidimensionais
     * 
     * arrays é homogêneo (dados do mesmo tipo)
     * 
     * é ordenado alocado de uma vez só, em um bloco contíguo de memória
     * 
     * de tamanho fixo possui dificuldades para se realizar insercoes e delecoes
     */
}
