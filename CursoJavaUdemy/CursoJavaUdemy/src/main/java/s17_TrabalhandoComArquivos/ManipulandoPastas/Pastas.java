package s17_TrabalhandoComArquivos.ManipulandoPastas;

import java.io.File;
import java.util.Scanner;

public class Pastas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o path: ");
        String stringPath = scanner.nextLine();

        File path = new File(stringPath);

        File[] pastas = path.listFiles(File::isDirectory); // um vetor pastas de File, que esta listando apenas
                                                           // diretorio e usando como argumento um "references metods"
                                                           // referencia a metodos para listar quem for diretorio ou
                                                           // pastas

        for (File pasta : pastas) {
            System.out.println(pasta);
        }

        File[] arquivos = path.listFiles(File::isFile); // pega so os arquivos

        for (File arquivo : arquivos) {
            System.out.println(arquivo);
        }

        boolean criarSubPasta = new File(stringPath + "\\subpasta").mkdir();
        System.out.println("diretorio criado: " + criarSubPasta);

        // INFORMAÇÕES DO ARQUIVO

        System.out.println("nome do arquivo: " + path.getName());
        System.out.println("diretorio: " + path.getParent());
        System.out.println("path: " + path.getPath());

        scanner.close();
    }
}
