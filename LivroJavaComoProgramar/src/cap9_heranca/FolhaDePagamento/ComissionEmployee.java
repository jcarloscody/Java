// A classe CommissionEmployee representa um empregado que recebeu um
// percentual das vendas brutas.
package cap9_heranca.FolhaDePagamento;

public class ComissionEmployee extends Object {
    protected final String firstName; // protected: são visíveis para outras classes no mesmo pacote e para quem HERDA
    protected final String lastName;
    protected final String socialSecurityNumber;
    protected double grossSales; // vendas brutas semanais
    protected double commissionRate; // percentagem da comissão

    /*
     * Utilizar variáveis de instância protected cria vários problemas potenciais.
     * Primeiro, o objeto de subclasse pode configurar o valor de uma variável
     * herdada diretamente sem utilizar um método set.
     * 
     * Outro problema em utilizar as variáveis de instância protected é que é mais
     * provável que os métodos de subclasse sejam escritos para depender da
     * implementação de dados da superclasse. Na prática, as subclasses devem
     * depender somente dos serviços de superclasse (isto é, métodos não private), e
     * não da implementação de dados de superclasse.
     * 
     * Diz-se que essa classe é frágil ou quebradiça, porque uma pequena alteração
     * na superclasse pode “quebrar” a implementação da subclasse
     * 
     * Um terceiro problema é que os membros protected de uma classe são visíveis a
     * todas aquelas no mesmo pacote da que contém os membros protected — isso nem
     * sempre é desejável.
     */

    // construtor de cinco argumentos
    public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
            double commissionRate) {

        // a chamada implícita para o construtor padrão de Object ocorre aqui
        /*
         * os construtores não sao herdados, entao a classe ComissionEmployee nao herda
         * o construtor da classe object, mas continuam dispoível para serem chamados A
         * PRIMEIRA TAREFA de qq construtor de subclasse é chamar o construtor de sua
         * superclasse direta, explicita ou implicitamente(se nenhuma chamada de
         * construtor for especificada), para assegurar que as variaveis de instancia
         * herdadas da superclasse inicializem adequadamente. Nesse exemplo, o
         * construtor de classe chama a classe CommissionEmployee do construtor de
         * Object implicitamente.
         * 
         */

        // se grossSales é inválido, lança uma exceção
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        // se commissionRate é inválido, lança uma exceção
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    } // fim do construtor

    // retorna o nome
    public String getFirstName() {
        return firstName;
    }

    // retorna o sobrenome
    public String getLastName() {
        return lastName;
    }

    // retorna o número de seguro social
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // configura a quantidade de vendas brutas
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        this.grossSales = grossSales;
    }

    // retorna a quantidade de vendas brutas
    public double getGrossSales() {
        return grossSales;
    }

    // configura a taxa de comissão
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        this.commissionRate = commissionRate;
    }

    // retorna a taxa de comissão
    public double getCommissionRate() {
        return commissionRate;
    }

    // calcula os lucros
    public double earnings() {
        return commissionRate * grossSales;
    }

    // retorna a representação String do objeto CommissionEmployee ÿ
    @Override // indica que esse método substitui um método da superclasse - sobrescreve
    /*
     * essa anotação @Override é opcional para indicar que a seguinte declaração
     * (toString) deve sobrescrever um método da superclasse existente. essa
     * anotacao ajuda o compilador a capturar alguns erros comuns. se houver erro de
     * assinatura (tipos de parametros e numeros errados será emitido um erro quando
     * compilado: method does not override or implement a method from a
     * supertype(método nao sobrescreve ou umplementa um método a partir de um
     * supertipo). melhor é encontar erros em tempos de compilação do que em
     * execucao
     */
    public String toString() {
        /*
         * toString é um dos métodos que toda classe herda direta ou indiretamente da
         * classe Object. o método retornaa uma String que representa um objeto. Aqui
         * estamos SOBRESCREVENDO o método e para SOBRESCREVER um métdo de superclasse
         * uma subclasse deve declarar um método com a mesma assinatura(nome de método,
         * número de parametros, tipos de parametros e ordem dos tipos de parametros.
         * como o método de superclasse - o método to String de Object não aceita nenhum
         * parametro, entrao comissionEmployee declara to String sem parametro.
         */

        /*
         * é um erro de compilacao sobrescrever um método com um modificador de acesso
         * restrito. o método publico da super não pode se tornar private ou qq outro na
         * subclasse. uma vez declarado public em uma superclasse, ele permanecerá
         * public para todas as subclasses. tentar mudar viola o relacionamento é um.
         */
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber, "gross sales", grossSales, "commission rate",
                commissionRate);
    }

}
