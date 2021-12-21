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
@FunctionalInterface /*Podemos marcar uma interface como funcional explicitamente, para que o fato de
ela ser uma interface funcional não seja pela simples coincidência de ter um único
método.*/
public interface Validador <T> {
    boolean valida(T t);
}
