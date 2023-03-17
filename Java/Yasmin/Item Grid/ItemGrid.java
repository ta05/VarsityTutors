public class ItemGrid {
    private Item[][] grid;

    public ItemGrid(int r, int c) {
        grid = new ItemGrid[r][c];
    }

    public void addItem(Item i, int r, int c) {
        grid[r][c] = i;
    }

    public boolean isValid(int xPos, int yPos) {
        return (xPos >= 0) && (xPos < grid.length) && (yPos >= 0) && (yPos < grid[0].length);
    }

    public String mostValuableNeighbor(int r, int c) {
        // Get the item at position (r, c)
        Item mid = grid[r][c];

        // Create an item that represents the neighbor with the
        // greatest value.
        Item greatest = mid;
        
        // Check if the left neighbor would be valid
        if (isValid(c-1, r) == true) {
            // Get the neighbor to the left
            Item left = grid[r][c-1];

            // Compare the value of the item and its left neighbor
            // Assign greatest to the item with the larger value
            if (mid.getValue() > left.getValue()) {
                greatest = mid;
            }
            else {
                greatest = left;
            }
        }
        
        // Check if the right neighbor would be valid
        if (isValid(c+1, r) == true) {
            // Get the neighbor to the right
            Item right = grid[r][c+1];

            // Compare the right value to the greatest
            // If the right value is greater, assign greatest
            // to right.
            if (right.getValue() > greatest.getValue()) {
                greatest = right;
            }
        }

        // Return the name of the item with the greatest value.
        return greatest.getName();
    }

    public double findAverage() {
        // Create a variable for the average
        double average = 0;
        double sum = 0;
        // Iterate through the rows of the grid array
        for (int r = 0; r < grid.length; r++) {
            // Iterate through each element in row r of the grid array
            for (int c = 0; c < grid[0].length; c++) {
                sum += grid[r][c].getValue();
            }
        }
        
        // Assign the calculated average to the variable average
        // grid.length is the number of rows
        // grid[0].length is the number of columns
        // number of rows * number of columns gives the number of elements in
        // the grid 2d array.
        average = sum / (grid.length * grid[0].length);
        return average;
    }
}
