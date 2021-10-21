package s17_TrabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppFileReaderTRY {
    public static void main(String[] args) {

        // o caminho do arquivo
        String path = "C:\\Users\\developer\\Documents\\Repositorios\\CursoJavaUdemy\\CursoJavaUdemy\\src\\main\\java\\s17_TrabalhandoComArquivos\\arquivo.txt";

        // try-with-resources
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) { // tentar abrir e ler
            // vai ler a linha do arquivo, quando chegar ao final vai retornar nulo
            String linha = bufferedReader.readLine();

            // enquanto nao chegar no final, ou seja, enquanto nao retornar nulo, vai
            // printar a linha
            while (linha != null) {
                System.out.println(linha);
                linha = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
