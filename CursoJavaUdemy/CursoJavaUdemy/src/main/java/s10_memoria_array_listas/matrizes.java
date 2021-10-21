package s10_memoria_array_listas;

import java.util.Scanner;

public class matrizes {
    public static void main(String[] arg) {
        int[][] matriz = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println(matriz.length);
        System.out.println(matriz[0].length);

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                matriz[l][c] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("matriz");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.println(matriz[l][c]);
            }
        }
        System.out.println("acabbou");
    }
}
