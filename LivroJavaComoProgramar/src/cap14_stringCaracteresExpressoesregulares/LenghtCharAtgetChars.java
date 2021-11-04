// Esse aplicativo demonstra os métodos da classe String
// length, charAt e getChars.
package cap14_stringCaracteresExpressoesregulares;

/**
 *
 * @author developer
 */
public class LenghtCharAtgetChars {
    public static void main(String[] args) {
        String s1 = "hello there";
        char[] charArray = new char[5];

        System.out.printf("s1: %s", s1);

         // testa o método length
        System.out.printf("%nLength of s1: %d", s1.length());

         // faz loop pelos caracteres em s1 com charAt e os exibe na ordem inversa
        System.out.printf("%nThe string reversed is: ");

        for (int count = s1.length() - 1; count >= 0; count--)
               System.out.printf("%c ", s1.charAt(count));//. O método charAt recebe um argumento inteiro que é utilizado  como índice e retorna o caractere nessa posição

        
        // copia caracteres a partir de string para charArray
        s1.getChars(0, 5, charArray, 0);// o método String getChars para copiar os caracteres de uma String em um array de caracteres. O primeiro  argumento é o índice inicial a partir do qual os caracteres devem ser copiados. O segundo argumento é o índice que está além do último caractere que será copiado da String. O terceiro argumento é o array de caracteres, em que os caracteres devem ser copiados.  O último argumento é o índice inicial onde os caracteres copiados são colocados no array de caracteres alvo
        System.out.printf("%nThe character array is: ");

        for (char character : charArray)
            System.out.print(character);

        System.out.println();
    } 
} 

