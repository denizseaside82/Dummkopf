import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.Optional;

public class Deck{
        private static Stack<Card> deckCards = new Stack<>();

        public Deck() {
            this.deckCards = initDeck();
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

    public Optional<Card> deal() {
        return this.deckCards.empty() ? Optional.empty() :
                Optional.of(this.deckCards.pop());
    }
}
