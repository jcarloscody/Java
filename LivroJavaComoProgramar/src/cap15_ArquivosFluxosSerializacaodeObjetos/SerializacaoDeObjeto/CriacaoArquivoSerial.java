package cap15_ArquivosFluxosSerializacaodeObjetos.SerializacaoDeObjeto;
// Gravando objetos sequencialmente em um arquivo com a classe ObjectOutputStream.

/*Na Seção 15.4, demonstramos como gravar os campos individuais de um registro em um arquivo como texto, e como ler esses
campos. Quando a saída dos dados foi enviada para o disco, algumas informações foram perdidas, como o tipo de cada valor. Por
exemplo, se o valor "3" for lido a partir de um arquivo, não há como dizer se ele veio de um int, uma String ou um double. Temos
apenas dados, não informações de tipo, em um disco.*/

/*Às vezes queremos ler ou gravar um objeto em um arquivo ou em uma conexão de rede. O Java fornece a serialização de objetos
para esse propósito. Um objeto serializado é representado como uma sequência de bytes que inclui os dados do objeto, bem como
as informações sobre o tipo dele e a natureza dos dados armazenados nele. Depois que um objeto serializado foi gravado em um
arquivo, ele pode ser lido a partir do arquivo e desserializado — isto é, as informações dos tipos e bytes que representam o objeto e
seus dados podem ser utilizadas para recriar o objeto na memória*/

/*As classes ObjectInputStream e ObjectOutputStream (pacote java.io), que, respectivamente, implementam as interfaces
ObjectInput e ObjectOutput, permitem que objetos inteiros sejam lidos ou gravados em um fluxo (possivelmente um arquivo).*/



import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CriacaoArquivoSerial {

    private static ObjectOutputStream output; // gera saída dos dados no arquivoÿ

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    // abre o arquivo clients.ser
    public static void openFile() {
        try {
            //Arquivos existentes que são abertos para a saída dessa maneira são truncados. Não há nenhuma extensão de nome de arquivo padrão para aqueles que armazenam objetos serializados, portanto, escolhemos .ser
            output = new ObjectOutputStream( Files.newOutputStream(Paths.get(".\\src\\cap15_ArquivosFluxosSerializacaodeObjetos\\SerializacaoDeObjeto\\clients.ser"))); //o método Files static newOutputStream, que recebe um Path especificando o arquivo a abrir e, se este existir, retorna um OutputStream que pode ser usado para gravar no arquivo.
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // termina o programa
        }
    }

    // adiciona registros ao arquivo
    public static void addRecords() {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n? ",
                "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.");

        while (input.hasNext()) // faz um loop até o indicador de fim de arquivo
        {
            try {
                // cria novo registro; esse exemplo supõe uma entrada válida
                Account record = new Account(input.nextInt(), input.next(), input.next(), input.nextDouble());

                // serializa o objeto de registro em um arquivoÿ
                output.writeObject(record);  //A interface ObjectOutput contém o método writeObject, que recebe um Object como um argumento e grava suas informações em um OutputStream. Uma classe que implementa a interface ObjectOutput (como ObjectOutputStream) declara esse método e garante que o objeto que é gerado trabalha a interface Serializable
            } catch (NoSuchElementException elementException) {
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // descarta entrada para o usuário tentar de novo
            } catch (IOException ioException) {
                System.err.println("Error writing to file. Terminating.");
                break;
            }

            System.out.print("? ");
        }
    }

    // fecha o arquivo e termina o aplicativo
    public static void closeFile() {
        try {
            if (output != null)
                output.close();
        } catch (IOException ioException) {
            System.err.println("Error closing file. Terminating.");
        }
    }
}
