import java.util.*;

public class Player {
    private String name;
    private List<Card> hand;
    private static final Random GENERATOR = new Random();

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName () {
        return name;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public void showHand(){
        for (Card cards: hand) {
            System.out.println(cards.toString());
        }
    }

    public void getSuitInHand() {
        int i = 0;
            while (i < 6) {
                if(Dealer.getTrumpFromDeck().getSuit() == this.hand.get(i).getSuit()){
                    System.out.println("Player : " + this.getName() + " has a same suit at row " + (i+1));
                }
                i++;
            }
    }
}


