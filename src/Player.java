public class Player {
    private String name;
    private int points;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName () {
        return name;
    }

    public int getPoints () {
        return points;
    }
}


