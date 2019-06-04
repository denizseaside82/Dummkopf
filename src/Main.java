import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Game newGame = new Game();
        List<Player> players = newGame.createPlayers();
        newGame.createDeck(players);


    }
}