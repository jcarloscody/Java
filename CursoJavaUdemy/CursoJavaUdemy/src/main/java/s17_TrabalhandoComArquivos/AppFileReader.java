package s17_TrabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppFileReader {
    public static void main(String[] args) {

        // o caminho do arquivo
        String path = "C:\\Users\\developer\\Documents\\Repositorios\\CursoJavaUdemy\\CursoJavaUdemy\\src\\main\\java\\s17_TrabalhandoComArquivos\\arquivo.txt";

        // variavel buffer
        BufferedReader bufferedReader = null;

        // variavel filereader
        FileReader fileReader = null;

        try { // tentar abrir e ler

            // instanciando e colocando como argumento o caminho
            fileReader = new FileReader(path);

            // instancia com buffer para levar como argumento o filereader, pois o buffer
            // tem uma abstracao maior
            bufferedReader = new BufferedReader(fileReader);

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
        } finally {
            try {// vai tentar fechar aqui
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
