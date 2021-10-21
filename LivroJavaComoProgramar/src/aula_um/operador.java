/*
 +
-
*
/
%

 */
package aula_um;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class operador {
    public static void main(String[] args) {
        Scanner num =  new Scanner(System.in);
        
        System.out.println("Qual o operação vc quer?");
        System.out.println("1- +; \n 2- -; \n 3- *; \n 4- %");
        double resp = num.nextDouble();
        
        if (resp==1){
        System.out.println("digite o primeiro número");
        double n1 = num.nextDouble(); 
        System.out.println("digite o 2 número");
        double n2 = num.nextDouble();
        System.out.println("RESPOSTA " + (n1 + n2));
        } else if (resp==2){
        System.out.println("digite o primeiro número");
        double n1 = num.nextDouble(); 
        System.out.println("digite o 2 número");
        double n2 = num.nextDouble();
        System.out.println("RESPOSTA " + (n1 - n2));        
        } else if (resp==3){
        System.out.println("digite o primeiro número");
        double n1 = num.nextDouble(); 
        System.out.println("digite o 2 número");
        double n2 = num.nextDouble();
        System.out.println("RESPOSTA " + (n1 * n2));        
        } else if (resp==4){
        System.out.println("digite o primeiro número");
        double n1 = num.nextDouble(); 
        System.out.println("digite o 2 número");
        double n2 = num.nextDouble();
        System.out.println("RESPOSTA " + (n1 % n2));        
        }
// ATRIBUIÇÇAO

//  =    atribuiççao de valor
// +=       -=   *=  
        
// OPERADOR DE INCREMENTO E DECREMENTO
// ++=  --= PÓS - adiciona e depois retorna
//=++  =-- PRÉ - retorna primeiro e depois adiciona
        
    }
    
}
