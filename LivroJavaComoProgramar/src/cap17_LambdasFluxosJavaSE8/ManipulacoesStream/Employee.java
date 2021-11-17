/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap17_LambdasFluxosJavaSE8.ManipulacoesStream;

// Classe Employee.
public class Employee {

    private String firstName;
    private String lastName;
    private double salary;
    private String department;
// construtor 

    public Employee(String firstName, String lastName,
            double salary, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    // configura firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // obtém firstName
    public String getFirstName() {
        return firstName;
    }

    // configura lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // obtém lastName
    public String getLastName() {
        return lastName;
    }

    // configura o salário
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // obtém salário
    public double getSalary() {
        return salary;
    }

    // configura departamento
    public void setDepartment(String department) {
        this.department = department;
    }

    // obtém departamento
    public String getDepartment() {
        return department;
    }

    // retorna o nome e o sobrenome do empregado combinados
    public String getName() {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    // retorna uma String contendo informações do Employee
    @Override
    public String toString() {
        return String.format("%-8s %-8s %8.2f %s",
                getFirstName(), getLastName(), getSalary(), getDepartment());
    } // fim do método toString
} // fim da classe Employee
