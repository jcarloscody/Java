
package cap3_classes.Class_Constructor;

import java.util.Scanner;
import cap3_classes.Class_Constructor.Account;

public class AccountTest {
     public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        Account objetoClasseAccount = new Account(null,"vai ser digitado"); 
        /**classe com constructor. como a classe possui um constructor, os objetos já são inicializados
         com os argumentos. lá temos duas variáveis de instância sendo manipulados pelo constructor, desta
         forma aqui teremos que jogar dois args.*/
        System.out.println(objetoClasseAccount.getName()); 
        
        System.out.println("");
        
        System.out.println("Digite uma saudação: ");
        String saudacao = leia.nextLine();
        
        System.out.println("Digite um nome: ");
        String nome = leia.nextLine();
        
        objetoClasseAccount.setName(nome, saudacao); 
        
        System.out.println(objetoClasseAccount.getName()); 
        
        
    }
}
