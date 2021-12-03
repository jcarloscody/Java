/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap20_generico.intro;

/**
 *
 * @author developer
 */
public class ComGenerico {

    public static void main(String[] args) {
        // cria arrays de Integer, Double e Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray); // passa um array de Integerÿ2
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray); // passa um array Doubleÿ
        System.out.print("%nArray characterArray contains:%n");
        printArray(characterArray); // passa um array de Characterÿ
    }

    /*. o compilador trata cada chamada de método apropriadamente. Em tempo de compilação, o compilador 
garante a segurança de tipo do seu código, evitando muitos erros em tempo de execução.*/
    public  static <T> void  printArray(T[] inputArray) {
        // exibe elementos do array
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
/*Os parâmetros de tipo podem representar somente 
tipos por referência — não tipos primitivos (como int, double e char). Também observe que os nomes dos parâmetros de tipo por 
toda a declaração de método devem corresponder aqueles declarados na seção de parâmetro de tipo*/
        System.out.println();
    }
}
