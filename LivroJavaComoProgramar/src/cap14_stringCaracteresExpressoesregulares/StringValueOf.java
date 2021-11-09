/*cada objeto em Java tem um método toString que permite que um programa obtenha a representação de string
do objeto. Infelizmente, essa técnica não pode ser utilizada com tipos primitivos porque eles não têm métodos. A classe String fornece os métodos static que aceitam um argumento de qualquer tipo e o convertem em um objeto String.*/
package cap14_stringCaracteresExpressoesregulares;


public class StringValueOf {
   public static void main(String[] args) {
    char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
    boolean booleanValue = true;
    char characterValue = 'Z';
    int integerValue = 7;
    long longValue = 10000000000L; // sufixo L indica tipo long ÿ
    float floatValue = 2.5f; // f indica que 2.5 é um tipo floatÿ
    double doubleValue = 33.333; // sem sufixo, tipo double é padrão
    Object objectRef = "hello"; // atribui string a uma referência Object
    String ArrayStr = String.valueOf(charArray);
    
    System.out.printf("char array = %s%n", String.valueOf(charArray));
    System.out.printf("strig= %s%n", ArrayStr);
    System.out.printf("part of char array = %s%n",String.valueOf(charArray, 3, 3)); //g. A expressão String.valueOf(charArray, 3, 3) na linha 20 utiliza uma parte do array de caracteres charArray para criar um novo objeto String. O segundo argumento especifica o índice inicial a partir do qual os caracteres são utilizados. O terceiro argumento especifica o número de caracteres a ser utilizado
    System.out.printf("boolean = %s%n", String.valueOf(booleanValue));
    System.out.printf("char = %s%n", String.valueOf(characterValue));
    System.out.printf("int = %s%n", String.valueOf(integerValue));
    System.out.printf("long = %s%n", String.valueOf(longValue));
    System.out.printf("float = %s%n", String.valueOf(floatValue));
    System.out.printf("double = %s%n", String.valueOf(doubleValue));
    System.out.printf("Object = %s", String.valueOf(objectRef));
}  
}
