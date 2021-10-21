package cap7_Array.poquersimples;

public class Card {
    // Figura 7.9: Card.java
    // Classe Card representa uma carta de baralho.

    private final String face; // face da carta ("Ace", "Deuce", ...)
    private final String suit; // naipe da carta ("Hearts", "Diamonds", ...)

    // construtor de dois argumentos inicializa face e naipe da carta
    public Card(String cardFace, String cardSuit){
        this.face = cardFace; // inicializa face da carta
        this.suit = cardSuit; // inicializa naipe da carta
    }
    // retorna representação String de Cardÿ
    public String toString() { 
        return face + " of " + suit; 
    } 
} // fim da classe Card
