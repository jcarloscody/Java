package s10_memoria_array_listas;

public class BoxingUnboxingWrapperClasses {
    public static void main(String[] args) {

        /**
         * BOXING É o processo de conversão de um objeto tipo valor para um objeto tipo
         * referência compatível
         */
        int x = 10;
        Object obj = x;

        /**
         * UNBOXING É o processo de conversao de um objeto tipo referencia para um
         * objeto tipo valor compativel
         */
        int y = (int) obj;

        /**
         * WRAPPER CLASSES sao classes equivalentes aos tipos primitivos
         * 
         * boxing e unboxing é natural na linguagem
         * 
         * ou seja, wrapper classes tem objetivo de tratar os tipos primitivos como
         * classes, mas de uma forma transparentes ao compilador. sem vc precisar se
         * preocupar em fazer conversoees e casting
         * 
         * USO COMUM: campos de entidades em SI. A vantagem é que wrapper aceita valor
         * nulo, coisa que valor primitivo nao aceita
         */
        Integer objetoInteiro = x; // boxing com classe equivalente, ou seja, wrapper
        int a = objetoInteiro; // já que objetoInteiro usa um wrapper não é necessário fazer unbboxing

    }
}
