public class Deck {
    //http://datagenetics.com/blog/november42014/index.html
    //https://stackoverflow.com/questions/24520782/java-shuffle-card-deck
    //https://www.geeksforgeeks.org/shuffle-a-deck-of-cards-3/
    //https://bost.ocks.org/mike/algorithms/#shuffling
    private static final Random GENERATOR = new Random();

    private ArrayList<Card> cards;
    private ArrayList<Player> players;

    public Deck(Card.CardSize numberOfCards, Player.Players numberOfPlayers) {
        this.cards = new ArrayList<>();
        this.players = new ArrayList<>();
        this.Card.CardSize = numberOfCards;
        this.Player.Players = numberOfPlayers;
    }


}
