package cap10_POO_Polimorfismo_Interface_abstrato.Caso_Interface;

// Figura 10.15: PayableInterfaceTest.java
// Programa de teste da interface Payable que processa Invoices e
// Employees polimorficamente.

public class PayableInterfaceTest {
    public static void main(String[] args) {
        // cria array Payable de quatro elementos
        Pagamento[] payableObjects = new Pagamento[4];

        // preenche o array com objetos que implementam Payable
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);

        System.out.println("Invoices and Employees processed polymorphically:");

        // processa genericamente cada elemento no array payableObjects
        for (Pagamento currentPayable : payableObjects) {
            // gera saída de currentPayable e sua quantia de pagamento apropriado
            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), // poderia invocar implicitamente
                    "payment due", currentPayable.getPaymentAmount());
        }
    } // fim de main
}
