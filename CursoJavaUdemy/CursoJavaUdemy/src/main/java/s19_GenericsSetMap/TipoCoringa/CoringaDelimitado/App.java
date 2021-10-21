package s19_GenericsSetMap.TipoCoringa.CoringaDelimitado;

import java.util.ArrayList;
import java.util.List;

/**
 * Vamos fazer um método para retornar a soma das áreas de uma lista de figuras.
 */
public class App {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list) {
        // a mesma coisa que estudamos, sendo que agora écom coringa
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }

        // não conseguiremos adicionar elementos na lista do método
        return sum;
    }
}
