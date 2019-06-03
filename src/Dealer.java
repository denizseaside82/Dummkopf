import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
        Collections.shuffle(deck.getCards());
    }

    public void dealShuffledCardsToPlayers(List<Player> players){
        ArrayList<Card> tempCard = deck.getCards();
        for(int i=0; i < players.size(); i++){
            for(int j=0; j < 6; j++){
                players.add(tempCard.get(i+j*6));
            }
        }
    }
}
