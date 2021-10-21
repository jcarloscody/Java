/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap7_Array.poquersimples;

/**
 *
 * @author josue
 */
public class NewClass {
    public static void main(String[] args) {
        int[] x = {1,2,3};
        int[] y= {4,5,6};
        int w = y[0];   //w=1
        y[0] = x[2];   //1=6
        x[2] = w;       //6=1
        
        System.out.println(y[0] = x[2]);
    }
    
}
