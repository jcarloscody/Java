package s19_GenericsSetMap.Intro;

import java.util.Scanner;

/**
 * Deseja-se fazer um programa que leia uma quantidade N, e depois N nomes de
 * pessoas. Ao final, imprima esses números de forma organizada conforme
 * exemplo. Em seguida, informar qual foi o primeiro valor informado.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>();
        // <Interger> - indicando o tipo da classe
        // <> - indica que está instanciando um tipo generics,
        // no segundo <>, é opcional colocar Interger

        System.out.print("How many values?");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            printService.addValue(value);
        }

        printService.print();
        System.out.println(printService.first());

        scanner.close();
    }
}
