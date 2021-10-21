
package cap4_InstrucoesdeControle.WHILE;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        /**LOOP CONTROLADO. */
        float total = 0;
        int gradecentral = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Digite a quantidade de rodadas %n");
        int rodadas = input.nextInt();
        
        while (gradecentral <=rodadas){  /**iteração.  é o loop do operador while*/
            System.out.printf("Digite a %dª nota%n", gradecentral);
            float nota = input.nextFloat();
            
            total += nota;
            
            gradecentral++;
        }
        
        float resultado = total / rodadas;
        /**operação aritmétrica truncada.
         * aqui eu não fiz. Mas se nessa média fosse posta int como tipo de dado primitivo
         * , e quando na divisão o valor do resultado fosse real, as casas decimais seriam truncadas,
         * ou seja, perdidas, isto posto int/int =int.
         */
        System.out.printf("-->>  foram %d rodadas %n => totalizando %f%n",rodadas, total);
        System.out.printf(">>>>>>>>  o resultado médio foi %f%n", resultado);
        
        
        
    }
    
}
