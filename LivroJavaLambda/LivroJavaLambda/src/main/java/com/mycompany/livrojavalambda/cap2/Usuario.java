/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.livrojavalambda.cap2;

/**
 *
 * @author developer
 */
public class Usuario {
    private String nome;
private int pontos;
private boolean moderador;
public Usuario(String nome, int pontos) {
this.pontos = pontos;
this.nome = nome;
this.moderador = false;
}
public String getNome() {
return nome;
}
public int getPontos() {
return pontos;
}
public void tornaModerador() {
this.moderador = true;
}
public boolean isModerador() {
return moderador;
}
}
