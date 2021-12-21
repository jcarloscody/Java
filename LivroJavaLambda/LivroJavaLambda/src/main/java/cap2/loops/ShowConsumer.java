/*
Criamos uma classe que implementa essa nova interface do Java 8. Ela é bem
trivial, possuindo o único método accept responsável por pegar um objeto do tipo
Usuario e consumi-lo. ‘Consumir’ aqui é realizar alguma tarefa que faça sentido
pra você.
 */
package cap2.loops;

import java.util.function.Consumer;

/**
 *
 * @author developer
 */
public class ShowConsumer implements Consumer<Usuario>{

    @Override
    public void accept(Usuario t) {
        System.out.println(t.getNome());
    }


}
