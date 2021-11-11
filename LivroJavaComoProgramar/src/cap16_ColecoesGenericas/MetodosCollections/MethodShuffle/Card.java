/*
usa o método shuffle para 
embaralhar um baralho de objetos Card que podem ser usados em um simulador de jogo de cartas
 */
package cap16_ColecoesGenericas.MetodosCollections.MethodShuffle;

// Embaralhamento e distribuição de cartas com método shuffle de Collections.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

// classe para representar uma Card de um baralho
class Card {

    public static enum Face {
        Ace, Deuce, Three, Four, Five, Six,
        Seven, Eight, Nine, Ten, Jack, Queen, King
    };

    public static enum Suit {
        Clubs, Diamonds, Hearts, Spades
    };

    private final Face face;
    private final Suit suit;
// construtor

    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    // retorna face da carta
    public Face getFace() {
        return face;
    }

    // retorna naipe de Card
    public Suit getSuit() {
        return suit;
    }

    // retorna representação String de Card
    public String toString() {
        return String.format("%s of %s", face, suit);
    }
} // fim da classe Card

