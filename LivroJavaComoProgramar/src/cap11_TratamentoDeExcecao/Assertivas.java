package cap11_TratamentoDeExcecao;

import java.util.Scanner;
/**
 * Ao implementar e depurar uma classe, às vezes é útil declarar as condições
 * que devem ser verdadeiras em um ponto particular de um método. Essas
 * condições, chamadas de assertivas, ajudam a assegurar a validade de um
 * programa capturando bugs potenciais e identificando possíveis erros de lógica
 * durante o desenvolvimento. As pré-condições e as pós-condições são dois tipos
 * de assertivas. As pré-condições são assertivas sobre o estado de um programa
 * quando um método é invocado, e as pós-condições são assertivas sobre o estado
 * depois do encerramento de um método. Embora as assertivas possam ser
 * declaradas como comentários para orientar durante o desenvolvimento, o Java
 * inclui duas versões da instrução assert para validar as assertivas
 * programaticamente. A instrução assert avalia uma expressão boolean e, se
 * false, lança um AssertionError (uma subclasse de Error).
 */



public class Assertivas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 10: ");
        int number = input.nextInt();

        // afirma que o valor é >= 0 e <= 10
        assert (number >= 0 && number <= 10) : "bad number: " + number;

        System.out.printf("You entered %d%n", number);
    }
}
