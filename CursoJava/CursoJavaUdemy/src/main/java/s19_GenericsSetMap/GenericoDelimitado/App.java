package s19_GenericsSetMap.GenericoDelimitado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Uma empresa de consultoria deseja avaliar a performance de produtos,
 * funcionários, dentre outras coisas. Um dos cálculos que ela precisa é
 * encontrar o maior dentre um conjunto de elementos. Fazer um programa que leia
 * um conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
 * mostre o mais caro deles.
 */

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> lista = new ArrayList<>();
        // a listaa será do tipo Product

        String path = "in.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String line = bufferedReader.readLine(); // LENDO A LINHA
            while (line != null) {
                String[] fields = line.split(","); // CONSTRUÇÃO DO ARRAY
                lista.add(new Product(fields[0], Double.parseDouble(fields[1]))); // ADICIONA UMA INSTANCIA DE
                                                                                  // PRODUCT(nome, preco)
                                                                                  // NA LISTA
                line = bufferedReader.readLine();
            }

            Product x = CalculationService.max(lista);
            System.out.println("Most expensive:");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
