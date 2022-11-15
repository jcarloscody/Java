package s20_ProgramacaoFuncionalEExpressoesLambda.ExperienciaComparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {
    // Comparator é uma interface funcionarl, ou seja, leva consigo obrigatoriamente
    // um metodo abstrato, o metodo compare
    @Override
    public int compare(Product p1, Product p2) { //
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        /**
         * -1 p1 < p2
         * 
         * 0 p1 == p2
         * 
         * 1 p1 > p2
         */
    }
}
