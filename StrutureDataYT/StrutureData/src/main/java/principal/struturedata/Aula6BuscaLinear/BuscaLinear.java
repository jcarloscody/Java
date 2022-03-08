package principal.struturedata.Aula6BuscaLinear;

import java.util.Scanner;

public class BuscaLinear {
     public static void main(String[] args) {
        int[] vetor = new int[100000];
                
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 100000000); 
            System.out.println(vetor[i]);
        }
        
        System.out.println("Qual número vc busca?");
        Scanner leitor = new Scanner(System.in);
        int buscado = leitor.nextInt();
        
        boolean achou = false;
        double time1 = System.currentTimeMillis();
        int posicao = 0;
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] == buscado){
                posicao = i;
                achou = true;
                break;
            }
        }
        double time2 = System.currentTimeMillis();
        
        if (achou == true){
            System.out.println("Achou");
            System.out.println( "tempo "+ (time2 - time1) + " posicao " + posicao);

        }else{
            System.out.println("Não achou");
        }
    }
}
