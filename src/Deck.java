import java.util.*;

public class Deck{
    private final int NUMBER_OF_CARDS;
    private static Card[] cards;
    private static final Random GENERATOR = new Random();

    public Deck (int NUMBER_OF_CARDS) {
        this.NUMBER_OF_CARDS = NUMBER_OF_CARDS;
        cards = new Card[NUMBER_OF_CARDS];
    }

    public Card[] initDeck() {
        int count = 0;

        while(count != NUMBER_OF_CARDS) {
            for (final Card.Suit suit : Card.Suit.values()) {
                for (final Card.Rank rank : Card.Rank.values()) {
                    Card card = new Card(rank, suit);
                    cards[count] = card;
                    count++;
                }
            }
        }
        return cards;
    }

    public Card[] shuffle() {
        int j;

        for(int i=0; i<NUMBER_OF_CARDS; i++){
            j = GENERATOR.nextInt(NUMBER_OF_CARDS);
            Card tempCard = cards[i];
            cards[i] = cards[j];
            cards[j] = tempCard;
        }
        return cards;
    }

    Card[] shuffleDeckToPlayers(int numberOfPlayers, int cardsToBeDealed){
        Card[] tempCard = new Card[NUMBER_OF_CARDS];
        for(int i=0; i < numberOfPlayers; i++){
            for(int j=0; j< cardsToBeDealed; j++){
                cards[i+j*6] = tempCard[i+j*6];
            }
        }
        return cards;
    }
}
