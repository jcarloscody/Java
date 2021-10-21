package cap11_TratamentoDeExcecao;

// Figura 11.2: DivideByZeroNoExceptionHandling.java
// Divisão de inteiro sem tratamento de exceção.

/* veremos que as exceções são lançadas (isto é, a exceção ocorre) quando um método detecta um problema e é
incapaz de tratá-lo.*/

import java.util.Scanner;

public class DividePorZeroSemTratamentoDeExcecao {
    // demonstra o lançamento de uma exceção quando ocorre uma divisão por zero
    public static int quotient(int numerator, int denominator) {
        return numerator / denominator; // possível divisão por zeroÿ
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Please enter an integer denominator: ");
        int denominator = scanner.nextInt();

        int result = quotient(numerator, denominator);
        System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
    }
}

/**
 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
 * DivideByZeroNoExceptionHandling.quotient(
 * DivideByZeroNoExceptionHandling.java:10) at
 * DivideByZeroNoExceptionHandling.main(
 * DivideByZeroNoExceptionHandling.java:22)
 */

/**
 * . Se 0.0 for dividido por 0.0, o resultado é NaN (não um número), que também
 * é representado no Java como um valor de ponto flutuante (mas é exibido como
 * NaN).
 */
/**
 * Se você precisa comparar um valor de ponto flutuante com NaN, use o método
 * isNaN de classe Float (para obter valores Float) ou a classe Double (para
 * obter valores Double). As classes Float e Double estão no pacote java.lang.
 */

/**
 * Exception in thread "main" java.util.InputMismatchException at
 * java.util.Scanner.throwFor(Unknown Source) at java.util.Scanner.next(Unknown
 * Source) at java.util.Scanner.nextInt(Unknown Source) at
 * java.util.Scanner.nextInt(Unknown Source) at
 * DivideByZeroNoExceptionHandling.main(
 * DivideByZeroNoExceptionHandling.java:20)
 */

/**
 * Uma InputMismatchException ocorre quando o método Scanner nextInt recebe uma
 * string que não representa um inteiro válido. Iniciando do fim do rastreamento
 * de pilha, vemos que a exceção foi detectada na linha 20 do método main.
 */