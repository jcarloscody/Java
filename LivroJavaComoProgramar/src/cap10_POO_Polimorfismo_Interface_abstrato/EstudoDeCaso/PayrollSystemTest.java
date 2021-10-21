// Figura 10.9: PayrollSystemTest.java
// Programa de teste da hierarquia Employee.

package cap10_POO_Polimorfismo_Interface_abstrato.EstudoDeCaso;

public class PayrollSystemTest {
    public static void main(String[] args) {
        String g;
        // cria objetos de subclasse
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee empregadoHorista = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis",
                "444-44-4444", 5000, .04, 300);

        System.out.println("Employees processed individually:");
        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", empregadoHorista, "earned", empregadoHorista.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned",
                basePlusCommissionEmployee.earnings());

        // cria um array Employee de quatro elementos
        Employee[] employees = new Employee[4];

        // inicializa o array com Employees
        employees[0] = salariedEmployee;
        employees[1] = empregadoHorista;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        // processa genericamente cada elemento no employees
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); // invoca toString

            // determina se elemento é um BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                // o operador instanceof para determinar se um tipo particular do objeto
                // Employee é BasePlusCommissionEmployee.

                // downcast da referência de Employee para
                // referência a BasePlusCommissionEmployee
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                // objetos de subclasse podem ser tratados como objetos de sua superclasse
                /**
                 * Mas, como a subclasse pode ter membros adicionais somente da subclasse,
                 * atribuir uma referência de superclasse a uma variável de subclasse não é
                 * permitido sem uma coerção explícita — essa atribuição deixaria os membros da
                 * subclasse indefinidos para o objeto da superclasse.
                 * 
                 * 
                 * 1. Atribuir uma referência de superclasse a uma variável de superclasse é
                 * simples e direto. 2. Atribuir uma referência de subclasse a uma variável de
                 * subclasse é simples e direto. 3. Atribuir uma referência de subclasse a uma
                 * variável de superclasse é seguro, porque o objeto de subclasse é um objeto de
                 * sua superclasse. A variável da superclasse, porém, pode ser utilizada para
                 * referenciar apenas membros da superclasse. Se esse código referencia membros
                 * somente da subclasse por meio da variável de superclasse, o compilador
                 * informa erros.
                 */

                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                employee.getFirstName();
                employee.getBaseSalary();
                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());

            } // fim do if

            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        } // for final

        // obtém o nome do tipo de cada objeto no array employeesÿ
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
            /**
             * Cada objeto conhece sua própria classe e pode acessar essas informações por
             * meio do método getClass, que todas as classes herdam da classe Object. O
             * método getClass retorna um objeto do tipo Class (do pacote java.lang), que
             * contém as informações sobre o tipo do objeto, incluindo seu nome de classe.
             * 
             * . O resultado da chamada getClass é usado para invocar getName a fim de obter
             * o nome de classe do objeto.
             */
        }
    } // fim de main
}
