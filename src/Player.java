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

    public int getSuitInHand() {
        int lowestCard = 13;
        int foundCard = 0;
        int i = 0;
        while (i < 6) {
            if(Dealer.getTrumpFromDeck().getSuit() == this.hand.get(i).getSuit()){
//                    System.out.println("Player : " + this.getName() + " has a same suit at row " + (i+1));
                int actualCard = this.hand.get(i).getRank().getValue();

//                switch (actualCard){
//                    case 1:
//                        lowestCard = 1;
//                    case 6:
//                        lowestCard = 6;
//                    case 7:
//                        lowestCard = 7;
//                    case 8:
//                        lowestCard = 8;
//                    case 9:
//                        lowestCard = 9;
//                    case 10:
//                        lowestCard = 10;
//                    case 11:
//                        lowestCard = 11;
//                    case 12:
//                        lowestCard = 12;
//                    case 13:
//                        lowestCard = 13;
//                }

//                    foundCard = actualCard <= lowestCard ? actualCard : lowestCard;
                if (actualCard < lowestCard ){
                    lowestCard = actualCard;
                }

                    System.out.println("Player : " + this.getName() + " has " + this.hand.get(i));
            }
            i++;
        }

        return lowestCard;
    }
}


