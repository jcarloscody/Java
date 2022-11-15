package s8_IntroPOO.App;

import java.util.Locale;
import java.util.Scanner;

import s8_IntroPOO.Entidade.Estoque;

public class ProgramEstoque {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Estoque estoque = new Estoque();

        System.out.println("Nome do produto: ");
        estoque.name = sc.nextLine();
        System.out.println("Preço do Produto: ");
        estoque.price = sc.nextDouble();
        System.out.println("Quantidade em produto: ");
        estoque.quantidade = sc.nextInt();

        System.out.println(estoque);

        System.out.println("Digite a quantidade de produtos que vc quer add: ");
        int q = sc.nextInt();
        estoque.adicionarProduto(q);

        System.out.println(estoque);

        System.out.println("Digite a quantidade de produtos que vc quer remover: ");
        q = sc.nextInt();
        if (!estoque.removerProdutos(q)) {
            System.out.println("Digite a quantidade de produtos que vc quer remover: ");
            q = sc.nextInt();
            estoque.removerProdutos(q);
        }

        System.out.println(estoque);
        sc.close();
    }
}
