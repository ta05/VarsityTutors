public class Stat {
    private double[] data;

    public Stat() {
        double[] copy = new double[1];
        data = copy;
    }

    public Stat(double[] d) {
        double[] copy = new double[d.length];
        for (int i = 0; i < copy.length; i++)
            copy[i] = d[i];
        data = copy;
    }
    
    public double[] getData() {
        double[] copy = new double[data.length];
        for (int i = 0; i < copy.length; i++)
            copy[i] = data[i];
        return copy;
    }

    public void setData(double[] d) {
        double[] copy = new double[d.length];
        for (int i = 0; i < copy.length; i++)
            copy[i] = d[i];
        data = copy;
    }

    public boolean equals(Stat s) {
        double[] check = s.getData();
        if (check.length != data.length)
            return false;
        for (int i = 0; i < check.length; i++)
            if (check[i] != data[i])
                return false;
        return true;
    }

    public String toString() {
        String res = "[ ";
        for(double num : data)
            res += num + ", ";
        return res.substring(0, res.length() - 2) + " ]";
    }

    public double min() {
        double min = data[0];
        for (int i = 0; i < data.length; i++)
            if (data[i] < min)
                min = data[i];
        return min;
    }
    
    public double max() {
        double max = data[0];
        for (int i = 0; i < data.length; i++)
            if (data[i] > max)
                max = data[i];
        return max;
    }

    public double average() {
        if (data.length == 0)
            return 0;
        double sum = 0;
        for (double num : data)
            sum += num;
        return sum / data.length;
    }

    public double mode() {
        double mode = Double.NaN;
        int maxFreq = 0;
        for (int i = 0; i < data.length; i++) {
            double currentValue = data[i];
            int currentCount = 1;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] == currentValue)
                    currentCount++;
            }
            if (currentCount > maxFreq) {
                maxFreq = currentCount;
                mode = currentValue;
            } else if (currentCount == maxFreq) {
                mode = Double.NaN;
            }
        }
        return mode;
    }
}
