import java.util.*;

public class Player {
    private String name;
    private int points;
    private List<Card> hand;
    private Dealer dealer;
    private static final Random GENERATOR = new Random();

    public Player() {
    }

    public Player(String name) {
        this.name = name;
        this.points = 0;
        this.hand = new ArrayList<>();
    }

    public String getName () {
        return name;
    }

    public int getPoints () {
        return points;
    }

    public List<Card> getHand(){
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }


    public void showHand(){
        for(int i=0; i<this.hand.size(); i++){
            System.out.println(this.hand.get(i));
        }
    }

    public void getSuitInHand() {
        int i = 0;
            List<Card> tempCard = hand;
            while (i < 6) {
                if(dealer.getTrumpFromDeck().getSuit() == tempCard.get(i).getSuit()){
                    System.out.println("Bingo");
                }
                i++;
            }

    }
}


