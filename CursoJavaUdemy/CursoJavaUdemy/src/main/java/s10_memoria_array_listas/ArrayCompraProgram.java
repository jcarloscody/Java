package s10_memoria_array_listas;

import java.util.Locale;
import java.util.Scanner;

public class ArrayCompraProgram {
    public static void main(String[] args) {

        String nome;
        double price;
        int tamanho = 0;
        ArrayCompraEntidade[] pedidos;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho desejado: ");
        tamanho = sc.nextInt();

        pedidos = new ArrayCompraEntidade[tamanho];

        for (int i = 0; i < pedidos.length; i++) {
            System.out.println("Digite o nome do móvel: ");
            nome = sc.next();
            System.out.println("Digite o preço do móvel: ");
            price = sc.nextDouble();
            pedidos[i] = new ArrayCompraEntidade(nome, price);
        }

        System.out.printf("Nomes   |   Preço%n");
        for (int i = 0; i < pedidos.length; i++) {
            System.out.printf("%s   R$ %.2f%n", pedidos[i].getNome(), pedidos[i].getPrice());
        }

        double total = 0;
        for (int i = 0; i < pedidos.length; i++) {
            total += pedidos[i].getPrice();
        }
        System.out.printf("Total --- R$ %.2f", total);

        sc.close();
    }
}
