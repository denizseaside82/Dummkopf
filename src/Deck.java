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
        hand.add(deck.remove(size));
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

//    public Card[] shuffle() {
//        int j;
//
//        for(int i=0; i<NUMBER_OF_CARDS; i++){
//            j = GENERATOR.nextInt(NUMBER_OF_CARDS);
//            Card tempCard = deck[i];
//            deck[i] = deck[j];
//            deck[j] = tempCard;
//        }
//        return deck;
//    }

//    public Card[] shuffleDeckToPlayers(int numberOfPlayers){
//        Card[] tempCard = deck;
//        for(int i=0; i < numberOfPlayers; i++){
//            for(int j=0; j < 6; j++){
//                deck[i+j*6] = tempCard[i+j*6];
//            }
//        }
//        return deck;
//    }
}
