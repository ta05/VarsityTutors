public class Polynomial {
    private double[] polynomial;

    public Polynomial(double[] polynomial) {
        this.polynomial = polynomial;
    }

    public double[] getPolynomial() {
        return this.polynomial;
    }

    public String toString() {
        String equation = "";
        String[] variables = new String[polynomial.length];

        for (int i = 0; i < variables.length; i++) {
            if (i == 0)
                variables[i] = "";
            else if (i == 1)
                variables[i] = "x";
            else
                variables[i] = "x^" + i;
        }
        
        for (int i = polynomial.length - 1; i > -1; i--) {
            if (i == 0)
                equation += polynomial[i] + variables[i];
            else {
                if (polynomial[i] == 1)
                    equation += variables[i] + " + ";
                else
                    equation += polynomial[i] + variables[i] + " + ";
            }
                
        }

        return equation;
    }
}