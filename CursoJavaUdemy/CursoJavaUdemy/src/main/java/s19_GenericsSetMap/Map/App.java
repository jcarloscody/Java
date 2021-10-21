package s19_GenericsSetMap.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();
        //
        // inserir. chave-valor
        cookies.put("username", "maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99771122");

        // remover (chave)
        cookies.remove("email");

        // inserir - chave repetida -> como nao aceita repeticao, irá sobrescrever o
        // valor
        cookies.put("phone", "99771133");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));// se existe determinada chave
        System.out.println("Phone number: " + cookies.get("phone"));// pega o valor de uma chave
        System.out.println("Email: " + cookies.get("email"));//
        System.out.println("Size: " + cookies.size());// retorna o tamano do map

        System.out.println("ALL COOKIES:");
        // acessando todos os valores
        for (String key : cookies.keySet()) {
            // keySet retorna a chave

            System.out.println(key + ": " + cookies.get(key));
            // get retorna o valor

        }
        //
        //
        //
        // COM CLASSE PRODUTO

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps)); // true, para isso teve que implementar o
                                                                           // hashcode e equals

    }
}
