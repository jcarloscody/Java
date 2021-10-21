package cap10_POO_Polimorfismo_Interface_abstrato.EstudoDeCaso;

public abstract class Employee {
    /** pag 351 */
    /**
     * o. Às vezes é útil declarar as classes — chamadas classes abstratas — para as
     * quais você nunca pretende criar objetos. Como elas só são utilizadas como
     * superclasses em hierarquias de herança, são chamadas superclasses abstratas.
     * Essas classes não podem ser utilizadas para instanciar objetos, porque, como
     * veremos mais adiante, classes abstratas são incompletas. As subclasses devem
     * declarar as “partes ausentes” para que se tornem classes “concretas”, a
     * partir das quais você pode instanciar objetos. Do contrário, essas subclasses
     * também serão abstratas.
     */

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // construtor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
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

    // retorna o número do seguro social
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // retorna a representação de String do objeto Employee
    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(),
                getSocialSecurityNumber());
    }

    // O método abstract deve ser sobrescrito pelas subclasses concretas
    public abstract double earnings(); // nenhuma implementação aqui
    /**
     * Métodos abstratos não fornecem implementações. Uma classe que contém
     * quaisquer métodos abstratos deve ser expressamente declarada abstract, mesmo
     * que ela contenha alguns métodos concretos (não abstratos). Cada subclasse
     * concreta de uma superclasse abstrata também deve fornecer implementações
     * concretas de cada um dos métodos abstratos da superclasse. Os construtores e
     * métodos static não podem ser declarados abstract. Os construtores não são
     * herdados, portanto um construtor abstract nunca seria implementado. Embora
     * métodos não private static sejam herdados, eles não podem ser sobrescritos.
     * Como os métodos abstract devem ser sobrescritos para que possam processar
     * objetos com base em seus tipos, não faria sentido declarar um método static
     * como abstract.
     */

} // fim da classe abstrata Employee
