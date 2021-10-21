package s20_ProgramacaoFuncionalEExpressoesLambda.ExperienciaComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // Com a classe criada MyComparator
        list.sort(new MyComparator());

        // com sintaxe de classe anonima. criamos um objeto comp de Comparable e defimos
        // uma classe anonima
        Comparator<Product> classeAnonima = new Comparator<Product>() {

            @Override
            public int compare(Product p1, Product p2) {
                // TODO Auto-generated method stub
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }

        };

        list.sort(classeAnonima);

        // Expressão Lambda - fubncao lambbda ou arrow function
        Comparator<Product> expressaoLambda = (p1, p2) -> {
            // o compilador faz uma inferencia de tipos, dispensa colocar Product p1,
            // Product p2
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };
        list.sort(expressaoLambda);

        // versão mais cumprimida da lambda
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
