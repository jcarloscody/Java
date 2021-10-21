package s20_ProgramacaoFuncionalEExpressoesLambda.FuncaoComoArgs;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<Product> list, Predicate<Product> criterio) {
        // vai receber uma lista e um predicado, ou seja, uma função

        double sum = 0.0;
        for (Product p : list) {
            if (criterio.test(p)) {
                // usa o metodo da interface generico test
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
