package s19_GenericsSetMap.TipoCoringa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coringa {
    public static void main(String[] args) {

        // List<Object> não é o supertipo de qualquer tipo de lista
        List<Object> myObjs2 = new ArrayList<>();
        List<Integer> myNumbers2 = new ArrayList<>();
        myObjs2 = myNumbers2; // erro de compilação. não é possivel fazer um
        // uppercastin

        /** É DIFERENTE DE... */
        Object obj;
        Integer integer = 10;
        obj = integer;

        Object obj2 = 10;
        Integer integer2;
        integer2 = (Integer) obj2; // é possível fazer casting

        // TIPO CORINGA
        // O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga
        List<?> myObjs = new ArrayList<>();
        List<Integer> myNumbers = new ArrayList<>();
        myObjs = myNumbers;

        /**
         * Interger é subtipo de Object
         * 
         * mas não posso atribuir uma lista Object para uma lista Interger pq a lista
         * Object não é um supertipo da lista Interger, não é possivel fazer um
         * uppercasting
         */

        /**
         * COM TIPOS CURINGA PODEMOS FAZER METODOS QUE RECEBEM UM GENERICO DE "QQ TIPO"
         */
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }

        /**
         * NÃO É POSSIVEL ADICIONAR POR MEIO DE CORINGA O compilador não sabe qual é o
         * tipo específico do qual a lista foi instanciada.
         */
        list.add(3);
    }
}
