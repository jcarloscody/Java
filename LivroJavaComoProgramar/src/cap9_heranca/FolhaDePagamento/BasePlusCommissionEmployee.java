package cap9_heranca.FolhaDePagamento;

public class BasePlusCommissionEmployee extends ComissionEmployee {

    private double baseSalary; // salário-base por semana

    // construtor de seis argumentos
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary) {
        /*
         * chamada explícita para o construtor CommissionEmployee da superclasse A
         * classe BasePlusCommissionEmployee não herda o construtor de cinco argumentos
         * de CommissionEmployee, mas o invoca explicitamente Para inicializar as
         * variáveis de instância que ela herdou da segunda
         * 
         * . O construtor BasePlusCommissionEmployee deve chamar explicitamente o
         * construtor de CommissionEmployee, porque esta não tem um construtor sem
         * argumentos que possa ser chamado implicitamente.
         */
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

    // calcula os lucros
    @Override
    public double earnings() {
        // não permitido: commissionRate e grossSales privado em superclasseÿ
        return baseSalary + (commissionRate * grossSales);
    }

    // retorna a representação de String de BasePlusCommissionEmployee
    @Override
    public String toString() {
        // não permitido: tenta acessar membros private da superclasse ÿ
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "base-salaried commission employee",
                firstName, lastName, "social security number", socialSecurityNumber, "gross sales", grossSales,
                "commission rate", commissionRate, "base salary", baseSalary);
    }
} // fim da classe BasePlusCommissionEmployee
