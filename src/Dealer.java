import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private Deck deck;
    private List<Player> players ;

    public Dealer(int numberOfCards) {
        this.deck = new Deck(numberOfCards);
        this.players = new ArrayList<Player>();
    }
}
