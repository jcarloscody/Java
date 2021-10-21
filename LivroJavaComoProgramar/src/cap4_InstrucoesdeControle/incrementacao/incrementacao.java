/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap4_InstrucoesdeControle.incrementacao;

/**
 *
 * @author josue
 */
public class incrementacao {
    public static void main(String[] args) {
        /**pré-incremento. */
        int a=0;
        
        System.out.printf("pré-incremento: %d%n", ++a);
        
        /**pré-decremento. */
        int b=0;
        
        System.out.printf("pré-decremento: %d%n", --b);
        
        /**pós-incremento. */
        int c=0;
        
        System.out.printf("pós-incremento: %d%n", c++);
        
        /**pós-decremento. */
        int d=0;
        
        System.out.printf("pós-decremento: %d%n", d--);
    }
    
}
