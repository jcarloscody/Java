package s19_GenericsSetMap.GenericoDelimitado;

import java.util.List;

public class CalculationService {
    public static <T extends Comparable<T>> T max(List<T> list) {
        /**
         * <T extends Comparable<T>>
         * 
         * quer dizer que o metodo vai trabalhar com este tipo T
         * 
         * extends Comparable<T> especifica que o tipo T é um tipo Comparable, pois
         * estaremos usando neste metodo o metodo compareTo
         * 
         * sintese: o metodo vai trabalhar com qq tipo T (List<T> list), desde que o T
         * seja qq subtipo ou subclasse de Comparable <T extends Comparable<T>>
         */
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }

        T max = list.get(0);

        for (T item : list) {

            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
