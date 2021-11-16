// A classe BasePlusCommissionEmployee é herdada de CommissionEmployee  e acessa os dados private da superclasse via métodos public herdados.
package cap9_heranca.FolhaDePagamentoBoasPraticas;

public class BasePlusCommissionEmployee extends ComissionEmployee {

    private double baseSalary; // salário-base por semana

    // construtor de seis argumentos
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        // se baseSalary é inválido, lança uma exceção
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    // configura o salário-base
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // retorna o salário-base
    public double getBaseSalary() {
        return baseSalary;
    }

    // O método earnings sobrescreve o método earnings da classe CommissionEmployee
    @Override
    public double earnings() {
        // não permitido: commissionRate e grossSales privado em superclasseÿ
        return baseSalary + super.earnings();
    }

    // retorna a representação de String de BasePlusCommissionEmployee
    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
    }
} // fim da classe BasePlusCommissionEmployee
