package s19_GenericsSetMap.HashCodeEqualsSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sett {
    public static void main(String[] args) {
        Set<String> setHashSet = new HashSet<>();// nao ordenado
        Set<String> setTreeSet = new TreeSet<>();// ordenado pelo compareTo
        Set<String> setLinkedHashSet = new LinkedHashSet<>();// ordenado conforme a insercao

        setHashSet.add("TV");
        setHashSet.add("Notebook");
        setHashSet.add("Tablet");
        System.out.println(setHashSet.contains("Notebook"));
        for (String p : setHashSet) {
            System.out.println(p);
        }

        setHashSet.remove("TV");
        setHashSet.removeIf(x -> x.length() >= 3);

        setHashSet.add("TV");
        setHashSet.add("Notebook");
        setHashSet.add("Tablet");

        setHashSet.removeIf(x -> x.charAt(0) == 'T');

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
        // union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);
        // intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);
        // difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
