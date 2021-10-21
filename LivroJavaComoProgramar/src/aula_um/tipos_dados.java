package aula_um;

/**
 *
 * @author josue
 */
public class tipos_dados {
    public static void main(String[] args) {

        /*
         * INTEIRO byte - 8 short - 16 int - 32 -> este é o padrão. long - 64
         */

        short v = 2;
        byte x = 3;
        byte r;
        // fazendo casting, pois para o java leva em consideração o padrão int
        r = (byte) (x + v);

        long g = 777777774444l; // quando a variável for do tipo long, é necessário pôr o l no final

        /*
         * FLUTUANTE (reais) double - 64 -> ESTE é o padrão float - 32
         */

        double t = 2.3;
        float e = 3.3f; // precisa-se pôr o f para indicar o float
        float q = (float) 4.4; // um casting para o float

        /*
         * CARACTER String - ñ é um tipo primitivo, mas uma classe. em outras linguagens
         * é um tipo primitivo
         */

        char p = 'b';
        char po = '\102'; // sequencia octal
        char poi = '\u0042'; // hexadecimal

        /** MODIFICADORES final static transient volatile public private */
        final double gravidade = 9.810;
        /**
         * define uma constante. Na declaração de uma constante, o seu valor já deve ser
         * definido.
         */

        /**
         * • transient: usado em serialização de dados para informar que a variável não
         * deve ser salva como parte integrante do objeto. Não vale para campos
         * estáticos.
         * 
         * 
         * volatile: usado para informar o compilador que ele não deve tentar fazer
         * otimizações com esta variável. Vale para campos usados em linhas de execução
         * (threads) sincronizadas.
         */
    }

    static double a = 1;
    /**
     * static: usado para declarar variáveis estáticas ou globais que são acessíveis
     * somente através da classe e independente da criação de objetos. As variáveis
     * estáticas são alocadas na hora em que a classe é carregada.
     * 
     * só há uma cópia dela independente do número de objetos criados
     * 
     * Cada novo objeto criado tem acesso a esta variável e ela pode ser usada como
     * forma de definir valores globais visíveis entre objetos
     */
}
