import java.math.BigInteger;

public class BigInt {
    
    public static BigInteger sum(BigInteger num1, BigInteger num2) {
        return num1.add(num2);
    }
    
    public static void main(String[] args) {
        BigInteger input1 = new BigInteger("5555599984358232156");
        BigInteger input2 = new BigInteger("7956235813256513266");

        System.out.println(sum(input1, input2));
    }
    
}
