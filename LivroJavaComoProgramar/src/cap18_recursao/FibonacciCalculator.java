/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap18_recursao;

// Método recursivo de Fibonacci.
import java.math.BigInteger;

public class FibonacciCalculator {

    private static BigInteger TWO = BigInteger.valueOf(2);

    // declaração recursiva do método fibonacci ÿ
    public static BigInteger fibonacci(BigInteger number) {
        if (number.equals(BigInteger.ZERO)
                || number.equals(BigInteger.ONE)) // casos básicos ÿ
        {
            return number;
        } else // passo de recursão ÿ
        {
            return fibonacci(number.subtract(BigInteger.ONE)).add(
                    fibonacci(number.subtract(TWO)));
        }
    }

    // exibe os valores de Fibonacci de 0 a 40
    public static void main(String[] args) {
        for (int counter = 0; counter <= 40; counter++) {
            System.out.printf("Fibonacci of %d is: %d%n", counter, fibonacci(BigInteger.valueOf(counter)));
        }
    }
} // fim da classe FibonacciCalculator
