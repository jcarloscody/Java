// Métodos String equals, equalsIgnoreCase, compareTo e regionMatches.
package cap14_stringCaracteresExpressoesregulares;

/*Como o computador sabe que uma letra “vem antes” de outra? Todos os caracteres são representados no computador como 
códigos numéricos (veja o Apêndice B). Quando o computador compara Strings, na verdade ele compara os códigos numéricos dos 
caracteres nas Strings.*/

public class StringCompare {
    public static void main(String[] args) {
        String s1 = new String("hello"); // s1 é uma cópia de "hello"
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n%n", s1, s2, s3, s4);
        
        if (s2 == "goodbye") {
            System.out.println("MUITO BOM");
        }
        
        // teste para igualdade
        if (s1.equals("hello")) // true   O método retorna true se os conteúdos dos objetos forem iguais. O método equals utiliza uma  comparação lexicográfica — compara os valores inteiros Unicode (ver Apêndice H para informações adicionais) que representam  cada caractere em cada String. Portanto, se a String "hello" é comparada com a string "HELLO", o resultado é false, pois a  representação de inteiro de uma letra minúscula é diferente daquela da letra maiúscula correspondente.
            System.out.println("s1 equals \"hello\"");
        else
            System.out.println("s1 does not equal \"hello\""); 

        // testa quanto à igualdade com ==
        if (s1 == "hello") // false; eles não são os mesmos objetos.  Comparar referências com == pode levar a erros de lógica, porque == compara as referências a fim de determinar se elas referenciam  o mesmo objeto, não se dois objetos têm o mesmo conteúdo. Quando dois objetos separados que contêm os mesmos valores são comparados com ==, o resultado será false. Ao comparar objetos para determinar se eles têm o mesmo conteúdo, utilize o método equal
             System.out.println("s1 is the same object as \"hello\"");
        else
            System.out.println("s1 is not the same object as \"hello\"");

        // testa quanto à igualdade (ignora maiúsculas e minúsculas)
        if (s3.equalsIgnoreCase(s4)) // true
            System.out.printf("%s equals %s with case ignored%n", s3, s4);
        else
            System.out.println("s3 does not equal s4");

        // testa compareTo  - . O método compareTo é declarado na interface Comparable e implementado na classe String.
        //0  - As Strings forem iguais     
        //-1 - String que invoca compareTo for menor que a String que é passada como um argumento
        //1  - String que invoca compareTo for maior que a String que é passada como um argumento
        System.out.printf("%ns1.compareTo(s2) is %d", s1.compareTo(s2));
        System.out.printf("%ns2.compareTo(s1) is %d", s2.compareTo(s1));
        System.out.printf("%ns1.compareTo(s1) is %d", s1.compareTo(s1));
        System.out.printf("%ns3.compareTo(s4) is %d", s3.compareTo(s4));
        System.out.printf("%ns4.compareTo(s3) is %d%n%n", s4.compareTo(s3));

        // testa regionMatches (distingue maiúsculas e minúsculas)            comparar a igualdade entre partes de duas  Strings
        if (s3.regionMatches(0, s4, 0, 5)) // O primeiro argumento para essa versão do método é o índice inicial na String que chama o método. O segundo argumento é uma comparação de String. O terceiro argumento é o índice inicial na comparação de String. O último argumento é o  número de caracteres a comparar entre as duas Strings. O método retorna true apenas se o número especificado de caracteres for  lexicograficamente igual.
            System.out.println("First 5 characters of s3 and s4 match");
        else
            System.out.println("First 5 characters of s3 and s4 do not match");

        // testa regionMatches (ignora maiúsculas e minúsculas)
        if (s3.regionMatches(true, 0, s4, 0, 5))
            System.out.println("First 5 characters of s3 and s4 match with case ignored");
        else
            System.out.println("First 5 characters of s3 and s4 do not match");
    } 
}
