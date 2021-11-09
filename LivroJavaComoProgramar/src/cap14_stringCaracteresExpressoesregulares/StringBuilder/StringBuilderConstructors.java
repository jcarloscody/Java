
package cap14_stringCaracteresExpressoesregulares.StringBuilder;
/* classe StringBuilder para criar e manipular informações de string dinâmica — isto é,
strings modificáveis. Cada StringBuilder é capaz de armazenar um número de caracteres especificado pela sua capacidade. Se a
capacidade de uma StringBuilder for excedida, ela é expandida para acomodar os caracteres adicionais.*/

public class StringBuilderConstructors {
    public static void main(String[] args) {
        StringBuilder buffer1 = new StringBuilder(); 
        StringBuilder buffer2 = new StringBuilder(10); 
        StringBuilder buffer3 = new StringBuilder("hello");
        
        buffer2.append("ldks");
        buffer2.append("llkllllll");
        
        //usam implicitamente o método toString da classe StringBuilder para gerar StringBuilders com o método printf.
        System.out.printf("buffer1 = \"%s\"%n", buffer1);
        System.out.printf("buffer2 = \"%s\"%n", buffer2);
        System.out.printf("buffer3 = \"%s\"%n", buffer3);
    }
}
