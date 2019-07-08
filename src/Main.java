import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        //Create players between 2-6
        Game newGame = new Game();
        List<Player> players = newGame.createPlayers();

        //Create deck
        if(players != null){
            newGame.createDeck(players);

            for (Player player: players){
                    System.out.println("Player : " + player.getName());
                    player.showHand();
                    System.out.println("\n");
            }

            newGame.showTrump();
        }
        //Play clockwise
        for(Player player: players){
            Iterator tempCard = player.getHand().listIterator();
            tempCard.toString();
            tempCard.
            player.attack();
        }
        //Shuffle deck and deal each player 6 cards

        //Let the bottom card of the stock is turned and placed face up on the table
    }
}