package s9_ConstNew;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEstoque {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Nome do produto: ");
        String name = sc.nextLine();
        System.out.println("Preço do Produto: ");
        double price = sc.nextDouble();
        System.out.println("Quantidade em produto: ");
        int quantidade = sc.nextInt();

        Estoque estoque = new Estoque(name, price, quantidade); // construtor um

        Estoque estoque2 = new Estoque(name, price); // construtor dois com apenas dois args

        Estoque estoque3 = new Estoque();// objeto usando o construtor padrao

        /*
         * System.out.println(estoque);
         * 
         * System.out.println("Digite a quantidade de produtos que vc quer add: "); int
         * q = sc.nextInt(); estoque.adicionarProduto(q);
         * 
         * System.out.println(estoque);
         * 
         * System.out.println("Digite a quantidade de produtos que vc quer remover: ");
         * q = sc.nextInt(); if (!estoque.removerProdutos(q)) {
         * System.out.println("Digite a quantidade de produtos que vc quer remover: ");
         * q = sc.nextInt(); estoque.removerProdutos(q); }
         * 
         * System.out.println(estoque);
         */
        sc.close();
    }
}
