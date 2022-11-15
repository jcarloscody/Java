package s18_Interfaces.InterfaceComparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        String path = "C:\\Users\\developer\\Documents\\Repositorios\\CursoJavaUdemy\\CursoJavaUdemy\\src\\main\\java\\s18_Interfaces\\InterfaceComparable\\texto.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String name = bufferedReader.readLine();

            while (name != null) {
                lista.add(name);
                name = bufferedReader.readLine();
            }

            Collections.sort(lista);// por meio do metodo sort da class Collections, vc poderá ordenar uma colecao
            // e só funciona se o list do tipo T for um comparable

            for (String s : lista) {
                System.out.println(s);
            }

        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e);
        }

        /** USANDO UMA INTERFACECOMPARABLE */
        List<Employee> lista2 = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String employeecsv = bufferedReader.readLine();

            while (employeecsv != null) {
                String[] filtro = employeecsv.split(","); // cria um vetor onde cada posicao é determinada pela ,
                lista2.add(new Employee(filtro[0], Double.parseDouble(filtro[1])));
                employeecsv = bufferedReader.readLine();
            }

            Collections.sort(lista2);// temos que implementar a classe Employee com a interface comparable. poissó
                                     // funciona se o list do tipo T for um comparable

            for (Employee s : lista2) {
                System.out.println(s.getName() + ", " + s.getSalary());
            }

        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e);
        }

        // experimentando o comparable
        /**
         * return do comparable (-) menor que (0) igual (+) maior que
         */
        System.out.println("josue".compareTo("carlos"));
        System.out.println("josue".compareTo("josue"));
        System.out.println("carlos".compareTo("josue"));
    }
}
