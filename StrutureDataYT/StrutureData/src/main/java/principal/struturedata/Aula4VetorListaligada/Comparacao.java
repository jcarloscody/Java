/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.struturedata.Aula4VetorListaligada;

import java.util.ArrayList;

/**
 *
 * @author developer
 */
public class Comparacao {
     public static void main(String[] args) {
        
        ListaLigada<Integer> lista = new ListaLigada<Integer>();
        
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        
        //Adicionar elementos
        int limite = 10000;
                double diferenca;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;
        for(int i=0; i < limite; i++){
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou "+limite+" elementos no vetor");
        diferenca = tempoFinal - tempoInicial;
        System.out.println("Milissegundos do ArrayList: " + diferenca);
        
        tempoInicial = System.currentTimeMillis();
        for(int i=0; i < limite; i++){
            lista.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nAdicionou "+limite+" elementos na lista");
        diferenca = tempoFinal - tempoInicial;
        System.out.println("Milissegundos da Lista Ligada: " + diferenca);
        
        //ler valores
        tempoInicial = System.currentTimeMillis();
        for(int i=0; i < vetor.size(); i++){
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura do vetor");
        System.out.println(tempoFinal - tempoInicial);
        
        tempoInicial = System.currentTimeMillis();
        for(int i=0; i < lista.getTamanho(); i++){
            lista.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura da lista");
        System.out.println(tempoFinal - tempoInicial);
        
        
    }
}
