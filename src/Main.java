import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
                newGame.showTrump();

                //Play clockwise
                Map<Player, Integer> lowestTrump = new HashMap<Player, Integer>();
                for (Player player : players) {
                    int cardNumber = player.getSuitInHand();
                    lowestTrump.put(player, cardNumber);
                    if(cardNumber == -1){
                        System.out.println("Player " + player.getName() + " has no TRUMP");
                    }else {
                        System.out.println("The smallest card from " + player.getName() + " is " + player.getSuitInHand());
//                    System.out.println("\n");
                    }
                }
                System.out.println("\n");
                String attackerFound = "";

                Iterator iterator = lowestTrump.entrySet().iterator();
                while(iterator.hasNext()){
                    Map.Entry element = (Map.Entry) iterator.next();
                    int number = (int)element.getValue();

                }
//                for (Map.Entry<Player, Integer> entry1 : lowestTrump.entrySet()) {
//                    Player key1 = entry1.getKey();
//                    int value1 = entry1.getValue();
//
//                    for (Map.Entry<Player, Integer> entry2 : lowestTrump.entrySet()) {
//                        Player key2 = entry2.getKey();
//                        int value2 = entry2.getValue();
//
//
//
//                        if(value1 == -1 || value2 == -1){
//                            break;
//                        }else if(value1 < value2 && (value1 != 1 || value2 != 1)) {
////                            System.out.println("Player : " + key1.getName() + " is the first attacker");
//                            attackerFound = key1.getName();
//                        }
//                    }
//                }

                System.out.println("Player : " + attackerFound+ " is the first attacker");

            }
            //Shuffle deck and dealDeck each player 6 cards


            //Let the bottom card of the stock is turned and placed face up on the table
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}