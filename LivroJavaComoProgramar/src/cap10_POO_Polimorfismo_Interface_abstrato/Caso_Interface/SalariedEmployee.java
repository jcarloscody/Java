package cap10_POO_Polimorfismo_Interface_abstrato.Caso_Interface;

// Figura 10.14: SalariedEmployee.java
// A classe SalariedEmployee que implementa o método getPaymentAmount
// da interface Payable.

public class SalariedEmployee extends Funcionario {

    private double weeklySalary;

    // construtor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }

        this.weeklySalary = weeklySalary;
    }

    // configura o salário
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }

        this.weeklySalary = weeklySalary;
    }

    // retorna o salário
    public double getWeeklySalary() {
        return weeklySalary;
    }

    // calcula vencimentos; implementa o método Payable da interface ÿ
    // que era abstrata na superclasse Employee ÿ
    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    // retorna a representação String do objeto SalariedEmployee
    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }
}
