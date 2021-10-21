/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_um;

import java.io.IOException;
import java.util.Scanner; //aqui será usada a classe scanner
//util é um pacote

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class entrada {
  public static void main(String[] args) throws IOException {

    // CLASSE SYSTEM ********
    String nome;
    System.out.println("Digite o seu nome: \n");
    byte[] valor = new byte[100]; // aqui temos um vetor de byte com 100 posições.
    System.in.read(valor);
    nome = new String(valor);

    /**
     * a CLASSE SYSTEM possue 3 atributos: IN - entrada de dados ERR - saída de erro
     * OUT - saída de dados
     * 
     */

    System.out.println("o seu nome é: " + nome);

    // CLASSE SCANNER
    // já tem no outro projeto

    // CAIXA DE DIÁLOGO - JoptionPane
    // é uma classe do pct java.swing

    String nome_Jop;

    nome_Jop = JOptionPane.showInputDialog("Digite o seu nome:");

    JOptionPane.showMessageDialog(null, nome_Jop);

    Scanner sc_input = new Scanner(System.in); // É uma instrução que declara
    // uma variável com nome input e diz o tipo Scanner. esta classe permite ler
    // strings e nº para utiliza-los.
    // esta variável já está sendo inicializada, ou seja, preparada para uso.

    // variáveis
    float n1, n2, n3;
    // são variáveis não inicializadas.
    // int, float, double, char, boolean

    System.out.println("Digite o 1º número");
    // System: é uma classe pertecente ao pacote java.lang
    // normalmente indentificadores com letras maiuscula são nomes de classe
    // java.lang -> por padrão já é um pacote importado, ñ precisa pôr o import

    n1 = sc_input.nextFloat();
    // nextFloat() -> isto é um método. nesta instrução de atribuição estamos
    // chamando este método.
    // se fosse só -> next() -> iria ler apenas os caracteres da primeira palavra e
    // ignorar os espaços

    System.out.println("Digite o 2º número");
    n2 = sc_input.nextFloat();

    n3 = n1 + n2;

    System.out.printf("%s%s%s%s%s%n%s%n", "o valor de: ", n1, "+", n2, "=", n3);

  }

}
