/*
O método shuffle ordena aleatoriamente os elementos de uma List. O Capítulo 7 apresentou uma simulação de embaralhamento e distribuição de cartas que embaralhava as cartas de um baralho com um loop. A Figura 16.10 usa o método shuffle para 
embaralhar um baralho de objetos Card que podem ser usados em um simulador de jogo de cartas.
 */
package cap16_ColecoesGenericas.MetodosCollections.MethodShuffle;

/**
 *
 * @author developer
 */
public class exec {

    public static void main(String[] args) {
        DeckOfCards cards = new DeckOfCards();
        cards.printCards();
    }
}

