package s15_TratamentoExcecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finalmente {
    public static void main(String[] args) {

        File arquivo = new File(
                "C:\\Users\\developer\\Documents\\Repositorios\\CursoJavaUdemy\\CursoJavaUdemy\\src\\main\\java\\s15_TratamentoExcecoes\\expli.txt");
        // aqui esta instanciando um objeto da classe File e passando o path, caminho,
        // como argumento apra o construtor do objeto
        Scanner sc = null; // declaracao de uma variavel tipo Scanner

        try {
            sc = new Scanner(arquivo); // aqui esta instanciando um objeto da class scanner e passando um objeto tipo
                                       // arquivo como argumento para o construtor do objeto.
            // o scanner esta lendo o arquivo

            while (sc.hasNextLine()) { // enquanto tive linha no arquivo de faça
                System.out.println(sc.nextLine()); // vai printar cada linha lida do arquivo
            }

        } catch (FileNotFoundException e) { // caso nao exista o arquivo
            System.out.println("Aquivo nao encontrado!" + e.getMessage());
        } finally {
            if (sc != null) { // se for diferente de nulo, quer dizer que existiu leu e escreveu, vai fechar o
                              // arquivo aberto.
                sc.close();
                System.out.println("->> ARQUIVO LIDO");
            }
            System.out.println("Finally executado");
        }

    }
}
