import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        //Create players between 2-6
        Game newGame = new Game();
        List<Player> players = newGame.createPlayers();

        //Let user decide the number of cards set either 24 or 36 or 52 and create deck
        newGame.createDeck(players);

        //Play clockwise

        //Shuffle deck and deal each player 6 cards
        newGame.

        //Let the bottom card of the stock is turned and placed face up on the table


    }
}