import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {
    private static Deck deck;
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
            player.setHand(deck.dealDeck(6));
        }
    }

    public static final Card setTrumpFromDeck(){
        return Deck.setTrump();
    }

    public static Card getTrumpFromDeck(){
        return Deck.getTrump();
    }
}
