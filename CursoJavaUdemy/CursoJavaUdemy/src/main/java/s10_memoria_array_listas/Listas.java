package s10_memoria_array_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        /**
         * LISTAS Lista é uma estrutura de dados homegenea, ordenada, inicia vazia e
         * seus elementos sao alocados sob demanda e cada elemento ocupa um nó ou nodo
         * da lista.
         * 
         * Tipo: (interface) List. interface define apenas as especificaçoes das
         * operacoes. porém a interface nao pode ser intansida, precisa de uma classe
         * para implementar.
         * 
         * Classes que implementam: ArrayList, LinkedList
         * 
         * Vantagens: - Tamanho variável - Facilidade para se realizar inserçoes e
         * delecoes
         * 
         * Desvantagens: Acesso sequencial aos elementos
         */

        // DECLARACAO = instanciação de uma classe que implementa a interface list
        List<String> lista = new ArrayList<>(); // não aceita tipo primitivo, só wrapper classe. ATENÇÃO!!
        // <> isso é generico, ou seja, parametriza a definicao de um tipo informando um
        // outro tipo

        // ADICIONAR ELEMENTOS
        System.out.println("ADCIONANDO ");
        lista.add("josue");
        lista.add("jose");
        lista.add("mario");
        lista.add("fabricio");

        for (String nomes : lista) {
            System.out.printf("nome: %s%n", nomes);
        }

        System.out.println();
        System.out.println("ADCIONANDO ELEMENTO EM POSICAO ESPECIFICA");
        // ADCIONANDO ELEMENTO EM POSICAO ESPECIFICA
        lista.add(2, "Manoel");
        for (String nomes : lista) {
            System.out.printf("nome: %s%n", nomes);
        }

        System.out.println();
        System.out.println("TAMANHO DA LISTA");
        // TAMANHO DA LISTA
        System.out.println("tamanho da lista: " + lista.size());

        System.out.println();
        System.out.println("REMOVER ELEMENTO");
        // REMOVER ELEMENTO
        lista.remove("fabricio");
        for (String nomes : lista) {
            System.out.printf("nome: %s%n", nomes);
        }
        System.out.println();
        System.out.println("REMOVER ELEMENTO COM INDICE");
        lista.remove(3);
        for (String nomes : lista) {
            System.out.printf("nome: %s%n", nomes);
        }
        System.out.println();
        System.out.println("REMOVER ELEMENTO COM PREDICADO");
        lista.removeIf(x -> x.charAt(0) == 'M');
        for (String nomes : lista) {
            System.out.printf("nome: %s%n", nomes);
        }

        // RETORNA A POSIÇÃO
        System.out.println();
        System.out.println("RETORNA A POSIÇÃO");
        System.out.printf("jose: %s%n", lista.indexOf("jose"));

        lista.add("zuza");
        lista.add("amanda");
        lista.add("mauricio");

        // FILTRAR PARA APARECER APENAS NOMES ESPECIFICOS
        System.out.println();
        System.out.println("FILTRAR PARA APARECER APENAS NOMES ESPECIFICOS");
        List<String> filtroDeJ = lista.stream().filter(x -> x.charAt(0) == 'j').collect(Collectors.toList());
        // stream: tipo especial do java 8 que aceita operacoes com expressoes lambda
        // primeiro converte para stream, faz a operacao com o filter usando o lambda e
        // depois converte para lista novamente
        for (String nomes : filtroDeJ) {
            System.out.printf("nome com j: %s%n", nomes);
        }

        // FILTRAR O PRIMEIRO ELEMENTO COM FILTRO ESPECIFICO
        System.out.println();
        System.out.println("FILTRAR O PRIMEIRO ELEMENTO COM FILTRO ESPECIFICO");
        String primeiroNomeComJ = lista.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
        System.out.printf("primeiro nome com j: %s%n", primeiroNomeComJ);
    }
}
