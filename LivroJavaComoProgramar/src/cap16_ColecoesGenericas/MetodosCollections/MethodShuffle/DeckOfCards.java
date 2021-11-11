/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap16_ColecoesGenericas.MetodosCollections.MethodShuffle;

// declaração da classe DeckOfCards

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

    private List<Card> list; // declara List que armazenará Cards

    // configura baralho de Cards e embaralha
    public DeckOfCards() {
        Card[] deck = new Card[52];
        int count = 0; // número de cartas

        // preenche baralho com objetos Card
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Face face : Card.Face.values()) {
                deck[count] = new Card(face, suit);
                ++count;
            }
        }

        list = Arrays.asList(deck); // obtém List ÿ
        Collections.shuffle(list); // embaralha as cartasÿ
    } // fim do construtor DeckOfCards

    // gera saída de baralho
    public void printCards() {
        // exibe 52 cartas em duas colunas
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%-19s%s", list.get(i),
                    ((i + 1) % 4 == 0) ? "\n" : "");
        }
    }
}
