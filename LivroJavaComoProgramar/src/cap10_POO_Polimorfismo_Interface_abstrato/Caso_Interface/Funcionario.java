package cap10_POO_Polimorfismo_Interface_abstrato.Caso_Interface;

public abstract class Funcionario implements Pagamento {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // construtor
    public Funcionario(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

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

    // retorna a representação de String do objeto Employee
    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(),
                getSocialSecurityNumber());
    }
    /**
     * Lembre-se de que, quando uma classe implementa uma interface, a classe faz um
     * contrato com o compilador afirmando que a classe implementará cada método na
     * interface ou a classe será declarada abstract. Como a classe Employee não
     * fornece um método getPaymentAmount, a classe deve ser declarada abstract.
     * Qualquer subclasse concreta da classe abstract deve implementar os métodos de
     * interface para cumprir o contrato da superclasse com o compilador. Se a
     * subclasse não fizer isso, ela também deverá ser declarada abstract. Como
     * indicado pelos comentários nas linhas 45 e 46, a classe Employee da Figura
     * 10.13 não implementa o método getPaymentAmount, portanto a classe é declarada
     * abstract. Cada subclasse Employee direta herda o contrato da superclasse para
     * implementar o método getPaymentAmount e assim deve implementar esse método
     * para tornar-se uma classe concreta na qual os objetos podem ser instanciados.
     * Uma classe que estende uma das subclasses concretas de Employee herdará uma
     * implementação de getPaymentAmount e assim também será uma classe concreta.
     */

    // Observação: não implementamos o método getPaymentAmount de Payable aqui,
    // assim essa classe deve ser declarada abstrata para evitar um erro de
    // compilação.

} // fim da classe abstrata Employee