import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Dealer dealer;
    private int numberOfPlayers;
    private Player player = new Player();

    public List<Player> createPlayers(){
        List<Player> players = new ArrayList<>();

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
            return players;
        }else{
            System.out.println("More than 6 players are not allowed");
            return null;
        }
    }

    public void createDeck(List<Player> players){
        dealer = new Dealer(numberOfPlayers);
        dealer.shuffleDeck();
        dealer.dealShuffledCardsToPlayers(players);
    }

    public void showTrump(){
        Card trump = dealer.getTrump();
        System.out.println("After shuffling the cards to players: The trump is " + trump);
    }

//    public void attack(List<Player> players){
//        System.out.println(player.attack());
//    }
}
