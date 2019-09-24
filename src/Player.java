import java.util.*;

public class Player {
    private int Id;
    private String name;
    private List<Card> hand;
    private static int count = 0;

    private static int idNumber;

    public Player(String name) {
        setId(++idNumber);
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public void setId(int id) {
        this.Id = id;
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

        if (countTrump.size() > 1 && countTrump.contains(1)) {
            countTrump.remove(countTrump.indexOf(1));
        }

        Iterator countIterator = countTrump.iterator();
        while (countIterator.hasNext()) {
            actualCard = (int) countIterator.next();

            if (actualCard < lowestCard) {
                lowestCard = actualCard;
            }
//            if (lowestCard == 14) {
//                System.out.println("Player " + this.getName() + " has no TRUMP");
//            }
        }
        if (lowestCard == 14) {
            return -1;
        } else {
            return lowestCard;
        }
    }
}


