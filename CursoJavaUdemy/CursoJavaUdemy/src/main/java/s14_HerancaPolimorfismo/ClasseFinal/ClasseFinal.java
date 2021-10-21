package s14_HerancaPolimorfismo.ClasseFinal;

public final class ClasseFinal {
    // quando vc quer que essa classe não seja utilizada em herança

    public final void metodoFinal() {
        // quando vc quer que um método não seja sobrescrito

    }

    /**
     * PARA QUE?
     * 
     * SEGURANÇA: dependendo da regra de negocio, as vezes é desejavel garantir que
     * uma classe nao seja herdada, ou que um metodo nao seja sobreposto
     * 
     * geralmente convem acrescentar final em metodos sobrepostos, pois
     * sobreposiçoes multiplas podem ser uma porta de entrada para inconsistencia.
     * 
     * PERFORMANCE: atributos de tipo de uma classe final sao analisados de forma
     * mais rapida em tempo de execucao. Exemplo Classico - String
     */
}
