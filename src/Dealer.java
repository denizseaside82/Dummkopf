import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {
    private Deck deck;
    private List<Player> players;

    public Dealer(int numberOfPlayers) {
        this.deck = new Deck();
        this.players = new ArrayList<>(numberOfPlayers);
    }

    public void shuffleDeck(){
        Collections.shuffle(deck.getDeck());
    }

    public void dealShuffledCardsToPlayers(List<Player> players){
        for(Player player: players){
            player.setHand(deck.deal(6));
        }
    }

    public Card getTrumpFromDeck(){
        return deck.trump();
    }
}
