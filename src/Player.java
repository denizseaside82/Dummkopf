import java.util.*;

public class Player {
    private String name;
    private int points;
    private List<Card> hand;
    private static final Random GENERATOR = new Random();

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

    public void attack(){
        Card attackCard = hand.remove(GENERATOR.nextInt(hand.size()));
        System.out.println(attackCard);
    }

}


