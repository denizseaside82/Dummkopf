import java.util.stream.IntStream;

public class Main {
    public static void main (String[] args) {
//        final Deck deck = new Deck();
//        final int numCardsToDeal = 52;
//        IntStream.range(0, numCardsToDeal).forEach(n -> System.out.println(deck.deal()));

        Card[] deck = Deck.initDeck();

        for(int i = 0; i < deck.length; i++){
            System.out.println(deck[i]);
        }

        Card[] shuffleCard = Deck.shuffle(deck);
        for(int i = 0; i < shuffleCard.length; i++){
            System.out.println(shuffleCard[i]);
        }
    }
}
