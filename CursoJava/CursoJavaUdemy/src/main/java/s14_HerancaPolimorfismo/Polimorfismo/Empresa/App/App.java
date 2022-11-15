package s14_HerancaPolimorfismo.Polimorfismo.Empresa.App;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import s14_HerancaPolimorfismo.Polimorfismo.Empresa.Entidades.Trabalhadores;
import s14_HerancaPolimorfismo.Polimorfismo.Empresa.Entidades.TrabalhadoresTerceirizados;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Trabalhadores> lista = new ArrayList<>();

        System.out.print("Digite quantos funcionarios terá esta lista: ");
        int quantidadeFuncionarios = sc.nextInt();

        System.out.print("");

        for (int i = 1; i <= quantidadeFuncionarios; i++) {
            System.out.printf("Funcionário %d%n", i);

            System.out.print("É terceirizado? ");
            char terceirizado = sc.next().charAt(0);

            System.out.print("Digite seu nome: ");
            // sc.nextLine();
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Digite a quantidade de horas: ");
            int horas = sc.nextInt();
            System.out.print("Digite o valor por hora: ");
            double vph = sc.nextDouble();

            if (terceirizado == 'y') {
                System.out.print("Digite um adicional do terceirizado: ");
                double adi = sc.nextDouble();

                // TrabalhadoresTerceirizados trabalhadorTerceirizado = new
                // TrabalhadoresTerceirizados(nome, horas, vph,
                // adi);
                // lista.add(trabalhadorTerceirizado);
                lista.add(new TrabalhadoresTerceirizados(nome, horas, vph, adi));
            } else {
                // Trabalhadores trabalhador = new Trabalhadores(nome, horas, vph);
                lista.add(new Trabalhadores(nome, horas, vph));
            }
        }

        System.out.println("");

        System.out.println("PAGAMENTOS --> ");
        for (Trabalhadores trb : lista) {
            System.out.println(trb.toString());
        }

        sc.close();
    }
}
