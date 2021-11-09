package cap15_ArquivosFluxosSerializacaodeObjetos.EscrevendoArquivo;

// Gravando dados em um arquivo de texto sequencial com a classe Formatter.
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.Scanner;

public class ArquivoTextoCriacao {

    private static Formatter output; // envia uma saída de texto para um arquivo.    Formatter para gerar Strings formatadas utilizando as mesmas capacidades de formatação que as do método System.out.printf. Um objeto Formatter pode gerar saída para vários locais, como para uma janela de comando ou um arquivo, como fazemos neste exemplo. O

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }
    
    // abre o arquivo clients.txt   -   Para arquivos de texto, utilizamos a extensão de arquivo .txt. Se o arquivo não existir, ele será criado. Se um arquivo existente estiver aberto, seu conteúdo será truncado — todos os dados no arquivo são descartados. Se nenhuma exceção ocorrer, o arquivo é aberto para gravação e o objeto Formatter resultante pode ser usado a fim de gravar dados no arquivo
    public static void openFile() {
        try {
            output = new Formatter(".\\src\\cap15_ArquivosFluxosSerializacaodeObjetos\\EscrevendoArquivo\\clients.txt"); // abre o arquivo. O objeto Formatter é instanciado
            //O construtor recebe um argumento — uma String contendo o nome do arquivo,  incluindo seu caminho. Se um caminho não for especificado, como é o caso aqui, a JVM assume que o arquivo está no diretório a partir do qual o programa foi executado
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); // termina o programa
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // termina o programa
        }
    }

    // adiciona registros ao arquivo
    public static void addRecords() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ", "Enter account number, first name, last name and balance.", "Enter end-of-file indicator to end input.");
        String letraA, letraB;
        double numeroB;
        int numeroA;
        Boolean continua=true;

        while (continua){
            System.out.println("Deseja Continuar?");
            letraA = input.nextLine();

            if (letraA.equals("n")){
                break;
            }

            System.out.println("Digite um numero inteiro");
            numeroA = input.nextInt();
            input.nextLine();
            System.out.println("Digite um numero double");
            numeroB = input.nextDouble();
            input.nextLine();
            System.out.println("Digite uma frase");
            letraA = input.nextLine();
            System.out.println("Digite uma frase");
            letraB = input.nextLine();


            output.format("%d %s %s %.2f%n", numeroA,letraA, letraB, numeroB);

        }


            System.out.print("? ");
        } // fim do while
     // fim do método addRecords

    // fecha o arquivo
    public static void closeFile() {
        if (output != null) {
            output.close();
        }
    }
}
