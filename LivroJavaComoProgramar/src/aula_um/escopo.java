/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_um;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class escopo {
    
    public static void main(String[] args) {
        //String x = "josue";

        /*if (x == "josue"){
            int w = 1;
            
            System.out.println("Aqui será imprido \n dentro do escopo w: " + w);
            System.out.println("Aqui será imprido \n dentro do escopo x: " + x);
        }*/
        
        System.out.println("Aqui ñ será imprido \n fora do escopo w: " );
        
        //System.out.println("Aqui será imprido \n dentro do escopo x: " + x);
        
        Scanner leitor = new Scanner(System.in);
        
        int cont = 0;
        int positivo = 0;

//continue a solucao de acordo com o solicitado no enunciado

        while (cont < 6 ) {
          double x = leitor.nextDouble();
          
        	if ( x > 0 ) {
        		positivo ++ ;
        	}
    		cont ++ ;
        }
        
        System.out.println(  positivo + " valores positivos"   );
    }
    }
    

