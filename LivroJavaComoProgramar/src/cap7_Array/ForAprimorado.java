/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap7_Array;


public class ForAprimorado {
    public static void main(String[] args) {
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;

        // adiciona o valor de cada elemento ao totalÿ
        for (int number : array) {
            total += number;
            System.out.println(number);
        }
        

        System.out.printf("Total of array elements: %d%n", total);

        // fim da classe EnhancedForTest
    }
    
}
