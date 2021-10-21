/*
 * vamos simular
6.000.000 lançamentos de um dado com o aplicativo da Figura 6.7. Todo número inteiro de 1 a 6 deve aparecer cerca de 1.000.000
vezes
 */
package cap6_metodos.aleatoriedade;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom aleatoriedade = new SecureRandom();
        
        int face1 = 0;
        int face2 = 0;
        int face3 = 0;
        int face4 = 0;
        int face5 = 0;
        int face6 = 0;
        
        for (int rolls = 1; rolls<=6000000; rolls++){
           int face = 1 + aleatoriedade.nextInt(6);
           
           switch(face){
               case 1:
                   ++face1;
                   break;
               case 2:
                   ++face2;
                   break;
               case 3:
                   ++face3;
                   break;
               case 4:
                   ++face4;
                   break;
               case 5:
                   ++face5;
                   break;
               case 6:
                   ++face6;
                   break;

           }
        }
        
        System.out.printf("A quantidade de faces foram: \n face 1: %d, \n face 2: %d,"
                + "\n face 3: %d, \n face 4: %d, \n face 5: %d, \n face 6: %d,",
                face1,face2,face3,face4,face5,face6);
    }
    
}
