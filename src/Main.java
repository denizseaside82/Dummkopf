import java.util.stream.IntStream;

public class Main {
    public static void main (String[] args) {
        final Deck deck = new Deck();
        final int numCardsToDeal = 52;
        IntStream.range(0, numCardsToDeal).forEach(n -> System.out.println(deck.deal()));
    }
}
