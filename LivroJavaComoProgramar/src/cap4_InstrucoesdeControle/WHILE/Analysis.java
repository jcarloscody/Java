
package cap4_InstrucoesdeControle.WHILE;

import java.util.Scanner;


public class Analysis {
    public static void main(String[] args) {
        int aprovados = 0;
        int reprovados = 0;
        int contador =1;
        int aluno = 1;
        Scanner input = new Scanner(System.in);
        
        while (contador<=10){
            System.out.printf("%dª aluno: 1 aprovado, 2 reprovador ¨%n" , aluno);
            int parecer = input.nextInt();
            
            contador ++;
            aluno ++;
            
            if (parecer ==1){
                aprovados ++;
            }else {
                reprovados ++;
            }
        }
        
        if (aprovados>=8){
            System.out.println("PARABÉNS PROFESSOR!!");
        }
        System.out.printf("aprovados %d%n reprovados %d%n" , aprovados , reprovados);
    }
    
}
