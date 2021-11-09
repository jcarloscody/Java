package cap15_ArquivosFluxosSerializacaodeObjetos.SerializacaoDeObjeto;
// Lendo um arquivo dos objetos sequencialmente com ObjectInputStream
// e exibindo cada registro.

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UnknownFormatConversionException;

public class LerArquivoSerial {
    private static ObjectInputStream input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    // permite que o usuário selecione o arquivo a abrir
    public static void openFile() {
        try // abre o arquivo
        {
            input = new ObjectInputStream(Files.newInputStream(Paths.get(".\\src\\cap15_ArquivosFluxosSerializacaodeObjetos\\SerializacaoDeObjeto\\clients.ser")));
        } catch (IOException ioException) {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    }

    // lê o registro no arquivo
    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");

        try {
            while (true) // faz um loop até ocorrer uma EOFException
            {
                Account record = (Account) input.readObject(); //a interface ObjectInput contém o método readObject, que lê e retorna uma referência a um Object a partir de um InputStream. Depois  que um objeto foi lido, podemos fazer uma coerção da sua referência para o tipo real do objeto.

                // exibe o conteúdo de registro
                System.out.printf("%-10d%-12s%-12s%10.2f%n", record.getAccount(), record.getFirstName(), record.getLastName(), record.getBalance());
            }
        } catch (EOFException endOfFileException) { // O método readObject lança uma EOFException (processada nas linhas 54 a 57) se ocorrer uma tentativa de leitura além do final do arquivo. O método readObject lança uma ClassNotFoundException se a classe do objeto  que está sendo lido não puder ser localizada
            System.out.printf("%s", "No more records","%n");
        } catch (ClassNotFoundException classNotFoundException) {
            System.err.println("Invalid object type. Terminating.");
        } catch (UnknownFormatConversionException unknownFormatConversionException) {
            System.out.println("fim ");
        } catch (IOException ioException) {
            System.err.println("Error reading from file. Terminating.");
        }
    } // fim do método readRecords

    // fecha o arquivo e termina o aplicativo
    public static void closeFile() {
        try {
            if (input != null)
                input.close();
        } catch (IOException ioException) {
            System.err.println("Error closing file. Terminating.");
            System.exit(1);
        }
    }
}
