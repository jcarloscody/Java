package cap10_POO_Polimorfismo_Interface_abstrato.Caso_Interface;

public interface Pagamento {
    /**
     * Antes do Java SE 8, os métodos de interface só poderiam ser public abstract.
     * Isso significava que uma interface especificava quais operações uma classe de
     * implementação deveria realizar, mas não como a classe deveria realizá-las.
     */

    double getPaymentAmount(); // calcula pagamento; nenhuma implementação

    /**
     * No Java SE 8, interfaces também podem conter métodos default public com
     * implementações padrão concretas que especificam como as operações são
     * realizadas quando uma classe de implementação não sobrescreve os métodos. Se
     * uma classe implementar uma interface desse tipo, a classe também recebe as
     * implementações default da interface (se houver alguma). Para declarar um
     * método default, insira a palavra-chave default antes do tipo de retorno do
     * método e forneça uma implementação concreta de método.
     */

    default double x() {
        return 3;
    }

    /**
     * 10.10.3 Interfaces funcionais A partir do SE 8 Java, qualquer interface que
     * contém apenas um método abstract é conhecida como interface funcional. Há
     * muitas dessas interfaces ao longo das APIs do Java SE 7, e muitas novas no
     * Java SE 8. Algumas interfaces funcionais que você utilizará neste livro
     * incluem: • ActionListener (Capítulo 12) — você implementará essa interface
     * para definir um método que é chamado quando o usuário clica em um botão. •
     * Comparator (Capítulo 16) — você implementará essa interface para definir um
     * método que pode comparar dois objetos de um determinado tipo para determinar
     * se o primeiro objeto é menor, igual ou maior que o segundo. • Runnable
     * (Capítulo 23) — você implementará essa interface para definir uma tarefa que
     * pode ser executada em paralelo com outras partes do seu programa. Interfaces
     * funcionais são usadas extensivamente com novas capacidades lambda do Java SE
     * 8 que apresentamos no Capítulo 17. No Capítulo 12, muitas vezes você
     * implementará uma interface criando uma classe interna anônima que implementa
     * o(s) método(s) da interface. No Java SE 8, lambdas fornecem uma notação
     * abreviada para criar métodos anônimos que o compilador converte
     * automaticamente em classes interiores anônimas para você.
     */
}
