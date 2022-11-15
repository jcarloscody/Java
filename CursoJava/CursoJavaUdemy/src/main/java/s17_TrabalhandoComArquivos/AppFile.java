package s17_TrabalhandoComArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AppFile {
    public static void main(String[] args) {

        File file = new File(
                "C:\\Users\\developer\\Documents\\Repositorios\\CursoJavaUdemy\\CursoJavaUdemy\\src\\main\\java\\s17_TrabalhandoComArquivos\\arquivo.txt");

        Scanner scanner = null;

        try {
            scanner = new Scanner(file);// instanciando o scanner com o arquivo. o bloco try servirá para isso.
            // pq no momenot do instanciacao, ele tentará abrir o arquivo

            while (scanner.hasNextLine()) { // testar se existe uma nova linha no arquivo
                System.out.println(scanner.nextLine());// vai printar a linha do arquivo
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } finally {
            if (scanner != null) { // independente se der certo ou nao o scanner vai ser fechado
                scanner.close();
            }
        }

    }
}
