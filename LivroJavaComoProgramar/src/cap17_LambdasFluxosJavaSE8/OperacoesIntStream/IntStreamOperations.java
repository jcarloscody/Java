package cap17_LambdasFluxosJavaSE8.OperacoesIntStream;

// Demonstrando operações IntStream.
import java.util.Arrays;
import java.util.stream.IntStream;


// Figura 17.5 demonstra as operações em um IntStream (pacote java.util.stream) — um fluxo especializado para manipular valores int. As técnicas mostradas nesse exemplo também se aplicam a LongStreams e DoubleStreams para valores long e 
public class IntStreamOperations {

    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
// exibe valores originais
        System.out.print("Original values: ");
        
        /*O método IntStream static of (linha 14) recebe um array int como um argumento e retorna um IntStream para processar 
os valores do array. Depois de criar um fluxo, você pode encadear múltiplas chamadas de método para criar um pipeline de fluxo.*/
        IntStream.of(values)
                .forEach(value -> System.out.printf("%d ", value));//Realiza o processamento em cada elemento em um fluxo (por exemplo, exibir cada elemento).
        System.out.println();

        // count, min, max, sum e average dos valores
        System.out.printf("%nCount: %d%n", IntStream.of(values).count());
        System.out.printf("Min: %d%n",
                IntStream.of(values).min().getAsInt());
        System.out.printf("Max: %d%n",
                IntStream.of(values).max().getAsInt());
        System.out.printf("Sum: %d%n", IntStream.of(values).sum());
        System.out.printf("Average: %.2f%n",
                IntStream.of(values).average().getAsDouble());

        // soma dos valores com o método reduce
        System.out.printf("%nSum via reduce method: %d%n",
                IntStream.of(values)
                        .reduce(0, (x, y) -> x + y));/*O primeiro argumento (0) é um valor que 
ajuda a começar a operação de redução, e o segundo, um objeto que implementa a interface funcional IntBinaryOperator (pacote 
java.util.function)*/

        // soma das raízes quadradas dos valores com o método reduce
        System.out.printf("Sum of squares via reduce method: %d%n",
                IntStream.of(values)
                        .reduce(0, (x, y) -> x + y * y));

        // produto dos valores com o método reduce
        System.out.printf("Product via reduce method: %d%n",
                IntStream.of(values)
                        .reduce(1, (x, y) -> x * y));

        // valores pares exibidos em ordem classificada
        System.out.printf("%nEven values displayed in sorted order: ");
        IntStream.of(values)
                .filter(value -> value % 2 == 0)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // valores ímpares multiplicados por 10 e exibidos em ordem classificada
        System.out.printf(
                "Odd values multiplied by 10 displayed in sorted order: ");
        IntStream.of(values)
                .filter(value -> value % 2 != 0)
                .map(value -> value * 10)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // soma o intervalo dos números inteiros de 1 a 10, exclusivo
        System.out.printf("%nSum of integers from 1 to 9: %d%n",
                IntStream.range(1, 10).sum());

        // soma o intervalo dos números inteiros de 1 a 10, inclusive
        System.out.printf("Sum of integers from 1 to 10: %d%n",
                IntStream.rangeClosed(1, 10).sum());
    }
} // fim da classe intStreamOperations


/*
Operações Stream intermediárias 

filter Resulta em um fluxo contendo apenas os elementos que atendem uma condição.

distinct Resulta em um fluxo que contém somente os elementos únicos.

limit Resulta em um fluxo com o número especificado de elementos a partir do início do fluxo original.

map Resulta em um fluxo em que cada elemento do fluxo original é mapeado para um novo valor (possivelmente de um tipo diferente) — por exemplo, mapear valores numéricos para as raízes quadradas dos valores numéricos. O novo fluxo tem o mesmo número de elementos que o fluxo original.

sorted Resulta em um fluxo em que os elementos estão em ordem classificada. O novo fluxo tem o mesmo número de elementos que o fluxo original.

forEach Realiza o processamento em cada elemento em um fluxo (por exemplo, exibir cada elemento).

* **
Operações de redução — recebem todos os valores no fluxo e retornam um único valor

average Calcula a média dos elementos em um fluxo numérico.

count Retorna o número de elementos no fluxo.

max Localiza o maior valor em um fluxo numérico.

min Localiza o menor valor em um fluxo numérico.

reduce Reduz os elementos de uma coleção a um único valor usando uma função de acumulação associativa (por exemplo, uma lambda que adiciona dois elementos). Operações de redução mutáveis — criam um contêiner (como uma coleção ou um StringBuilder)collect Cria uma nova coleção dos elementos contendo os resultados das operações anteriores do fluxo.

toArray Cria um array contendo os resultados das operações anteriores do fluxo.

***
Operações de pesquisa

findFirst Localiza o primeiro elemento no fluxo com base nas operações intermediárias anteriores; termina imediatamente o processamento do pipeline do fluxo depois que esse elemento é encontrado. 

findAny Localiza qualquer elemento no fluxo com base nas operações intermediárias anteriores; termina imediatamente o processamento do pipeline do fluxo depois que esse elemento é encontrado.

anyMatch Determina se quaisquer elementos no fluxo correspondem a uma condição especificada; termina imediatamente o processamento do pipeline do fluxo se um elemento corresponde.

allMatch Determina se todos os elementos no fluxo correspondem a uma condição especificada.
 */



/* count (linha 19) retorna o número de elementos no fluxo.
• min (linha 21) retorna o menor int no fluxo.
• max (linha 23) retorna o maior int no fluxo.
• sum (linha 24) retorna a soma de todos os ints no fluxo.
• average (linha 26) retorna um OptionalDouble (pacote java.util) contendo a média dos ints no fluxo como um valor 
do tipo double. Para qualquer fluxo, é possível que não existam elementos no fluxo. Retornar OptionalDouble permite que o 
método average retorne a média se o fluxo contiver pelo menos um elemento. Nesse exemplo, sabemos que o fluxo tem 10 elementos, então chamamos o método classe getAsDouble de OptionalDouble para obter a média. Se não houvesse elementos,
o OptionalDouble não conteria a média e getAsDouble lançaria uma NoSuchElementException. Para evitar essa exceção, 
você pode chamar em vez disso o método orElse, que retorna o valor do OptionalDouble se houver um ou, caso contrário, o 
valor que você passa para orElse.*/