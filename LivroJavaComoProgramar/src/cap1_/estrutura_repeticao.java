/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap1_;

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class estrutura_repeticao {

    public static void main(String[] args) {
        /*
         * == != > < >= <=
         */

        /*
         * ESTRUTURA DE CONTROLE
         * 
         * IF ELSE SWITCH
         * 
         */

        System.out.println("Array com incrementador");
        int[] d = { 3, 5, 6, 3, 2, 2, 10 };
        int[] dd = new int[11];
        dd[0] = 5;
        ++dd[0];// o incrementador surte efeito diferente num array pag 235
        ++dd[0];
        ++dd[d[1]];
        ++dd[d[2]];
        ++dd[d[3]];
        ++dd[d[4]];
        ++dd[d[5]];
        ++dd[d[6]];

        System.out.println(dd[0]);
        System.out.println(dd[1]);
        System.out.println(dd[2]);
        System.out.println(dd[3]);
        System.out.println(dd[4]);
        System.out.println(dd[5]);
        System.out.println(dd[6]);

        /*
         * int c = 10;
         * 
         * if (c == 1) { System.out.println("igual"); } else if (c < 1) {
         * System.out.println("menor"); } else { System.out.print("outro"); }
         * 
         * int mes = Integer.parseInt(JOptionPane.showInputDialog("digite o mÊs"));
         * 
         * switch (mes) { case 1: JOptionPane.showMessageDialog(null, "janeiro"); break;
         * default: JOptionPane.showMessageDialog(null,
         * "nosso calendario só tem um mÊs"); }
         * 
         * // OPERADOR TERNÁRIO
         * 
         * float nota = Float.parseFloat(JOptionPane.showInputDialog("digite o mÊs"));
         * 
         * String resultado1 = (nota >= 7) ? "aprovado" : "rep"; String resultado =
         * (nota >= 7) ? "aprovado" : (nota == 6) ? "rep" : "dasd";
         * 
         * // a ? significa o SE, antes é a instrução booleana, após fica o valor // :
         * antes temos o valor que será demonstrado se a booleana for TRUE e após o : //
         * temos o valor para a instrução FALSE //
         * 
         * JOptionPane.showMessageDialog(null, resultado);
         * JOptionPane.showMessageDialog(null, resultado1);
         */
    }
}
