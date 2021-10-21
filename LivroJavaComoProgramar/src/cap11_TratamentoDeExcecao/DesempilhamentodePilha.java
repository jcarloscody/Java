package cap11_TratamentoDeExcecao;

// Figura 11.6: UsingExceptions.java
// Desempilhando e obtendo dados a partir de um objeto de exceção.

public class DesempilhamentodePilha {
    public static void main(String[] args) {
        try {
            method1();
            /**
             * Quando uma exceção é lançada mas não capturada em um escopo em particular, a
             * pilha de chamada de método é “desempilhada” e é feita uma tentativa de
             * capturar (catch) a exceção no próximo bloco try externo. Esse processo é
             * chamado desempilhamento de pilha. Desempilhar a pilha de chamada de método
             * significa que o método em que a exceção não foi capturada é encerrado, todas
             * as variáveis locais nesse método saem de escopo e o controle retorna à
             * instrução que originalmente invocou esse método. Se um bloco try incluir essa
             * instrução, uma tentativa de capturar a exceção com catch é feita. Se um bloco
             * try não encerrar essa instrução ou se a exceção não for capturada, mais uma
             * vez ocorre desempilhamento de pilha. A Figura 11.6 demonstra o
             * desempilhamento de pilha, e a rotina de tratamento de exceção em main mostra
             * como acessar os dados em um objeto de exceção.
             */
        } catch (Exception exception) // captura a exceção lançada em method1
        {
            System.err.printf("%s%n%n", exception.getMessage());
            /**
             * . O método getMessage da classe Throwable retorna a string descritiva
             * armazenada em uma exceção.
             */
            exception.printStackTrace();
            /**
             * Todas as exceções derivam da classe Throwable, que tem um método
             * printStackTrace que envia para o fluxo de erros padrão o rastreamento de
             * pilha
             */

            // obtém informações de rastreamento de pilha
            StackTraceElement[] traceElements = exception.getStackTrace();
            /**
             * 8 invoca o método getStackTrace da exceção para obter as informações de
             * rastreamento de pilha como um array de objetos StackTraceElement.
             */
            /**
             * A classe Throwable também fornece um método getStackTrace que recupera as
             * informações sobre o rastreamento de pilha que podem ser impressas por
             * printStackTrace
             */

            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");

            // faz um loop por traceElements para obter a descrição da exceção
            for (StackTraceElement element : traceElements) {
                /**
                 * obtêm cada StackTraceElement no array e invocam seus métodos getClassName,
                 * getFileName, getLineNumber e getMethodName para obter o nome da classe, o
                 * nome do arquivo, o número da linha e o nome de método, respectivamente, para
                 * esse StackTraceElement. Todo StackTraceElement representa uma chamada de
                 * método na pilha de chamadas de método.
                 * 
                 * e StackTraceElement. Todo StackTraceElement representa uma chamada de método
                 * na pilha de chamadas de método. A saída do programa mostra que a saída de
                 * printStackTrace segue o padrão: nomeDaClasse.nomeDoMétodo
                 * (nomeDoArquivo:númeroDaLinha), em que nomeDaClasse, nomeDoMétodo e
                 * nomeDoArquivo indicam o nome da classe, do método e do arquivo em que a
                 * exceção ocorreu, respectivamente, e númeroDaLinha indica onde no arquivo
                 * ocorreu a exceção.
                 */
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            }
        }
    } // fim de main

    // chama method2; lança exceções de volta para main
    public static void method1() throws Exception {
        method2();
    }

    // chama method3; lança exceções de volta para method1
    public static void method2() throws Exception {
        method3();
    }

    // lança Exception de volta para method2
    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
}
