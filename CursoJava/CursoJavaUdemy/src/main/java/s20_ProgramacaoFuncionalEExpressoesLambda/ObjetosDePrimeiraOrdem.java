package s20_ProgramacaoFuncionalEExpressoesLambda;

import java.util.ArrayList;
import java.util.List;

import s20_ProgramacaoFuncionalEExpressoesLambda.ExperienciaComparator.Product;

public class ObjetosDePrimeiraOrdem {
    public class Program {
        public static int compareProducts(Product p1, Product p2) {
            return p1.getPrice().compareTo(p2.getPrice());
        }

        public static void main(String[] args) {

            List<Product> list = new ArrayList<>();
            list.add(new Product("TV", 900.00));
            list.add(new Product("Notebook", 1200.00));
            list.add(new Product("Tablet", 450.00));

            list.sort(Program::compareProducts);
            /**
             * Utilizamos aqui "method references" Operador :: Sintaxe: Classe::método
             */

            list.forEach(System.out::println);
        }
    }
}
