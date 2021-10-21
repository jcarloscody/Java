package s19_GenericsSetMap.Intro;

import java.util.List;
import java.util.ArrayList;

public class PrintService<T> {

    /**
     * <T> isso é o generics
     * 
     * a classe vai receber determinado tipo na instanciacao
     */

    private List<T> list = new ArrayList<>();

    /** a lista vai seguir a parametrizacao do generics */

    public void addValue(T value) {
        // vai aceitar o valor conforme a parametrizacao
        list.add(value);
    }

    public T first() {
        // o retorno é confoerme a parametrizacao
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
