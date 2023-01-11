public class Player {
    int score;

    public Player() {
        score = 0;
    }

    public void reset() {
        score = 0;
    }

    public int roll() {
        int numDice = (score >= 14) ? 1 : 2;
        int total = 0;
        for (int i = 0; i < numDice; i++) {
            total += (int)(Math.random() * 6 + 1);
        }
        score += total;
        return total;
    }

    public boolean hasLost() {
        return score > 21;
    }

    public boolean hasWon() {
        return score == 21;
    }
}
