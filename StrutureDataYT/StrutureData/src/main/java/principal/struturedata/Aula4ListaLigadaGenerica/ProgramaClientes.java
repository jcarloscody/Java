/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.struturedata.Aula4ListaLigadaGenerica;

/**
 *
 * @author developer
 */
public class ProgramaClientes {
    public static void main(String[] args) {
        ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();
        clientes.adicionar(new Cliente("123","Jao"));
        clientes.adicionar(new Cliente("124","Juca"));
        clientes.adicionar(new Cliente("125","Ze"));
        
        System.out.println("Tamanho: " + clientes.getTamanho());
        for(int i=0; i < clientes.getTamanho(); i++){
            System.out.println(clientes.get(i).getValor());
        }        
    }
}
