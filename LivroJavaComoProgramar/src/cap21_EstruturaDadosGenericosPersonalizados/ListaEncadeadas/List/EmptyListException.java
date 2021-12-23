/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap21_EstruturaDadosGenericosPersonalizados.ListaEncadeadas.List;

/**
 *
 * @author developer
 */
public class EmptyListException extends RuntimeException {
    // construtor

    public EmptyListException() {
        this("List"); // chama outro construtor de EmptyListException
    }

    // construtor
    public EmptyListException(String name) {
        super(name + " is empty"); // chama construtor de superclasse
    }
} // fim da classe EmptyListException
