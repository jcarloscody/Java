/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap20_generico.intro.stack;

/**
 *
 * @author developer
 */
public class EmptyStackException extends RuntimeException{
// construtor sem argumento
public EmptyStackException()
 {
this("Stack is empty");
 }

 // construtor de um argumento
 public EmptyStackException(String message)
 {
 super(message);
 }
 } // fim da classe EmptyStackException
