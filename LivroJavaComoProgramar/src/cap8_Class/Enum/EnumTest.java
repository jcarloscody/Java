
package cap8_Class.Enum;

import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args){
        System.out.println("All books:");
        
        /**
         * 1. constantes enum são implicitamente final.
         * 2. constantes enum são implicitamente static.
         * 3. Qualquer tentativa de criar um objeto de um tipo enum com um 
         * operador new resulta em um erro de compilação.
        */
        
        
        // imprime todos os livros em enum Book
        for (Book book : Book.values())
        System.out.printf("%-10s%-45s%s%n", book,
        book.getTitle(),book.getCopyrightYear());

        System.out.printf("%nDisplay a range of enum constants:%n");

        // imprime os primeiros quatro livros
        for (Book book : EnumSet.range(Book.JHTP, Book.CHTP))
        System.out.printf("%-10s%-45s%s%n", book,
        book.getTitle(),book.getCopyrightYear());
}
    
}
