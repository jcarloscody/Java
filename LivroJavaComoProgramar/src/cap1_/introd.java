
/**
 * @author josue
 * @objetivo: introdução ao java
 * @última data de modificação: 04/01/2021
 */

package cap1_;

/**
 * Classes privadas só poderão ser visualizadas dentro de seu próprio pacote
 * enquanto as 
 * públicas serão acessíveis por qualquer classe de qualquer pacote.
 * Se o qualificador for omitido, a classe será privada por padrão.
 */
public class introd { // declaração de classe
    /**
     * A classe, em Java, é um tipo de dados abstrato que pode ser definido pelo
     * usuário. É, na verdade, algo mais que isto. Uma classe consiste de
     * declarações de campos de dados e métodos. Os campos de dados são variáveis,
     * referências ou constantes e os métodos contém o código com as instruções que
     * operam sobre os dados da classe ou dos objetos criados através dela
     */

    public static void main(String[] args) {
        // main -> é o método que inicia a execução do app
        // este médodo deve estar presente no app, caso contrário a JVM não executará.
        // () -> indica que é um bloco de construção do programa do método.
        // void -> é uma palavra chave que indica que o método não retornará nenhuma
        // informação.
        System.out.println("Welcome  Java!");
        // \n -> é o escape. faz pular uma linha
        // instrui o pc a executar uma ação
        // System.out -> é um objeto de saída, que permite mostrar info na janela de
        // comando
        // a string entre () é o argumento

        System.out.println("Welcome  " + "\"Java\"" + "! \nPULANDO UMA \nLINHA");

        // ESPECIFICADOR DE FORMATO
        System.out.printf("%s%n%s%n%s%n%s%n", "uma só instrução", "com várias afirmações", "pulando linhas cada", 1);
        // f -> significa formato
        // %s -> inicia com a % + o tipo de dado
        // %n -> é o mesmo que escape \n
        // há 4 strings então deve haver 4 * %s%n
    }// fim do método main

}
