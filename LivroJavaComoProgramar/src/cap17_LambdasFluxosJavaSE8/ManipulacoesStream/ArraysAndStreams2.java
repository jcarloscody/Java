/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap17_LambdasFluxosJavaSE8.ManipulacoesStream;

// Demonstrando lambdas e fluxos com um array de Strings.
import java.util.Arrays;
import java.util.Comparator;

import java.util.stream.Collectors;

 public class ArraysAndStreams2 {

    public static void main(String[] args) {
        String[] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        // exibe strings originais
        System.out.printf("Original strings: %s%n", Arrays.asList(strings));

        // strings em maiúsculas
        System.out.printf("strings in uppercase: %s%n",
                Arrays.stream(strings)
                        .map(String::toUpperCase)  //String::toUpperCase é conhecido como referência de método e é uma notação  abreviada para uma expressão lambda.   (String s) -> {return s.toUpperCase();}      s -> s.toUpperCase()
                        .collect(Collectors.toList()));

        // strings menores que “n” (sem distinção maiúsc/minúsc) em ordem crescente
        System.out.printf("strings greater than m sorted ascending: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("n") < 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .collect(Collectors.toList()));

        // strings menores que “n” (com distinção maiúsc/minúsc) em ordem decrescente
        System.out.printf("strings greater than m sorted descending: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("n") < 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList()));
    }
} // fim da classe ArraysAndStreams2

/*Lambda Descrição
String::toUpperCase     Referência de método para um método de instância de uma classe. Cria uma lambda de um 
parâmetro que chama o método de instância sobre o argumento da lambda e retorna o resultado 
do método. Usada na Figura 17.7.
System.out::println     Referência de método para um método de instância que deve ser chamado em um objeto 
específico. Cria uma lambda de um parâmetro que chama o método de instância sobre o objeto 
especificado — passando o argumento da lambda para o método de instância — e retorna o 
resultado do método. Usada na Figura 17.10.
Math::sqrt              Referência de método para um método static de uma classe. Cria uma lambda de um parâmetro 
em que o argumento da lambda é passado para o método static especificado e a lambda retorna 
o resultado do método.
TreeMap::new            Referência de construtor. Cria uma lambda que chama o construtor sem argumentos da classe 
especificada para criar e inicializar um novo objeto dessa classe. Usada na Figura 17.17*/