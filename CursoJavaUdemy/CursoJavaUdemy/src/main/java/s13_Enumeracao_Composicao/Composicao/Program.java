package s13_Enumeracao_Composicao.Composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import s13_Enumeracao_Composicao.Composicao.Enums.TrabalhadorNivel;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat simpledateformat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite o nome do seu departamento: ");
        String departamento = sc.nextLine();
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o seu nivel: ");
        String nivel = sc.nextLine();
        System.out.println("Digite a sua base salarial: ");
        double baseSalarial = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nome, TrabalhadorNivel.valueOf(nivel), baseSalarial,
                new Departamento(departamento));

        System.out.println("Quantos contratos? ");
        int quantidadeDeContrato = sc.nextInt();

        for (int i = 1; i <= quantidadeDeContrato; i++) {
            System.out.println("Contrato número: " + i);
            System.out.println("Digite a data dd/mm/yyyy: ");
            Date data = simpledateformat.parse(sc.next());

            System.out.println("Digite o valor por  hora: ");
            double valorPorHora = sc.nextDouble();

            System.out.println("Digite a quantidade de Horas: ");
            int horas = sc.nextInt();

            HoraContratual contrato_por_hora = new HoraContratual(data, valorPorHora, horas);
            trabalhador.AdicionarContratoHora(contrato_por_hora);
        }

        System.out.println();
        System.out.println("Digite mm/YYYY para calcular o salario: ");
        String mesEAno = sc.next();

        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println(mes + "/" + ano);

        System.out.println("O trabalhador " + trabalhador.getNome() + " do departamento "
                + trabalhador.getDepartamento().getNome() + " ganhou R$ "
                + String.format("%.2f", trabalhador.valorPorPeriodo(ano, mes)) + " dentro do período solicitado");

        sc.close();
    }
}
