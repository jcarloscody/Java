// Métodos StringBuilder charAt, setCharAt, getChars e reverse.
package cap14_stringCaracteresExpressoesregulares.StringBuilder;

/**
 *
 * @author developer
 */
public class StringBuilderChars {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("hello there");

        System.out.printf("buffer = %s%n", buffer.toString());
        System.out.printf("Character at 0: %s%nCharacter at 4: %s%n%n", buffer.charAt(0), buffer.charAt(4));
        //. O método charAt (linha 12) aceita um argumento inteiro e retorna o caractere DESTE indice
        
        char[] charArray = new char[buffer.length()];
        buffer.getChars(0, buffer.length(), charArray, 0);
        /*O método getChars (linha 15) copia caracteres de um StringBuilder no array de caractere passado como um argumento. Esse método aceita quatro argumentos —
        - o índice inicial a partir do qual caracteres devem ser copiados no StringBuilder,
o        - índice um além do último caractere que será copiado a partir do StringBuilder, 
        - o array de caracteres em que os caracteres serão copiados e a 
        - localização inicial no array de caracteres onde o primeiro caractere deve ser colocado*/
        
        System.out.print("The characters are: ");

        for (char character : charArray)
            System.out.print(character);

        /*O método setCharAt (linhas 21
e 22) aceita um argumento inteiro e um argumento caractere e configura o caractere na posição especificada no StringBuilder
como o argumento caractere*/
        buffer.setCharAt(0, 'H');
        buffer.setCharAt(6, 'T');
        System.out.printf("%n%nbuffer = %s", buffer.toString());

        buffer.reverse();
        System.out.printf("%n%n%n%nbuffer = %s%n", buffer.toString());
       }
}
