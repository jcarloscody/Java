/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.struturedata.Aula1;

/**
 *
 * @author https://github.com/leandroguarino/estruturas_de_dados_java_aula01/blob/master/src/main/java/aula01_vetor_codigo/Main.java
 */
public class Aula1 {
    
    public static void main(String[] args) {
        /*
        o vetor em java tem tamanho estático. os espaços nao preenchidos são ocupados com 0 quando é number
        */
        int[] vetorzao = new int[10];
        vetorzao[0] = 3;
        vetorzao[1] = 4;        
        vetorzao[3] = 13;
        vetorzao[2] = 8;
        vetorzao[5] = 51;
        vetorzao[4] = 22;
        vetorzao[6] = 33;
        System.out.println("Primindo...");
        
        for(int i = 0; i < vetorzao.length; i++){
            System.out.println(vetorzao[i]);
        }
                
    }
    
}
