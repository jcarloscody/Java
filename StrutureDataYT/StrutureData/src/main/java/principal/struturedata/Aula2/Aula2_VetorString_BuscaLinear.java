/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.struturedata.Aula2;

import java.util.Scanner;

/**
 * 
 * @author developer https://github.com/leandroguarino/estruturas_de_dados_aula02_busca_linear/blob/master/src/main/java/aula02_vetor_string_codigo/Main.java
 */
public class Aula2_VetorString_BuscaLinear {
    
    public static void main(String[] args) {
        String[] estados = new String[10];
        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";
        
        for(String e : estados){
            System.out.println("Estado " + e);
        }
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sigla de estado vc quer buscar?");
        String siglaBusca = leitor.nextLine();
        
        //busca linear - é uma busca desde a primeira posicao ate a última
        boolean encontrou = false;
        for (String elemento : estados) {
            if (elemento.equalsIgnoreCase(siglaBusca)){
                encontrou = true;
                break;
            }
        }
        if (encontrou == true){
            System.out.println("Encontrou");
        }else{
            System.out.println("Não encontrou");
        }
    }
    
}
