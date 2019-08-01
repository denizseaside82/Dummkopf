import java.util.*;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public void showHand() {
        for (Card cards : hand) {
            System.out.println(cards.toString());
        }
    }

    public int getSuitInHand() {
        int lowestCard = 14;
        int i = 0;
        int actualCard;
        List<Integer> countTrump = new ArrayList<>();
        while (i < 6) {
            if (Dealer.getTrumpFromDeck().getSuit() == this.hand.get(i).getSuit()) {
                actualCard = this.hand.get(i).getRank().getValue();
                countTrump.add(actualCard);

                if (actualCard < lowestCard) {
                    System.out.println("Array size" + countTrump.size());
//                    if(countTrump.size() > 1 && countTrump.contains(1)){
//                        System.out.println("Gotcha");
////                        continue;
//                    }
                    lowestCard = actualCard;
                }
                System.out.println("Player : " + this.getName() + " has " + this.hand.get(i));
            }else{
                if(i == 5 && lowestCard == 14) {
                    System.out.println("Player " + this.getName() + " has no TRUMP");
                }
//                }else if(i == 5 && this.hand.size() == 1 && this.hand.get(i).getRank() == Card.Rank.ACE ){
//                    System.out.println("");
//                }
            }
            i++;
        }

        return lowestCard;
    }
}


