package cap1_;

import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {



        Scanner sc_input = new Scanner(System.in);

        float n1, n2, n3;
        String nome;


        System.out.println("Digite nome");
        nome = sc_input.nextLine();


        System.out.println("Digite o 2º número" );
        n2 = sc_input.nextFloat();

        System.out.println(nome + n2);

        tipos_dados.a = 12;
        System.out.println(tipos_dados.a);

    }

}


