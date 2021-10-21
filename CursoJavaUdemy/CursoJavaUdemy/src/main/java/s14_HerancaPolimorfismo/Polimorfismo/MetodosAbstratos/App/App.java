package s14_HerancaPolimorfismo.Polimorfismo.MetodosAbstratos.App;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import s14_HerancaPolimorfismo.Polimorfismo.MetodosAbstratos.Entidades.Circulo;
import s14_HerancaPolimorfismo.Polimorfismo.MetodosAbstratos.Entidades.Cores;
import s14_HerancaPolimorfismo.Polimorfismo.MetodosAbstratos.Entidades.Forma;
import s14_HerancaPolimorfismo.Polimorfismo.MetodosAbstratos.Entidades.Retangulo;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Forma> lista = new ArrayList<>();

        System.out.println("Digite a quantidade de Formas: ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.print(i + " Qual a forma? r - retangulo, c - circulo: ");
            char op = sc.next().charAt(0);
            System.out.println("Qual  a cor? BLACK BLUE RED");
            Cores cor = Cores.valueOf(sc.next());
            if (op == 'r') {
                System.out.println("Qual a largura? ");
                Double largura = sc.nextDouble();
                System.out.println("Qual a altura? ");
                Double altura = sc.nextDouble();
                lista.add(new Retangulo(largura, altura, cor, "retangulo"));
            } else {
                System.out.println("Qual o radius? ");
                Double radius = sc.nextDouble();
                lista.add(new Circulo(radius, cor, "circulo"));
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("VALORES -> ");

        for (Forma l : lista) {
            System.out.printf("Forma: %s   Area: %.2f%n", l.getNome(), l.area());
        }
    }
}
