import java.util.*;

public class Deck{
    private static final int NUMBER_OF_CARDS = 52;
    private static Card[] cards = new Card[NUMBER_OF_CARDS];
    private static final Random GENERATOR = new Random();

    static Card[] initDeck() {
        int count = 0;

        for(final Card.Suit suit: Card.Suit.values()){
            for (final Card.Rank rank: Card.Rank.values()) {
                    Card card = new Card(rank, suit);
                    cards[count] = card;
                    count++;
                }
            }
            return cards;
        }

    static Card[] shuffle(Card[] deckOfCards) {
        int j;

        for(int i=0; i<NUMBER_OF_CARDS; i++){
            j = GENERATOR.nextInt(NUMBER_OF_CARDS);
            Card tempCard = cards[i];
            cards[i] = cards[j];
            cards[j] = tempCard;
        }
        return cards;
    }


    //        private static Stack<Card> deckCards = new Stack<>();
//
//        public Deck() {
//            this.deckCards = initDeck();
//        }
//
//        private Stack<Card> initDeck() {
//            final Stack<Card> deckCards = new Stack<>();
//            for (final Card.Suit suit: Card.Suit.values()){
//                for(final Card.Rank rank: Card.Rank.values()){
//                    deckCards.push(Card.random());
//                }
//
//                Collections.shuffle(deckCards);
//                //System.out.println(deckCards);
//
//        }
//            return deckCards;
//    }
//
//    public Optional<Card> deal() {
//        return this.deckCards.empty() ? Optional.empty() :
//                Optional.of(this.deckCards.pop());
//    }
}
