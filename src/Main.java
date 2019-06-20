import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        //Create players between 2-6
        Game newGame = new Game();
        List<Player> players = newGame.createPlayers();

        //Let user decide the number of cards set either 24 or 36 or 52 and create deck
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

        //Shuffle deck and deal each player 6 cards

        //Let the bottom card of the stock is turned and placed face up on the table


    }
}