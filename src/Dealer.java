import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {
    private Deck deck;
    private List<Player> players;
    private final int NUMBER_OF_CARDS;

    public Dealer(int numberOfCards, int numberOfPlayers) {
        this.deck = new Deck(numberOfCards);
        this.players = new ArrayList<>(numberOfPlayers);
        this.NUMBER_OF_CARDS = numberOfCards;
    }

    public void shuffleDeck(){
        Collections.shuffle(deck.getDeck());
    }

    public void dealShuffledCardsToPlayers(List<Player> players){
        for(Player player: players){
                player.setHand(deck.deal(6));
        }
    }

    public Card getTrump(){
        return deck.getDeck().get(0);
    }
}
