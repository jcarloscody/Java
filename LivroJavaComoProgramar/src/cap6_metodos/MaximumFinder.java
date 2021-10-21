
package cap6_metodos;
import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        double number1, number2, number3;
        Scanner input = new Scanner(System.in);
        
        
        System.out.print( "digite 3 números: \n");
         number1 = input.nextDouble(); // lê o primeiro double
         number2 = input.nextDouble(); // lê o segundo double
         number3 = input.nextDouble(); // lê o terceiro double
         
        double resultado = maximum(number1, number2, number3); //chamando o métodp
         
        System.out.print( "O valor máximo dos números digitado são: \n " + resultado);
        
        // OUU...
        
        System.out.println("\n O valor máximo é: \n" + Math.max(Math.max(number1, number2), number3));

    }
    
    
    //public -> isto é, público, outras classes podem acessar.
    //static -> 
    public static double maximum(double x, double y, double z) { 
        double maximumValue = x; // supõe que x é o maior valor inicial

        // determina se y é maior que maximumValue 
        if (y > maximumValue) 
         maximumValue = y; 

        // determina se z é maior que maximumValue 
        if (z > maximumValue) 
        maximumValue = z;
        
        

        return maximumValue; 
    } 

} // fim da classe MaximumFinder
    

