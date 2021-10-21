package s20_ProgramacaoFuncionalEExpressoesLambda.Function;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {
    // function tem dois tipos: entrada, saida
    //

    @Override
    public String apply(Product p) {
        // entrada -> no metodo será o parametro
        // saida -> no metodo o tipo de retorno
        return p.getName().toUpperCase();
    }

}
