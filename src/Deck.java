import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Deck{
    //http://datagenetics.com/blog/november42014/index.html
    //https://stackoverflow.com/questions/24520782/java-shuffle-card-deck
    //https://www.geeksforgeeks.org/shuffle-a-deck-of-cards-3/
    //https://bost.ocks.org/mike/algorithms/#shuffling


        private static Stack<Card> cards = new Stack<>();

        private Deck() {
            this.cards = initDeck();
        }

        private Stack<Card> initDeck() {
            final Stack<Card> deckCards = new Stack<>();
            for (final Card.Suit suit: Card.Suit.values()){
                for(final Card.Rank rank: Card.Rank.values()){
                    deckCards.push(Card.random());
                }

                Collections.shuffle(deckCards);

        }
            return deckCards;
    }
}
