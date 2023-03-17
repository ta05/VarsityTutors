import java.util.Arrays;
import java.lang.Math;

public class Board {
    private boolean[][] lights;

    public Board(int numRows, int numCols) {
        //  Initialize lights as a 2d array with the given numRows and numCols
        lights = new boolean[numRows][numCols];

        // Iterate through every element in the lights 2d array
        for (int r = 0; r < lights.length; r++) {
            for (int c = 0; c < lights[0].length; c++) {
                // Generate a random number
                double rand = Math.random();

                // If the random number is less than or equal to 0.5
                // Assign the light at (r,c) to true (on)
                // Otherwise assign the light at (r,c) to false (off)
                if (rand <= 0.5) {
                    lights[r][c] = true;
                }
                else {
                    lights[r][c] = false;
                }
            }
        }
    }

    public int pushButton(int rowNum, int rowCol) {
        // Switches the light at (rowNum, rowCol) from true to false or false to true
        if (lights[rowNum][rowCol] == true) {
            lights[rowNum][rowCol] = false;
        } else {
            lights[rowNum][rowCol] = true;
        }

        // Alternative to if-else statement above
        // lights[rowNum][rowCol] = !lights[rowNum][rowCol];
        
        // Identify 4 adjacent lights

        // Toggle left light
        if (((rowCol-1) >= 0) && ((rowCol-1) < lights[0].length)) {
            lights[rowNum][rowCol-1] = !lights[rowNum][rowCol-1];
        }

        // Toggle right light
        if (((rowCol+1) >= 0) && ((rowCol+1) < lights[0].length)) {
            lights[rowNum][rowCol+1] = !lights[rowNum][rowCol+1];
        }

        // Toggle above light
        if (((rowNum-1) >= 0) && ((rowNum-1) < lights.length)) {
            lights[rowNum-1][rowCol] = !lights[rowNum-1][rowCol];
        }
        
        // Toggle below light
        if (((rowNum+1) >= 0) && ((rowNum+1) < lights.length)) {
            lights[rowNum+1][rowCol] = !lights[rowNum+1][rowCol];
        }

        // Count the number of lights that are on
        int num = 0;

        // Iterate through the lights board
        for (int r = 0; r < lights.length; r++) {
            for (int c = 0; c < lights[0].length; c++) {
                // If the light at (r,c) is on, increment num
                if (lights[r][c]) {
                    num++;
                }
            }
        }

        return num;
    }

    public String toString() {
        String res = "[\n";
        for (boolean[] row : lights) {
            res = res + Arrays.toString(row) + "\n";
        }
        res += "]";
        return res;
    }
}
