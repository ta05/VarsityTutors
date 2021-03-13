import java.lang.Math;

public class Calculus {
    public static Polynomial differentiate(Polynomial p) {
        double[] polynomial = p.getPolynomial();
        double[] derivative = new double[polynomial.length - 1];
        for (int i = derivative.length - 1; i >= 0; i--)
            derivative[i] = polynomial[i + 1] * (i + 1);
        return new Polynomial(derivative);
    }

    public static double differentiate(Polynomial p, double value) {
        double[] derivative = differentiate(p).getPolynomial();
        double y = 0; 
        for (int i = 0; i < derivative.length; i++) {
            y += Math.pow(value, i) * derivative[i];
        }
        return y;
    }

    public static Polynomial integrate(Polynomial p) {
        double[] polynomial = p.getPolynomial();
        double[] integral = new double[polynomial.length + 1];
        for (int i = integral.length - 1; i >= 0; i--) {
            if (i == 0)
                integral[i] = 0;
            else
                integral[i] = polynomial[i - 1] / i;
        }
        return new Polynomial(integral);
    }

    public static double integrate(Polynomial p, double lowerLimit, double upperLimit) {
        double[] integral = integrate(p).getPolynomial();
        double fUpper = 0;
        double fLower = 0; 
        for (int i = 0; i < integral.length; i++) {
            fUpper += Math.pow(upperLimit, i) * integral[i];
            fLower += Math.pow(lowerLimit, i) * integral[i];
        }
        return fUpper - fLower;
    }
}
