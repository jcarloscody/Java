package s19_GenericsSetMap.HashCodeEqualsSet.Produto;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        System.out.println(set.contains(prod)); // dará falso se a classe product nao tiver a implementacao de hashcode
                                                // Equals, irá entao usar a referencia de ponteiro e como são instancias
                                                // diferente entao false
    }
}
