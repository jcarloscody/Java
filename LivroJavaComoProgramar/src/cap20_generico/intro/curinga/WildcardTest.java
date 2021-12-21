
package cap20_generico.intro.curinga;

import java.util.ArrayList;

public class WildcardTest {
    public static void main(String[] args) {
        // cria, inicializa e gera saída de ArrayList de Integers, então
        // exibe o total dos elementos
        Integer[] integers = {1, 2, 3, 4, 5};
        ArrayList<Integer> integerList = new ArrayList<>();

        // insere elementos na integerList
        for (Integer element : integers){
            integerList.add(element);
        }

        System.out.printf("integerList contains: %s%n", integerList);
        System.out.printf("Total of the elements in integerList: %.0f%n%n",
        sum(integerList));

        // cria, inicializa e gera saída do ArrayList de Doubles, então
        // exibe o total dos elementos
        Double[] doubles = {1.1, 3.3, 5.5};
        ArrayList<Double> doubleList = new ArrayList<>();

        // insere elementos na doubleList
        for (Double element : doubles){
            doubleList.add(element);
        }
        
        System.out.printf("doubleList contains: %s%n", doubleList);
        System.out.printf("Total of the elements in doubleList: %.1f%n%n",
        sum(doubleList));

        // cria, inicializa e gera saída de ArrayList de números contendo
        // Integers e Doubles, e então exibe o total dos elementos
        Number[] numbers = {1, 2.4, 3, 4.1}; // Integers e Doubles
        ArrayList<Number> numberList = new ArrayList<>();

        // insere elementos na numberList
        for (Number element : numbers){
            numberList.add(element);
        }

        System.out.printf("numberList contains: %s%n", numberList);
        System.out.printf("Total of the elements in numberList: %.1f%n",
        sum(numberList));
    } // fim de main

    // totaliza os elementos; usando um curinga no parâmetro ArrayList
    public static double sum(ArrayList<? extends Number> list) { //Um argumento do tipo curinga é denotado pelo ponto de interrogação (?), que representa por si mesmo um “tipo desconhecido”
       /*. Os curingas
permitem especificar parâmetros de método, valores de retorno, variáveis ou campos e assim por diante, que atuam como supertipos
ou subtipos de tipos parametrizados*/
        double total = 0; // inicializa o total

       // calcula a soma
       for (Number element : list){
        total += element.doubleValue();
       }

       return total;
   }
    
    /* Como o curinga (?) no cabeçalho do método anterior não especifica um nome de parâmetro de tipo, você não pode utilizá-lo
como um nome de tipo por todo o corpo do método (isto é, não pode substituir Number por ? ). Você pode, porém, declarar
o método sum da seguinte forma:*/
    public static <T extends Number> double sum2(ArrayList<T> list) { 
        double total = 0.0;// inicializa o total

       // calcula a soma
       for (T element : list){
        total += element.doubleValue();
       }

       return total;
   }
}
