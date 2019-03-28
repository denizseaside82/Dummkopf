import java.util.ArrayList;
import java.util.Random;

public class Deck extends Card{
    //http://datagenetics.com/blog/november42014/index.html
    //https://stackoverflow.com/questions/24520782/java-shuffle-card-deck
    //https://www.geeksforgeeks.org/shuffle-a-deck-of-cards-3/
    //https://bost.ocks.org/mike/algorithms/#shuffling
    private static final Random GENERATOR = new Random();

    private static ArrayList<Card> cards;
    //private ArrayList<Player> players;

    public Deck(int numberOfCards, int numberOfPlayers) {
        this.cards = new ArrayList<>();
        //this.players = new ArrayList<>();
        for(int i=0; i < getSUITS().length; i++){
            for (int j=0; j < getRANKS().length; j++){
                cards.add(new Card())
            }
        }
    }

    public static void shuffle(cards, int numberOfCards){
        for (int i = 0; i < numberOfCards; i++){
            int r = i + GENERATOR.nextInt(numberOfCards - i );

            int temp = cards[r];
            cards[r] = cards[i];
            cards[i] = temp;
        }

    }


}
