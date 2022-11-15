package s18_Interfaces.InterfaceComparable;

public class Employee implements Comparable<Employee> {
    // é necessario implementar a interface Comparable com ela mesma "Employee",
    // para podermos usar o metodo sort da class Collections
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        // esse metodo vai comparar um objeto com outro
        return -salary.compareTo(other.getSalary()); // ordem decrescente de sslario, querendo crescente tire o -

        /**
         * return do comparable (-) menor que (0) igual (+) maior que
         */
    }
}
