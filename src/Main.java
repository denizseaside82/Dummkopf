import com.sun.jdi.Value;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            //Create players between 2-6
            Game newGame = new Game();
            List<Player> players = newGame.createPlayers();

            //Create deck
            if (players != null) {
                newGame.createDeck(players);
                for (Player player : players) {
                    System.out.println("Player : " + player.getName());
                    player.showHand();
                    System.out.println("\n");
                }
                //Let the bottom card of the stock is turned and placed face up on the table
                newGame.showTrump();

                //Shuffle deck and dealDeck each player 6 cards
                Map<Player, Integer> lowestTrump = new LinkedHashMap<Player, Integer>();
                for (Player player : players) {
                    int cardNumber = player.getSuitInHand();
                    lowestTrump.put(player, cardNumber);
                    if (cardNumber == -1) {
                        System.out.println("Player " + player.getName() + " has no TRUMP");
                    } else {
                        System.out.println("The smallest card from " + player.getName() + " is " + player.getSuitInHand());
//                        System.out.println("Player id " + player.getId());
                    }
                }
                System.out.println("\n");

                Optional<Player> result = lowestTrump.entrySet()
                        .stream()
                        .filter(c -> c.getValue() != -1)
                        .min(Comparator.comparingInt(Map.Entry::getValue))
                        .map(Map.Entry::getKey);

                if (result != null && result.get().getSuitInHand() != -1) {
                    System.out.println("Player : " + result.get().getName() + " is the first attacker");

                }

                List<Player> searchDefender = new ArrayList<Player>(lowestTrump.keySet());
                ListIterator<Player> defender = searchDefender.listIterator();
                while(defender.hasNext()){
                    if(defender.equals(result.get().getName())){
                        Player defenderFound = defender.previous();
                        System.out.println(defenderFound.getName());
                    }
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}