package s20_ProgramacaoFuncionalEExpressoesLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PiperLine {
    public static void main(String[] aStrings) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);// o map é uma operacao intermediaria

        System.out.println(Arrays.toString(st1.toArray()));// o toArray é uma operacao terminal

        int sum = list.stream().reduce(0, (x, y) -> x + y);
        // a operacao reduce vai pegar o elemento inicial, elemento neutro, e depois uma
        // funcao que recebe
        // dois argumentos e gera um resultado. se fosse o produto o elemento neutro
        // seria 1
        // o reduce tbm é operacao terminal
        System.out.println("Sum = " + sum);

        // gera uma stream com um filtro que gera elementos pares e depois uma stream
        // que multiplica cada por 10 e depois gera uma lista
        List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
        System.out.println(Arrays.toString(newList.toArray()));
    }
}
