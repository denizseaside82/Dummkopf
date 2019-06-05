import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Dealer dealer;
    private List<Player> players = new ArrayList<>();
    private int numberOfPlayers;

    public List<Player> createPlayers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of players(up to 6)");
        numberOfPlayers = scanner.nextInt();
        if(numberOfPlayers <= 6) {
            int count = 0;
            while (count < numberOfPlayers) {
                System.out.println("Please enter the names");
                String playerName = scanner.next();
                players.add(new Player(playerName));
                count++;
            }
        }else{
            System.out.println("More than " + numberOfPlayers + " is not allowed");
        }

        return players;
    }

    public void createDeck(List<Player> players){
        System.out.println("Number of Cards (24/36/52)");
        int numberOfCards = scanner.nextInt();

        Dealer newDeck = new Dealer(numberOfCards, numberOfPlayers);
        newDeck.shuffleDeck();
        newDeck.dealShuffledCardsToPlayers(players);
    }
}
