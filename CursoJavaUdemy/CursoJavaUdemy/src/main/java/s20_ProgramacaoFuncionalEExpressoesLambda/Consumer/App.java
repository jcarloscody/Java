package s20_ProgramacaoFuncionalEExpressoesLambda.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {
    /**
     * Problema exemplo
     * 
     * Fazer um programa que, a partir de uma lista de produtos, aumente o preço dos
     * produtos em 10%.
     */
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double factor = 1.1;

        // metodo default que vai pecorrer a colecao e vai executar um consumer nessa
        // colecao para cada elemento
        list.forEach(new PriceUpdate());

        list.forEach(Product::staticPriceUpdate);

        list.forEach(Product::nonStaticPriceUpdate);

        // expressao lambda declarada
        Consumer<Product> sConsumer = p -> {
            // vc pode usar chaves tbm
            p.setPrice(p.getPrice() * 1.1);
        };

        list.forEach(sConsumer);
        // ou outra forma de expressao lambda declarada
        Consumer<Product> sConsumer2 = p -> p.setPrice(p.getPrice() * 1.1);

        // forma inline
        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        list.forEach(System.out::println);

    }
}
