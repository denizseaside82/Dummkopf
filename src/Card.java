public class Card {
    private List<String> clubs;
    private List<String> diamonds;
    private List<String> hearts;
    private List<String> spades;

    public Card() {
        this.clubs = new ArrayList<>(Arrays.asList("A", "K", "Q", "J", "10", "9", "8", "7", "6"));
        this.diamonds = new ArrayList<>(Arrays.asList("A", "K", "Q", "J", "10", "9", "8", "7", "6"));
        this.hearts = new ArrayList<>(Arrays.asList("A", "K", "Q", "J", "10", "9", "8", "7", "6"));
        this.spades = new ArrayList<>(Arrays.asList("A", "K", "Q", "J", "10", "9", "8", "7", "6"));
    }
}
