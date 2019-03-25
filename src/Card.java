public class Card {
    private String suit, rank;
    private static final Random GENERATOR = new Random();

    private static final String[] SUITS = {"clubs", "diamonds", "hearts", "spades"};
    private static final String[] RANKS = {"Ace", "Jack", "Queen", "King", "10", "9", "8", "7", "6"};

    //Randomly set SUITS and Ranks card
    public Card() {
        suit = SUITS[GENERATOR.nextInt(SUITS.length)];
        rank = RANKS[GENERATOR.nextInt(RANKS.length)];
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }
}
