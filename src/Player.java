public class Player {
    private String name;
    private int numberOfPlayers;
    private int points;

    public Player (int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        this.points = 0;
    }

    public Player(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName () {
        return name;
    }

    public int getPoints () {
        return points;
    }
}


