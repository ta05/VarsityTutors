import java.lang.Math;

public class RandomWalker {

    public static int manhattanDistance(int x, int y) {
        return Math.abs(x) + Math.abs(y);
    }

    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        int steps = 0;

        int r = Integer.parseInt(args[0]);
        
        System.out.printf("(%d,%d)\n", x, y);
        while (manhattanDistance(x, y) < r) {
            double move = Math.random();
            if (move <= 0.25) {
                x += 1;
            }
            else if (move <= 0.5) {
                y += 1;
            }
            else if (move <= 0.75) {
                x -= 1;
            }
            else {
                y -= 1;
            }
            steps++;
            System.out.printf("(%d,%d)\n", x, y);
        }
        System.out.printf("It took %d steps\n", steps);
    }
}
