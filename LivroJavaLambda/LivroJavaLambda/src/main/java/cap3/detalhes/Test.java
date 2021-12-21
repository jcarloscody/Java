
package cap3.detalhes;

import cap3.proprioLambda.*;

/**
Interfaces funcionais são o coração do recurso de Lambda. O Lambda por si só não
existe, e sim expressões lambda, quando atribuídas/inferidas a uma interface funcional.
 */
public class Test {
    public static void main(String[] args) {
        Runnable o = () -> {
            System.out.println("O que sou eu? Que lambda?");
        };
        
        System.out.println(o);
        System.out.println(o.getClass());/*Aclasse gerada que representa esse nosso Lambda é a Capitulo3$$Lambda$1.
Na verdade, esse nome vai depender de quantos lambdas você tem na sua classe
Capitulo3. Repare que não foi gerado um .class no seu diretório, essa classe é
criada dinamicamente!*/
        
        
        final int numero = 5;/*você também pode acessar as variáveis finais do método a qual você pertence: Um lambda do Java enclausura as variáveis que estavam naquele contexto, assim com as classes anônimas.*/
            new Thread(() -> {
                System.out.println(numero);
        }).start();
            
            
        int numero2 = 5; //e até mesmo acessar a variável local que não é final
            new Thread(() -> {
                System.out.println(numero2);
            }
        ).start();
        
        //mas não pode altera-las
        int numero3 = 5;
            new Thread(() -> {
                System.out.println(numero3); // não compila
            }
        ).start();
        numero3 = 10; // por causa dessa linha!
            
        
    }
}
