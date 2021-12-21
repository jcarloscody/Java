
package cap2.lambda;
/*um lambda no Java é uma maneira mais simples de implementar uma interface que só tem um único método. No nosso caso, a interface
Consumer é uma boa candidata.*/

import cap2.loops.Usuario;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Test {
    public static void main(String ... args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);//Arrays.asList é uma maneira simples de criar uma List imutável
        
        Consumer<Usuario> mostrador = (Usuario u) -> {System.out.println(u.getNome());};
        
        Consumer<Usuario> mostrador2 = uu -> {System.out.println(uu.getNome());};
        
        Consumer<Usuario> mostrador3 = uuu -> System.out.println(uuu.getNome());//quando so tem uma instrucao pode tirar as {}
        
        usuarios.forEach(mostrador);
        
        usuarios.forEach(u4 -> System.out.println(u4.getNome())); /*Vale lembrar que essa variável u não pode ter sido declarada no mesmo escopo
//da invocação do forEach, pois o lambda pode capturar as variáveis de fora,
        
        e a interface Consumer<Usuario>, por exemplo, tem apenas um único
método abstrato, o accept. É por isso que, quando faço o forEach a seguir, o
compilador sabe exatamente qual método deverá ser implementado
        Podemos
dizer então que toda interface do Java que possui apenas um método abstrato pode
ser instanciada como um código lambda!
        */
        
    }
}
