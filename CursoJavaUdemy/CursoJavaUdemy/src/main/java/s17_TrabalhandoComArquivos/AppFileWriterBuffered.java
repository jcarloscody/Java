package s17_TrabalhandoComArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppFileWriterBuffered {
    public static void main(String[] args) {

        String path = "C:\\Users\\developer\\Documents\\Repositorios\\CursoJavaUdemy\\CursoJavaUdemy\\src\\main\\java\\s17_TrabalhandoComArquivos\\arquivo.txt";

        String[] linhas = new String[] { "bom dia", "boa tarde", "boa noite" };

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            for (String l : linhas) {
                bufferedWriter.write(l);
                bufferedWriter.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
