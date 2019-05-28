import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int points;
//    private Hand hand;
    private final List<Card> hand;

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

    public void dealCards(Card cards){

    }
}


