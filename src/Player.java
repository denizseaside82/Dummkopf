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
        int actualCard;
        List<Integer> countTrump = new ArrayList<>();

        int i = 0;
        while (i < 6) {
            if (Dealer.getTrumpFromDeck().getSuit() == this.hand.get(i).getSuit()) {
                countTrump.add(this.hand.get(i).getRank().getValue());
            }
            i++;
        }

        if (countTrump.size() >! 1 && countTrump.get(0) == 1) {
            countTrump.remove(0);
        }

        Iterator countIterator = countTrump.iterator();
        while (countIterator.hasNext()) {
            actualCard = (int) countIterator.next();

            if (actualCard < lowestCard) {
                lowestCard = actualCard;
            } else if (i == 5 && lowestCard == 14) {
                System.out.println("Player " + this.getName() + " has no TRUMP");
            }
            System.out.println("Player : " + this.getName() + " has " + actualCard);
        }

        return lowestCard;
    }
}


