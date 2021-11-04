/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author developer
 */
public class prin {
    public static void main(String[] args){
		
        Scanner teclado = new Scanner(System.in);

        int opcao;
        String nome;
        

        Aluno a1 = new Aluno();
        
		

        System.out.print("\tDigite a op��o desejada: \n\t"); 
        opcao = teclado.nextInt();


        System.out.println("Digite o nome e a matricula do aluno 1: ");
        nome = teclado.nextLine();
        a1.setNome(nome);
        teclado.next();


        System.out.println("Digite a matricula do aluno 1: ");
        int matricula = teclado.nextInt();
        a1.setMatricula(matricula);

        teclado.close();
    }
}
