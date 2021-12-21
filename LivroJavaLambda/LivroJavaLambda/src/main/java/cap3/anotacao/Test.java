/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3.anotacao;

import cap3.proprioLambda.*;

/**
 *
 * @author developer
 */
public class Test {
    public static void main(String[] args) {
        Validador<Integer> val = e -> {return true;};
        
        Validador<String> validadorCEP = new Validador<String>() {
            public boolean valida(String valor) {
                return valor.matches("[0-9]{5}-[0-9]{3}");
            }
        };
        
        Validador<String> validadorCEPe = valor -> {
            return valor.matches("[0-9]{5}-[0-9]{3}");
        };
        
        Validador<String> validadorCEPee = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
        
        

    }
}
