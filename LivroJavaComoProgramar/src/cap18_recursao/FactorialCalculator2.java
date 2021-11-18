/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap18_recursao;

// Método fatorial recursivo.
import java.math.BigInteger;

public class FactorialCalculator2 {
    // método fatorial recursivo (supõe que o parâmetro é >= 0) ÿ

    public static BigInteger factorial(BigInteger number) {
        /*Como BigInteger não é um tipo primitivo, não podemos usar os operadores aritméticos, relacionais e de igualdade com 
BigIntegers; em vez disso, devemos utilizar os métodos BigInteger para realizar essas tarefas.*/
        if (number.compareTo(BigInteger.ONE) <= 0) // caso básico de teste
            /* o método BigInteger compareTo. Esse método compara o BigInteger number que chama o método para o argumento BigInteger do método. 
             O método retorna -1 se o BigInteger que chama o método for menor que o argumento, 0 se eles forem se o BigInteger que chama o método for maior que o argumento.
            A linha 10 compara o BigInteger number com a constante bigInteger ONE, que representa o valor inteiro 1. Se compareTo retornar -1 ou 0, então number é menor ou igual a 1 (o caso básico), e o método retorna a constante BigInteger.ONE.*/
        {
            return BigInteger.ONE; // casos básicos: 0! = 1 e 1! = 1 ÿ
        } else // passo de recursão ÿ
        {
            return number.multiply(factorial(number.subtract(BigInteger.ONE)));//realizam a etapa de recursão com os  métodos BigInteger multiply e subtract para implementar os cálculos necessários a fim de multiplicar number pelo fatorial de number - 1
        }
    }

    // gera saída de fatoriais para valores 0 a 50
    public static void main(String[] args) {
        // calcula o fatorial de 0 a 50
        for (int counter = 0; counter <= 50; counter++) {
            System.out.printf("%d! = %d%n", counter, factorial(BigInteger.valueOf(counter)));
        }
    }
} // fim da classe FactorialCalculator
