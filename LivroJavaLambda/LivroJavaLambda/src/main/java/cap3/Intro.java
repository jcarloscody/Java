/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3;

/**
 *
 * @author developer
 */
public class Intro {
    public static void main(String[] args) {
        Runnable r = new Runnable(){
            public void run(){
                for (int i = 0; i <= 1000; i++) {
                    System.out.println(i);
                }
            }
        };
        new Thread(r).start();
        
        /*A interface Runnable tem apenas um único método abstrato. Uma interface
que se enquadre nesse requisito é agora conhecida como uma interface funcional!
Ela sempre pode ser instanciada através de uma expressão lambda:*/
        Runnable rr = () -> {
            for (int i = 0; i <= 1000; i++) {
                System.out.println(i);
            }
        };
        new Thread(rr).start();
        
        
        new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                System.out.println(i);
            }
        }).start();
    }
}
