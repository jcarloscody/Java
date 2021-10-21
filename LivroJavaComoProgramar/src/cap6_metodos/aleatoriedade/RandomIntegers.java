
package cap6_metodos.aleatoriedade;

import java.security.SecureRandom;


public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom aleatorio = new SecureRandom(); //obbjeto de criação dos números aleat´riuis
        
        for (int i=0; i<=20; i++){
            int face = 1 + aleatorio.nextInt(6); //seleciona o inteiro de 1-6,como o nextint() pega do 0-5, pois seis elementos, então adicionamos o 1
            //temos aqui um inteiro selecionado 1<=face<=6
            //o 1 serve como valodeDeslocamento,pois caso contrário o 0 seria incluido ficando de 0-5
            // essa é uma equação que pode ser manipulada ex.: 2 + 3*aleatorio.nextInt(4) -> produz uma sequencia aleatoria com estes nº: 2, 5 , 8 , 11, 14
            
            System.out.printf("%d", face);
            
            if (i%5==0){
                System.out.println();
            }
        }
    }
    
}
