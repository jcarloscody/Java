package s20_ProgramacaoFuncionalEExpressoesLambda.Predicado;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;

        list.removeIf(new ProductPredicate()); // usando o predicate criado

        list.removeIf(Product::staticProductPredicate); // reference metodos

        list.removeIf(Product::nonStaticProductPredicate);

        // Expressão lambda declarada
        Predicate<Product> predicate = p -> p.getPrice() >= 100.0;
        list.removeIf(predicate);

        list.removeIf(Product::nonStaticProductPredicate);

        // • Expressão lambda inline e não declarada
        list.removeIf(p -> p.getPrice() >= min);
        // remover todo p tal que p >= min

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
