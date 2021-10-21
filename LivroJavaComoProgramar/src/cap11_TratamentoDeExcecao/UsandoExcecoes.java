package cap11_TratamentoDeExcecao;

// Figura 11.5: UsingExceptions.java
// mecanismo de tratamento de exceção try...catch...finally

/**
 * O finally será executado se uma exceção for ou não lançada no bloco try
 * correspondente. O bloco finally também será executado se um bloco try for
 * fechado usando uma instrução return, break ou continue ou simplesmente quando
 * alcança a chave de fechamento direita. O caso em que o bloco finally não
 * executará é se o aplicativo sair precocemente do bloco try chamando o método
 * System.exit. Esse método, que demonstraremos no Capítulo 15, termina
 * imediatamente um aplicativo. Se uma exceção que ocorre em um bloco try não
 * puder ser capturada por rotinas de tratamento catch desse bloco try, o
 * programa pula o restante do bloco try e o controle prossegue para o bloco
 * finally. Então, o programa passa a exceção para o próximo bloco try externo —
 * normalmente no método chamador — onde um bloco catch associado pode
 * capturá-lo. Esse processo pode ocorrer pelos muitos níveis de blocos try.
 * Além disso, a exceção talvez não seja capturada (como discutido na Seção
 * 11.3). Se um bloco catch lançar uma exceção, o bloco finally ainda executará.
 * Então, a exceção é passada para o próximo bloco try externo — novamente, em
 * geral no método chamador.
 */

public class UsandoExcecoes {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception exception) // exceção lançada por throwException
        {
            System.out.println();
            System.err.println("Exception handled in main RELANÇAMENTO");
        }
        System.out.println();
        System.out.println();
        doesNotThrowException();
    }

    // demonstra try...catch...finally
    public static void throwException() throws Exception {
        try {// lança uma exceção e imediatamente a captura
            System.out.println("Metodo throwException");
            throw new Exception(); // gera a exceção
            /**
             * . A instrução na linha 26 é conhecida como uma instrução throw — ela é
             * executada para indicar uma exceção que ocorreu. Até agora, você só capturou
             * exceções lançadas por métodos chamados. Você mesmo pode lançar exceções
             * usando a instrução throw. Assim como com as exceções lançadas pelos métodos
             * da Java API, isso indica para os aplicativos clientes que ocorreu um erro.
             * Uma instrução throw especifica um objeto a ser lançado. O operando de um
             * throw pode ser de qualquer classe derivada da classe Throwable
             */
        } catch (Exception exception) {// captura exceção lançada em try
            System.err.println("Exceção tratada no método throwException");
            throw exception; // lança novamente para processamento adicional
            /**
             * relança a exceção. As exceções são relançadas quando um bloco catch, ao
             * receber uma exceção, decide que não pode processar essa exceção ou que só
             * pode processá-la parcialmente. Relançar uma exceção adia o tratamento de
             * exceção (ou talvez uma parte dele) para outro bloco catch associado com uma
             * instrução try externa. Uma exceção é relançada utilizando-se a palavra-chave
             * throw, seguida por uma referência ao objeto de exceção que acabou de ser
             * capturado. Exceções não podem ser relançadas de um bloco finally, uma vez que
             * o parâmetro de exceção (uma variável local) do bloco catch não existe mais.
             * Quando ocorre um relançamento, o próximo bloco try circundante detecta a
             * exceção relançada e os blocos catch desse bloco try tentam tratá-la
             */

            // o código aqui não seria alcançado; poderia causar erros de compilação
        } finally { // executa independentemente do que ocorre em try...catch
            System.err.println("Finally executed in throwException");
            /**
             * às vezes referido como a cláusula finally, é opcional. Se estiver presente,
             * ele é colocado depois do último bloco catch. Se não houver blocos catch, o
             * bloco finally, se presente, segue imediatamente o bloco try.
             */
        }
        // o código aqui não seria alcançado; poderia causar erros de compilação
    }

    // demonstra finally quando nenhuma exceção ocorrer
    public static void doesNotThrowException() {
        try { // bloco try não lança uma exceção
            System.out.println("Method doesNotThrowException");
        } catch (Exception exception) {// não executa
            System.err.println(exception);
            /**
             * System.out e System.err são fluxos — sequências de bytes. Enquanto System.out
             * (conhecido como fluxo de saída padrão) exibe a saída de um programa,
             * System.err (conhecido como fluxo de erro padrão) exibe os erros de um
             * programa. A saída desses fluxos pode ser redirecionada (isto é, enviada para
             * algum outro lugar diferente do prompt de comando, como um arquivo). Utilizar
             * dois fluxos diferentes permite separar facilmente mensagens de erro de outra
             * saída. Por exemplo, a saída de dados de System.err poderia ser enviada para
             * um arquivo de log, enquanto a saída de dados de System.out pode ser exibida
             * na tela. Para simplificar, este capítulo não redirecionará a saída de
             * System.err, mas exibirá essas mensagens no prompt de comando.
             */
        } finally {// executa independentemente do que ocorre em try...catch
            System.err.println("Finally executed in doesNotThrowException");
        }

        System.out.println();
        System.out.println();
        System.out.println("FIM!");
    }
}
