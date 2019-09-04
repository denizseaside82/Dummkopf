import java.util.*;

public class Deck {
    private static List<Card> cards;
    private static final Random GENERATOR = new Random();
    private static final int DECK_SIZE = 36;
    private static Card trump;

    public Deck() {
        cards = new ArrayList<>(DECK_SIZE);

        for (final Card.Suit suit : Card.Suit.values()) {
            for (final Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public List<Card> getDeck() {
        return cards;
    }

    public List<Card> dealDeck(int size) {
        List<Card> hand = new ArrayList<>(size);
        for (int dealCount = 0; dealCount < size; dealCount++) {
            hand.add(cards.remove(GENERATOR.nextInt(cards.size())));
        }
        return hand;
    }

    public static final Card setTrump() {
        trump = cards.remove(0);
        return trump;
    }

    public static Card getTrump() {
        return trump;
    }

}
