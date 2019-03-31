import java.util.ArrayList;

public class Deck extends Card{
    //http://datagenetics.com/blog/november42014/index.html
    //https://stackoverflow.com/questions/24520782/java-shuffle-card-deck
    //https://www.geeksforgeeks.org/shuffle-a-deck-of-cards-3/
    //https://bost.ocks.org/mike/algorithms/#shuffling


    private static ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        for(int i=0; i < 4; i++){
            for (int j=0; j < 14; j++){
                cards.add(i, j);
            }
        }
    }

    }


}
