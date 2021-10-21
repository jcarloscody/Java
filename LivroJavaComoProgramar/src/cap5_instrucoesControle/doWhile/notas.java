
package cap5_instrucoesControle.doWhile;

import java.util.Scanner;


public class notas {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int total = 0; // soma das notas ÿ
        int gradeCounter = 0; // número de notas inseridasÿ
        int aCount = 0; // contagem de notas A ÿ
        int bCount = 0; // contagem de notas B ÿ
        int cCount = 0; // contagem de notas C ÿ
        int dCount = 0; // contagem de notas D ÿ
        int fCount = 0; // contagem de notas F


        System.out.printf("%s%n%s%n %s%n %s%n",
                            "Enter the integer grades in the range 0-100.",
                             "Type the end-of-file indicator to terminate input:",
                            "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                             "On Windows type <Ctrl> z then press Enter");
        
        // faz loop até o usuário inserir o indicador de fim do arquivo
        while (input.hasNext()) {             
            
            int grade = input.nextInt(); // lê a nota
            total += grade; // adiciona nota a total
            ++gradeCounter; // incrementa o número de notas

            // incrementa o contador de letras de nota adequado ÿ
                switch (grade / 10) 
                { 
                case 9: // a nota estava entre 90 ÿ
                case 10: // e 100, inclusivo ÿ
                ++aCount; 
                 break; // sai do switch ÿ

                case 8: // nota estava entre 80 e 89 ÿ
                ++bCount; 
                break; // sai do switch
                case 7: // nota estava entre 70 e 79 ÿ
                ++cCount; 
               break; // sai do switch ÿ

               case 6: // nota estava entre 60 e 69 ÿ
               ++dCount; 
                break; // sai do switch ÿ

               default: // a nota era menor que 60 ÿ
               ++fCount; 
               break; // opcional; fecha switch de qualquer maneiraÿ
               } // fim do switch 
            } // fim do while

        // exibe o relatório da nota
        System.out.printf("%nGrade Report:%n");

        // se usuário inseriu pelo menos uma nota...
       if (gradeCounter != 0)
       {
       // calcula a média de todas as notas inseridas
        double average = (double) total / gradeCounter;

       // gera a saída de resumo de resultados
        System.out.printf("Total of the %d grades entered is %d%n",
        gradeCounter, total);
        System.out.printf("Class average is %.2f%n", average);
        System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
        "Number of students who received each grade:",
        "A: ", aCount, // exibe número de notas A
       "B: ", bCount, // exibe número de notas B
       "C: ", cCount, // exibe número de notas C
       "D: ", dCount, // exibe número de notas D
       "F: ", fCount); // exibe número de notas F
       } // fim do if
        else // nenhuma nota foi inserida, assim gera a saída da mensagem apropriada
        System.out.println("No grades were entered");
       } // fim de main
} // finaliza a classe letterGrades