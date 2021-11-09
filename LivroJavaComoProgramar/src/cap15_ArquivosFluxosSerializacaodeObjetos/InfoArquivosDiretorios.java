package cap15_ArquivosFluxosSerializacaodeObjetos;

// A classe File utilizada para obter informações de arquivo e de diretório.
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class InfoArquivosDiretorios {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter file or directory name:");

// cria o objeto Path com base na entrada de usuárioÿ
        Path path = Paths.get(input.nextLine());
        
        if (Files.exists(path)) // se o caminho existe, gera uma saída das informações sobre ele
        {
            // exibe informações sobre o arquivo (ou diretório)
            System.out.printf("%n%s exists%n", path.getFileName()); //que recebe o nome String do arquivo ou diretório sem nenhuma informação sobre o  local.
            System.out.printf("%s a directory%n", Files.isDirectory(path) ? "Is" : "Is not"); //O método Files static isDirectory (linha 26), que recebe um Path e retorna um boolean indicando se esse Path representa um diretório no disco.
            System.out.printf("%s an absolute path%n", path.isAbsolute() ? "Is" : "Is not"); //O método Path isAbsolute (linha 28), que retorna um boolean indicando se esse Path representa um caminho absoluto para um arquivo ou diretório.
            System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(path)); //O método Files static getLastModifiedTime (linha 30), que recebe um Path e retorna um FileTime (pacote java.nio.file.attribute), indicando quando o arquivo foi modificado pela última vez. 
            System.out.printf("Size: %s%n", Files.size(path));//O método Files static size (linha 31), que recebe um Path e retorna um long representando o número de bytes no arquivo  ou diretório
            System.out.printf("Path: %s%n", path);//O método Path toString (chamado implicitamente na linha 32), que retorna uma String representando o Path
            System.out.printf("Absolute path: %s%n", path.toAbsolutePath()); //O método Path toAbsolutePath (linha 33), que converte o Path em que ele é chamado para um caminho absoluto

            if (Files.isDirectory(path)) // listagem de diretório de saída
            {
                System.out.printf("%nDirectory contents:%n");

                // objeto para iteração pelo conteúdo de um diretórioÿ
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);//usam o método Files static newDirectoryStream (linhas 40 e 41) para obter um DirectoryStream<Path> contendo os objetos Path ao conteúdo do diretório. 

                for (Path p : directoryStream) { //exibem a representação String de cada Path em DirectoryStream<Path>. 
                    System.out.println(p);
                }
            }
        } else // se não for arquivo ou diretório, gera saída da mensagem de erro
        {
            System.out.printf("%s does not exist%n", path);
        }
    } // fim de main
}
