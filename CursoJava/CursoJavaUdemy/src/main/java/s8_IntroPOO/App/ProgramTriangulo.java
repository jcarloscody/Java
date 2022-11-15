package s8_IntroPOO.App;

import java.util.Scanner;

import s8_IntroPOO.Entidade.Triangulo;

public class ProgramTriangulo {

    public static void main(String[] a) {

        Triangulo x = new Triangulo("X");
        Triangulo y = new Triangulo("Y");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do  triangulo x: ");
        x.a = sc.nextDouble();
        System.out.println("Digite o segundo lado do  triangulo x: ");
        x.b = sc.nextDouble();
        System.out.println("Digite o terceiro lado do  triangulo x: ");
        x.c = sc.nextDouble();

        System.out.println("Digite o primeiro lado do  triangulo y: ");
        y.a = sc.nextDouble();
        System.out.println("Digite o segundo lado do  triangulo y: ");
        y.b = sc.nextDouble();
        System.out.println("Digite o terceiro lado do  triangulo y: ");
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área X: %.2f%n", areaX);
        System.out.printf("Área Y: %.2f%n", areaY);

        x.OMaior(y);
        sc.close();
    }
}
