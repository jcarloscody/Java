package s20_ProgramacaoFuncionalEExpressoesLambda.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CriandoStream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7); // criando uma lista com os elemetnos ja inseridos
        Stream<Integer> st1 = list.stream();// criando uma stream de int a partir da lista

        System.out.println(Arrays.toString(st1.toArray()));// imprimindo a stream com o toArray. com ele iremos
                                                           // converter a stream para vetor, depois string

        st1 = list.stream().map(x -> x * 2);// aplicando uma funcao em cada elemento
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob"); // stream de string
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);// (primeiro elemento da stream, funcao de geração dos
                                                            // proximos elementos) é infinita
        System.out.println(Arrays.toString(st3.limit(10).toArray()));// mostra os primeiros 10 elementos

        // sequencia de fribonnaci -> é uma sequencia que começa com 0, depois 1 e a
        // sucessividade é a soma dos dois anteriores - 0,1,1,2,3,5,8,13,21...
        Stream<Long> st4 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
        // o primeiro elemento é um array. para cada p gera um array que pega o indece 1
        // do anterior depois soma os dois anteriores
        // com o map: para cada par do elemento 0, pega o elemento do indice 0
        System.out.println(Arrays.toString(st4.limit(10).toArray()));

    }
}
