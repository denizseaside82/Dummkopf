import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Dealer dealer;
    private List<Player> players = new ArrayList<>();

    public void createPlayers(){
        Scanner scanner = new Scanner(System.in);

        //Ask for a number of Players
        System.out.println("Number of Players");
        int numberOfPlayers = scanner.nextInt();

        //Based on number of players, set players name
        int count=0;
        while(count < numberOfPlayers){
            System.out.println("Please enter the names");
            String playerName = scanner.next();
            players.add(new Player(playerName));
            count++;
        }
    }

    public void createDeck(int numberOfPlayers,List<Player> players){
        System.out.println("Number of Cards (24/36/52)");
        int numberOfCards = scanner.nextInt();

        Dealer newDeck = new Dealer(numberOfCards, numberOfPlayers);
        newDeck.shuffleDeck();
        newDeck.dealShuffledCardsToPlayers(players);
    }


}
