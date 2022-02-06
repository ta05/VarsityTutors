import java.lang.Math;

    
class Separator {
    
    // Method 1: String.format()
    public static String methodOne(double number) {
        if (number == Math.round(number))
            return String.format("$%,.0f", number);
        return String.format("$%,.2f", number);
    }

    // Method 2: Iteratively
    public static String methodTwo(double number) {
        String sNum = (Math.round(number) == number) ? (int)(number) + "" : (Math.round(number * 100d)/100d) + "";
        
        String whole = sNum;
        String decimal = "";
        if(sNum.contains(".")) {
            whole = sNum.substring(0,sNum.indexOf("."));
            decimal = sNum.substring(sNum.indexOf("."));
        }

        String result = "";
        for (int i=1; i <= whole.length(); ++i) {
            char digit = whole.charAt(whole.length() - i);
            if (i % 3 == 1 && i > 1) {
                result = "," + result;
            }
            result = digit + result;
        }

        return "$" + result + decimal;
    }

    public static void main(String args[]) {
        System.out.println("Method 1: String.format()");
        System.out.println("5458 -> " + methodOne(5458));
        System.out.println("865654896 -> " + methodOne(865654896));
        System.out.println("123456.78 -> " + methodOne(123456.78));
        System.out.println("897564.7844 -> " + methodOne(897564.7844)+"\n");


        System.out.println("Method 2: Iterative Approach");
        System.out.println("5458 -> " + methodTwo(5458));
        System.out.println("865654896 -> " + methodTwo(865654896));
        System.out.println("123456.78 -> " + methodTwo(123456.78));
        System.out.println("897564.7844 -> " + methodTwo(897564.7844));
    }
}