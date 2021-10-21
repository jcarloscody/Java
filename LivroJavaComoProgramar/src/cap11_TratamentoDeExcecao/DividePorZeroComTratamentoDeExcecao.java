package cap11_TratamentoDeExcecao;

// Figura 11.3: DivideByZeroWithExceptionHandling.java
// Tratando ArithmeticExceptions e InputMismatchExceptions.

import java.util.InputMismatchException;
/**A classe InputMismatchException é importada na linha 6. A classe ArithmeticException não precisa ser importada porque
está no pacote java.lang */
import java.util.Scanner;

public class DividePorZeroComTratamentoDeExcecao {

    // demonstra o lançamento de uma exceção quando ocorre uma divisão por zero
    public static int quociente(int numerator, int denominator) throws ArithmeticException {
        /**
         * o. Não é necessário que as exceções não verificadas sejam listadas na
         * cláusula throws de um método — mesmo se forem, essas exceções não precisam
         * ser capturadas por um aplicativo.
         */
        /**
         * 0 throws --->>>> é conhecida como cláusula throws. Ela especifica as exceções
         * que o método pode lançar se ocorrerem problemas. Essa cláusula, que deve
         * aparecer após a lista de parâmetros e antes do corpo do método, contém uma
         * lista separada por vírgulas dos tipos de exceção. Essas exceções podem ser
         * lançadas por instruções no corpo do método ou por métodos chamados a partir
         * daí. Adicionamos a cláusula throws a esse aplicativo para indicar que o
         * método pode lançar uma ArithmeticException.
         */
        return numerator / denominator; // possível divisão por zero
        /**
         * O tratamento de exceção é projetado para processar erros síncronos, que
         * ocorrem quando uma instrução executa. Os exemplos mais comuns que veremos ao
         * longo do livro são índices de array fora dos limites, estouro aritmético
         * (isto é, um valor fora do intervalo representável dos valores), divisão por
         * zero, parâmetros de método inválidos e interrupção de thread (como veremos no
         * Capítulo 23). O tratamento de exceção não é projetado para processar
         * problemas associados com os eventos assíncronos (por exemplo, conclusões de
         * E/S de disco, chegadas de mensagem de rede, cliques de mouse e
         * pressionamentos de tecla), que ocorrem paralelamente com fluxo de controle do
         * programa e independentemente dele.
         */

        /**
         * a classe Throwable (uma subclasse de Object), que é a superclasse da classe
         * Exception. Somente objetos Throwable podem ser utilizados com o mecanismo de
         * tratamento de exceção. A classe Throwable tem duas subclasses diretas:
         * Exception e Error. A classe Exception e suas subclasses — por exemplo,
         * RuntimeException (pacote java.lang) e IOException (pacote java.io) —
         * representam situações excepcionais que podem ocorrer em um programa Java e
         * que podem ser capturadas pelo aplicativo. A classe Error e suas subclasses
         * representam situações anormais que acontecem na JVM. A maioria dos Errors
         * acontece com pouca frequência e não deve ser capturada pelos aplicativos —
         * geralmente os aplicativos não podem se recuperar de Errors.
         */
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true; // determina se mais entradas são necessárias
        /**
         * cria a variável boolean continueLoop, que é true se o usuário ainda não
         * inseriu uma entrada válida
         */

        do {
            // lê dois números e calcula o quociente
            try {
                /**
                 * Pelo menos um bloco catch ou um bloco finally (discutidos na Seção 11.6) deve
                 * se seguir imediatamente ao bloco try. Cada bloco catch especifica entre
                 * parênteses um parâmetro de exceção que identifica o tipo de exceção que a
                 * rotina de tratamento pode processar.
                 */
                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();

                int result = quociente(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
                continueLoop = false; // entrada bem-sucedida; fim do loop
            } catch (InputMismatchException inputMismatchException) {
                /**
                 * Um bloco catch (também chamado de cláusula catch ou rotina de tratamento de
                 * exceção) captura (isto é, recebe) e trata uma exceção. Um bloco catch inicia
                 * com a palavra-chave catch seguido por um parâmetro entre parênteses (chamado
                 * parâmetro de exceção, discutido em breve) e um bloco de código entre chaves.
                 * [Observação: o termo “cláusula catch” é às vezes utilizado para referir-se à
                 * palavra-chave catch seguida por um bloco de código, em que o termo “bloco
                 * catch” refere-se apenas ao bloco de código que se segue à palavra-chave
                 * catch, mas que não a inclui. Para simplificar, utilizamos o termo “bloco
                 * catch” para nos referirmos ao bloco de código que se segue à palavra-chave
                 * catch, bem como à própria palavra-chave.]
                 */
                System.err.printf("%nException: %s%n", inputMismatchException);
                scanner.nextLine(); // descarta entrada para o usuário tentar de novo
                /**
                 * A linha 38 do primeiro bloco catch chama o método Scanner nextLine. Como
                 * ocorreu uma InputMismatchException, a chamada ao método nextInt nunca é lida
                 * com sucesso nos dados do usuário — então lemos essa entrada com uma chamada
                 * ao método nextLine. Nesse ponto, não fazemos nada com a entrada, porque
                 * sabemos que ela é inválida.
                 */
                System.out.printf("You must enter integers. Please try again.%n%n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
                /**
                 * Se ocorrer uma exceção em um bloco try (como uma InputMismatchException sendo
                 * lançada como resultado do código na linha 25 da Figura 11.3), o bloco try
                 * termina imediatamente e o controle do programa é transferido para o primeiro
                 * dos blocos catch seguintes em que o tipo do parâmetro de exceção corresponde
                 * ao tipo da exceção lançada. Na Figura 11.3, o primeiro bloco catch captura
                 * InputMismatchExceptions (que ocorrem se uma entrada inválida for fornecida),
                 * e o segundo bloco catch captura ArithmeticExceptions (que ocorrem se houver
                 * uma tentativa de dividir por zero). Depois que a exceção é tratada, o
                 * controle do programa não retorna ao ponto de lançamento, porque o bloco try
                 * expirou (e suas variáveis locais foram perdidas). Em vez disso, o controle
                 * retoma depois do último bloco catch. Isso é conhecido como o modelo de
                 * terminação do tratamento de exceção. Algumas linguagens utilizam o modelo de
                 * retomada do tratamento de exceção, em que, após uma exceção ser tratada, o
                 * controle é retomado logo depois do ponto de lançamento.
                 */
            }
        } while (continueLoop);
    }
}
