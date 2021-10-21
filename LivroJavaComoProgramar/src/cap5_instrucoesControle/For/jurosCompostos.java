
package cap5_instrucoesControle.For;

import java.util.Scanner;


public class jurosCompostos {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double total;
        double deposito=0;
        double juros = 0.05;
        int anos ;
        
        System.out.printf("Digite o valor do depósito: ");
        deposito = input.nextDouble();
        
        System.out.printf("Digite os anos: ");
        anos = input.nextInt();
        
        System.out.printf("%s%20s %n", "anos", "deposito");  //%30s   -> coloca 30 caracter de distancia
        
        for (int y=1; y<=anos; ++y){
            total = deposito * Math.pow(1 +  juros, anos);
            System.out.printf("%d %16s %.2f%n", y,"R$", total);
        }
        
        
    }
    
}
