import java.util.*;

public class Deck{
    private List<Card> deck;
//    private static final Random GENERATOR = new Random();
    public Deck (int numberOfCards) {
        deck = new ArrayList<>(numberOfCards);

        int count = 0;

        for (final Card.Suit suit : Card.Suit.values()) {
            for (final Card.Rank rank : Card.Rank.values()) {
                deck.add(new Card(rank, suit));
                count++;
            }
        }
    }

    public List<Card> getDeck(){
        return deck;
    }

    public List<Card> deal(int size){
        List<Card> hand = new ArrayList<>(size);
        Random rnd = new Random();
        for(int dealCount=0; dealCount < size; dealCount++){
            hand.add(deck.remove(rnd.nextInt(deck.size())));
        }
        return hand;
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
