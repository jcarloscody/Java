package s20_ProgramacaoFuncionalEExpressoesLambda.ExercicioFinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = list.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / list.size();
            // transforma a lista em stream, aplica um map para pegar o preco depois soma
            // todos os precos com o reduce e depois divide com o tamnho da lista

            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            // comparator que compara dois strings,

            // transforma a lista em stream, depois filtra quem tem os precos abaixo da
            // media, depois pega os respectivos nomes, depois ordena passando como
            // argumento um compator com reverse para ter um comparator reverso, depois
            // retorna uma colecao convertendo para uma lista
            List<String> names = list.stream().filter(p -> p.getPrice() < avg).map(p -> p.getName())
                    .sorted(comp.reversed()).collect(Collectors.toList());

            names.forEach(System.out::println); // faz um foreach na lista

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
