package s20_ProgramacaoFuncionalEExpressoesLambda.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Function<Product, String> func = p -> p.getName().toUpperCase();

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        // lista.convertestream().aplicamap(passaUmFunction).converteParaListaComCOLLECTION

        List<String> names2 = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        names.forEach(System.out::println);

        /**
         * Nota sobre a função map
         * 
         * • A função "map" (não confunda com a estrutura de dados Map) é uma função que
         * aplica uma função a todos elementos de uma stream(sequencia de dados) gerando
         * uma nova stream com os elementos transformados, ou seja, a funcao map não
         * funciona a partir de uma lista, mas a partir de uma stream. DESTA forma
         * convertemos a lista para stream, aplicamos o map, e depois convertemos a
         * stream de volta para a lista
         * 
         * • Conversões:
         * 
         * • List para stream: .stream() • Stream para List:
         * .collect(Collectors.toList())
         */
    }
}
