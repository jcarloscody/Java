/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3_classes;

import java.util.Scanner;
import cap3_classes.Account; //apenas para fins didáticos. Pois não é necessário importar uma classe que está no mesmo pacote.
/**
 *
 * @author josue
 */
public class AccountTest {
    public static void main(String[] args) {
        // main é um método especial que será sempre chamado automaticamente pela Java Virtual Machine (JVM) quando você executar um aplicativo
        Scanner leia = new Scanner(System.in);
        
        Account objetoClasseAccount = new Account(); //um objeto da classe Account onde está os métodos e atributos. esta classe irá manipular este objeto com os parâmetros abbaixo.
        //new -> indica a criação de um novo objeto 
        /**() -> os parênteses com o nome da classe esses parênteses em combinação com 
        um nome de classe representam uma chamada para um construtor, que é semelhante
        a um método, mas é chamado implicitamente pelo operador new para inicializar as 
        variáveis de instância de um objeto quando este é criado.
        * ele está vázio, pois está usando o constructor padrão, desta forma este está inicializando
        * as variáveis de instância com o valor null.
       */
        
        System.out.println(objetoClasseAccount.getName()); // executando o método da classe do objeto
        
        System.out.println("");
        
        System.out.println("Digite uma saudação: ");
        String saudacao = leia.nextLine();
        
        System.out.println("Digite um nome: ");
        String nome = leia.nextLine();
        
        objetoClasseAccount.setName(nome, saudacao); //jogando os valores no método do obejto
        
        System.out.println(objetoClasseAccount.getName()); //pegando os valores do método do objeto
        
        
    }
    
}
