package s8_IntroPOO.App;

import java.util.Locale;
import java.util.Scanner;

import s8_IntroPOO.Entidade.CalcVolume;

public class ProgramCircun {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o radius");
        double radius = sc.nextDouble();

        System.out.printf("circunferencia %.2f%n", circunferencia(radius));

        System.out.printf("volume %.2f%n", CalcVolume.volume(radius));

        sc.close();
    }

    public static double circunferencia(double radius) {

        return 2.0 * PI * radius;
        /**
         * tbm chamados de membros de classe
         * 
         * são membros que fazem sentido independentemente de objetos. nao precisam de
         * objeto para serem chamados. sao chamdos a partir do proprio nome da classe
         * 
         * aplicacao comuns: classes unitarias e declaracao de constantes
         * 
         * uma classe que so tem membros estaticos pode ser uma classe estatica tbm.
         * esta classe nao podera ser instanciada
         * 
         */
    }
}
