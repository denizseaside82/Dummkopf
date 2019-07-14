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
//        for(int i=0; i<this.hand.size(); i++){
//            System.out.println(this.hand.get(i));
//        }

        for (Card cards: hand) {
            System.out.println(cards.toString());
        }
    }

    public void getSuitInHand() {
        int i = 0;
            while (i < 6) {
                if(Dealer.getTrumpFromDeck().getSuit() == this.hand.get(i).getSuit()){
                    System.out.println("Bingo");
                }
                i++;
            }
    }
}


