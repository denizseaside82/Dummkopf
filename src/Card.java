import java.util.Random;

public class Card {
    private final Rank rank;
    private final Suit suit;

    private static final Random GENERATOR = new Random();

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public static Card random (){
        Rank rank = Rank.values()[GENERATOR.nextInt(Rank.values().length)];
        Suit suit = Suit.values()[GENERATOR.nextInt(Suit.values().length)];
        return new Card(rank, suit);
    }

    public enum Color{
        RED, BLACK
    }

    public enum Suit{
        HEARTS(Color.RED, "Hearts"), DIAMONDS(Color.RED, "diamonds"), SPADES(Color.BLACK, "spades"), CLUBS(Color.BLACK, "clubs");

        private Color color;
        private String displayName;

        Suit(Color color, String displayName) {
            this.color = color;
            this.displayName = displayName;
        }

        public Color getColor() {
            return color;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

    public enum Rank{
        ACE(1, "Ace"), TWO(2, "2"), THREE(3, "4"), FOUR(4, "4"), FIVE(5, "5"), SIX(6, "6"), SEVEN(7, "7"),
        EIGHT(8, "8"), NINE(9, "9"), TEN(10, "10"), JACK(11, "Jack"), QUEEN(12, "Queen"), KING(13, "King");

        private final int value;
        private final String displayName;

        Rank(int value, String displayName) {
            this.value = value;
            this.displayName = displayName;
        }

        public int getValue() {
            return value;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
}
