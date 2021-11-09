
package cap14_stringCaracteresExpressoesregulares;

// métodos substring da classe String.
public class SubString {
    public static void main(String[] args) {
    String letters = "abcdefghijklmabcdefghijklm";

    /*O argumento especifica o índice inicial na String letters original a partir da qual os caracteres devem ser copiados. A substring retornada
contém uma cópia dos caracteres desde o índice inicial até o final da String*/
    
    // testa métodos substring
    System.out.printf("Substring from index 20 to end is \"%s\"%n",letters.substring(20));
    System.out.printf("%s \"%s\"%n", "Substring from index 3 up to, but not including 6 is", letters.substring(3, 6));
} 
}
