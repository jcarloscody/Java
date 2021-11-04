/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap14_stringCaracteresExpressoesregulares;

/**
 *
 * @author developer
 */
public class StringConstructors {
    public static void main(String[] args) {
        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String s = new String("hello");

        // utiliza os construtores String ÿ
        String s1 = new String(); 
        String s2 = new String(s); 
        String s3 = new String(charArray); 
        String s4 = new String(charArray, 6, 3);//e s4 utilizando o construtor de String que aceita  um array de chars e dois inteiros como argumentos. O segundo argumento especifica a posição inicial (o deslocamento) a partir da  qual os caracteres no array são acessados. Lembre-se de que o primeiro caractere está na posição 0. O terceiro argumento especifica o  número de caracteres (a contagem) a acessar no array. O novo objeto String é formado a partir dos caracteres acessados. Se o deslocamento ou a contagem especificada como um argumento resultar no acesso a um elemento fora dos limites do array de caracteres,  uma StringIndexOutOfBoundsException é lançada

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);
    }
}
