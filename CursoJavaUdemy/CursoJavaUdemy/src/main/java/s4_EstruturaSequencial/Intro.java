
package s4_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Intro {

    public static void main(String[] args) {
        int y = 10;
        double x = 10.23242;
        String nome = "curso";
        String p = "%";

        int a = 10, b = 3;
        double div;

        System.out.println("Começando o Curso!");
        System.out.printf("formato BR:  %.2f \n", x); // 10,23

        Locale.setDefault(Locale.US);// trocar o formato do divisor de , para . conforme a prática do US
        System.out.printf("formato US:  %.2f \n", x); // 10.23

        System.out.printf("O %s  com R$ %.2f reais  e %d%s  de desconto", nome, x, y, p);

        div = a / b;
        System.out.println("\n" + div);
        div = (double) a / b;
        System.out.printf("%.2f", div);

        // ENTRADA DE DADOS
        Scanner sc = new Scanner(System.in);
        String ident;
        double n1, n2;

        System.out.println("\n Digite seu nome:");
        ident = sc.nextLine(); // LER A LINHA TODA
        System.out.println("Digite sua nota:");
        n1 = sc.nextDouble();
        System.out.println("Digite sua nota:");
        n2 = sc.nextDouble();
        double media = (n1 + n2) / 2;
        System.out.printf("%s: %.2f", "Media", media);
        System.out.println("\n" + ident);

        // FUNCOES MATEMATICA
        double raizq = 25;
        double exponenciacao = 2;
        double absoluto = -10;

        double raizquadrada = Math.sqrt(raizq); // raiz quadrada
        double expon = Math.pow(exponenciacao, 2); // exponenciacao
        double abs = Math.abs(absoluto); // absokyto

        System.out.printf("%s %.2f", "raiz quadrada ", raizquadrada);

    }

}
