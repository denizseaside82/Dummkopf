import java.util.*;

public class Deck{
    private List<Card> deck;
    private static final Random GENERATOR = new Random();
    private static final int DECK_SIZE = 36;

    public Deck () {
        deck = new ArrayList<>(DECK_SIZE);

        for (final Card.Suit suit : Card.Suit.values()) {
            for (final Card.Rank rank : Card.Rank.values()) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public List<Card> getDeck(){
        return deck;
    }

    public List<Card> deal(int size){
        List<Card> hand = new ArrayList<>(size);
        for(int dealCount=0; dealCount < size; dealCount++){
            hand.add(deck.remove(GENERATOR.nextInt(deck.size())));
        }
        return hand;
    }

    public Card trump(){
        return deck.remove(0);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < deck.size(); i++){
            builder.append(i + " ");
            builder.append(deck.get(i));
            builder.append(System.getProperty("line.separator"));
        }
        return builder.toString();
    }
}
