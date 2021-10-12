import java.lang.Math;

class Flag {
    public static String getFlag(int size, char color1, char color2, char color3) {
        String flag = "";
        for (int i = 1; i <= size * 2; i++) {
            for (int j = 1; j <= size * 5; j++) {
                if (i == 1 || i == size * 2) {
                    if (j == 1) {
                        flag += color1;
                    } else {
                        flag += color2;
                    }
                } else if (i == size || i == size + 1) {
                    if (j <= size) {
                        flag += color1;
                    } else {
                        flag += color2;
                    }
                } else {
                    if (j <= size - Math.abs(i - size)) {
                        flag += color1;
                    } else {
                        flag += color3;
                    }
                }
            }
            flag += "\n";
        }
        return flag;
    }

    public static void main(String args[]) {
        System.out.println(getFlag(9, "R", ".", "Y"));
    }
}