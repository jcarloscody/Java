/*
Ao ler uma frase, sua mente divide-a em tokens — palavras e sinais de pontuação individuais que transmitem o significado
para você. Os compiladores também realizam tokenização. Eles dividem instruções em pedaços individuais, como palavras-chave,
identificadores, operadores e outros elementos de linguagem de programação. Agora estudaremos o método split da classe String,
que divide uma String em seus tokens componentes. Os tokens são separados entre si por delimitadores, em geral caracteres de
espaçamento como espaço, tabulação, nova linha e retorno de carro. Outros caracteres também podem ser utilizados como delimitadores para separar tokens
 */
package cap14_stringCaracteresExpressoesregulares;

import java.util.Scanner;

/**
 *
 * @author developer
 */
public class TokenizacaoString {

    public static void main(String[] args) {
// obtém a frase
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press Enter");
        String sentence = scanner.nextLine();

// processa a frase do usuário
        String[] tokens = sentence.split(" ");
        System.out.printf("Number of elements: %d%nThe tokens are:%n", tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
