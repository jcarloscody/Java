package s19_GenericsSetMap.TipoCoringa.CoringaDelimitado.OtherExemplo;

import java.util.ArrayList;
import java.util.List;

public class OtherExemple {
    public static void main(String[] args) {
        /**
         * https://stackoverflow.com/questions/1368166/what-is-a-difference-between-super-e-and-extends-e
         */

        /**
         * JAVA WRAPPER TYPES
         * 
         * Object (super) -> Number(super), Boolean(super), Character(super)
         * 
         * Number -> Interger | Byte | Long | Short | Float | Double
         * 
         * Boolean
         * 
         * Character
         */

        // Princípio get/put - COVARIÂNCIA ------------ get ok | set erro

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);
        List<? extends Number> list = intList;
        Number x = list.get(0);
        list.add(20); // erro de compilacao
        /**
         * não pode adicionar pq o compilador nao sabe se o argumento é compativel com
         * algum outro possível tipo number que possa ser a minha list
         */

        /**
         * Princípio get/put - CONTRAVARIÂNCIA --------- get erro | set ok
         */

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");
        List<? super Number> myNums = myObjs;
        // ele vai pegar o tipo number ou um super tipo de number qual seja um object
        myNums.add(10);
        myNums.add(3.14);
        Number x = myNums.get(0); // erro de compilacao
        // nao pode atribuir pq vai que seja de algum tipo super de number

    }
}
