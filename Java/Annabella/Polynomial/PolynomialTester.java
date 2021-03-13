public class PolynomialTester {
    public static void main(String[] args) {
        double[] poly = {3,1,2};
        Polynomial p = new Polynomial(poly);
        System.out.println("The polynomial is " + p+"\n");

        double value = 2;
        System.out.println("The derivative of " + p + " is " + Calculus.differentiate(p));
        System.out.println("When x = " + value + ", the derivative is " + Calculus.differentiate(p, value) + "\n");
        
        
        double lowerLimit = 1;
        double upperLimit = 3;
        System.out.println("The integral of " + p + " is " + Calculus.integrate(p));
        System.out.println("When the x lower limit is " + lowerLimit + " and the x upper limit is " + upperLimit + ", the integral is " + Calculus.integrate(p, lowerLimit, upperLimit));
    }
}
