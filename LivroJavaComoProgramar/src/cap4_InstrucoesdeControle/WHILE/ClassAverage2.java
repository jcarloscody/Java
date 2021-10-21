
package cap4_InstrucoesdeControle.WHILE;

import java.util.Scanner;

/** LOOP POR SENTINELA.
 */
public class ClassAverage2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double total =0;
        int quant_notas  = 0;
        
        System.out.println("Digite a nota ou tecle -1 para sair");
        double nota = input.nextDouble();
        
        while (nota!=-1) {
            total += nota;
            quant_notas++;
            
            System.out.println("Digite a nota ou tecle -1 para sair");
            nota = input.nextDouble();
        }
        
        if (nota != 0){
            double resultado = total / quant_notas;
            
            System.out.println("a média foi: "+ resultado);
            System.out.println(" a quantidade de notas foi: "+ quant_notas);
        } else {
            System.out.println("nota zero");
        }
                
        
    }
    
}
