import java.util.*;

public class Deck{
    private List<Card> cards;
//    private static final Random GENERATOR = new Random();
    public Deck (int numberOfCards) {
        cards = new ArrayList<>(numberOfCards);

        int count = 0;

        for (final Card.Suit suit : Card.Suit.values()) {
            for (final Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(rank, suit));
                count++;
            }
        }
    }

    public List<Card> getCards(){
        return cards;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(int i=0; i < cards.size(); i++){
            builder.append(i + " ");
            builder.append(cards.get(i));
            builder.append(System.getProperty("line.separator"));
        }
        return builder.toString();
    }

//    public Card[] shuffle() {
//        int j;
//
//        for(int i=0; i<NUMBER_OF_CARDS; i++){
//            j = GENERATOR.nextInt(NUMBER_OF_CARDS);
//            Card tempCard = cards[i];
//            cards[i] = cards[j];
//            cards[j] = tempCard;
//        }
//        return cards;
//    }

//    public Card[] shuffleDeckToPlayers(int numberOfPlayers){
//        Card[] tempCard = cards;
//        for(int i=0; i < numberOfPlayers; i++){
//            for(int j=0; j < 6; j++){
//                cards[i+j*6] = tempCard[i+j*6];
//            }
//        }
//        return cards;
//    }
}
