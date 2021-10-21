package s10_memoria_array_listas;

public class foreach {
    public static void main(String[] args) {

        String[] nomes = { "josue", "mario", "patricia", "vinicios" };

        for (String nome : nomes) {
            System.out.printf("nome: %s%n", nome);
        }
    }
}
