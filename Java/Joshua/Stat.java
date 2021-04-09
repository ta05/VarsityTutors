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
    
    public double getData() {
        double[] copy = new double[data.length];
        for (int i = 0; i < copy.length; i++)
            copy[i] = data[i];
        return copy;
    }

}
