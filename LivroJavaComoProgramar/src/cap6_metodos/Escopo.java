package cap6_metodos;


public class Escopo {
    
    // campo acessível para todos os métodos dessa classeÿ
    private static int x = 1; 

    // O método main cria e inicializa a variável local x
    // e chama os métodos useLocalVariable e useField
    public static void main(String[] args){
        int x = 5; // variável local x do método sombreia o campo xÿ

        System.out.printf("local x in main is %d%n", x);

        useLocalVariable(); // useLocalVariable tem uma variável local 26
        useField(); // useField utiliza o campo x da classe Scope 10
        useLocalVariable(); // useLocalVariable reinicializa a variável local 26
        useField(); // campo x da classe Scope retém seu valor 100

        System.out.printf("%nlocal x in main is %d%n", x); //1
        }

    // cria e inicializa a variável local x durante cada chamada
    public static void useLocalVariable(){
        int x = 25; // inicializada toda vez que useLocalVariable é chamadoÿ
        System.out.printf(
        "%nlocal x on entering method useLocalVariable is %d%n", x);
        ++x; // modifica a variável local x desse métodoÿ
        System.out.printf(
        "local x before exiting method useLocalVariable is %d%n", x);
    }

    // modifica o campo x da classe Scope durante cada chamada
    public static void useField(){
        System.out.printf(
        "%nfield x on entering method useField is %d%n", x);
        x *= 10; // modifica o campo x da classe Scopeÿ
        System.out.printf(
        "field x before exiting method useField is %d%n", x);
    }
} // fim da classe Scope
    

