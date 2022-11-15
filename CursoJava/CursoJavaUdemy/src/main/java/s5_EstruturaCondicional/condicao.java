package s5_EstruturaCondicional;

public class condicao {
    public static void main(String[] args) {

        if (true) {
            System.out.println("chegou aqui");
            if (true) {
                System.out.println("chegou aqui");
            } else {
                System.out.println("nao chegou aqui");
            }
        } else if (false) {
            System.out.println("nao chegou aqui");
        } else {
            System.out.println("nao chegou aqui");
        }

        // OPERADORES ACUMULATIVOS
        int soma = 10;
        soma += 100; // 110
        System.out.println(soma);

        // TERNÁRIO
        String n = (2 > 4) ? "é verdade" : "é falso";
        System.out.println(n);
    }

}
