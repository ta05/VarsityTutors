public class NameWheel {
    private String[][] wheel;

    public NameWheel(int size) {
        wheel = new String[size][size];
    }

    public boolean contains(String name) {
        for (String[] row : wheel)
            for (String val : row)
                if (val.equals(name))
                    return true;
        return false;
    }

    public NameWheel add(String name) {
        int r = 0;
        int c = 0;
        while (c < wheel[r].length - 1) {
            if (wheel[r][c] == null) {
                wheel[r][c] = name;
                return this;
            }
            c++;
        }
        while (r < wheel.length - 1) {
            if (wheel[r][c] == null) {
                wheel[r][c] = name;
                return this;
            }
            r++;
        }
        while (c > 0) {
            if (wheel[r][c] == null) {
                wheel[r][c] = name;
                return this;
            }
            c--;
        }
        while (r > 0) {
            if (wheel[r][c] == null) {
                wheel[r][c] = name;
                return this;
            }
            r--;
        }
        return this;
    }

    public NameWheel add(int row, int col, String name) {
        if ((row >= 0 && row < wheel.length && col >= 0 && col < wheel[0].length)
                && (row == 0 || row == wheel.length - 1 || col == 0 || col == wheel[0].length))
            wheel[row][col] = name;
        return this;
    }

    public NameWheel remove(String name) {
        for (int r = 0; r < wheel.length; r++)
            for (int c = 0; c < wheel[r].length; c++)
                if (wheel[r][c].equals(name)) {
                    wheel[r][c] = null;
                    return this;
                }
        return this;
    }

    public NameWheel remove(int row, int col) {
        if (row >= 0 && row < wheel.length && col >= 0 && col < wheel[0].length)
            wheel[row][col] = null;
        return this;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < wheel.length; i++) {
            for (int j = 0; j < wheel[i].length; j++) {
                if (wheel[i][j] == null)
                    res += "null";
                else
                    res += wheel[i][j];
                if (j < wheel[i].length - 1)
                    res += "\t";
            }
            res += "\n";
        }
        return res.trim();
    }

    public NameWheel rotateClockwise() {
        int r = 0;
        int c = 0;
        String temp = wheel[r][c];
        while (r < wheel.length - 1) {
            wheel[r][c] = wheel[r + 1][c];
            r++;
        }
        while (c < wheel[r].length - 1) {
            wheel[r][c] = wheel[r][c + 1];
            c++;
        }
        while (r > 0) {
            wheel[r][c] = wheel[r - 1][c];
            r--;
        }
        while (c > 1) {
            wheel[r][c] = wheel[r][c - 1];
            c--;
        }
        wheel[r][c] = temp;
        return this;
    }

    public NameWheel rotateCounterClockwise() {
        int r = 0;
        int c = 0;
        String temp = wheel[r][c];
        while (c < wheel[r].length - 1) {
            wheel[r][c] = wheel[r][c + 1];
            c++;
        }
        while (r < wheel.length - 1) {
            wheel[r][c] = wheel[r + 1][c];
            r++;
        }
        while (c > 0) {
            wheel[r][c] = wheel[r][c - 1];
            c--;
        }
        while (r > 1) {
            wheel[r][c] = wheel[r - 1][c];
            r--;
        }
        wheel[r][c] = temp;
        return this;
    }
}