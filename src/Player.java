import java.util.*;

public class Player {
    private String name;
    private int points;
    private List<Card> hand;

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
        System.out.println(hand);
    }

    //    public void setHand(List<Card> dealtHand){
//        hand = dealtHand;
//    }

//    @Override
//    public String toString() {
//        return "Player{" +
//                "hand=" + hand +
//                '}';
////        String tempCard = "";
////        for(Card hand: hand){
////            tempCard = hand.toString();
////        }
////
////        return tempCard;
//    }
}


