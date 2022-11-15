package s7_stringsEfuncoes;

public class strg {
    public static void main() {
        String nome = "         asasd ADASA asssdasd          ";

        String minusculas = nome.toLowerCase();
        String maiuscula = nome.toUpperCase();
        String espacamento = nome.trim();
        String recorte = nome.substring(5);
        String recortequantidade = nome.substring(5, 6);
        String troca = nome.replace('a', 'b');
        String trocaStr = nome.replaceAll("asasd", "josue");
        int posicao = nome.indexOf("josue");
        int ultimaPosicao = nome.lastIndexOf("josue");
        String[] recorteVetor = nome.split(" ");

        // FUNÇÕES

    }

}
