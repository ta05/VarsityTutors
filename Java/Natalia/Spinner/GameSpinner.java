import java.lang.Math;

public class GameSpinner {
    private int sectors;
    private int lastSpin;
    private int currentRun;

    public GameSpinner(int sectors) {
        this.sectors = sectors;
        lastSpin = 0;
        currentRun = 0;
    }

    public int spin() {
        int currentSpin = (int)(Math.random() * sectors + 1);
        if (lastSpin == currentSpin) {
            currentRun++;
        }
        else {
            currentRun = 1;
        }
        lastSpin = currentSpin;
        return currentSpin;
    }

    public int getCurrentRun() {
        return currentRun;
    }
}
