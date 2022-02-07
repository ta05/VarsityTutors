# Lab Description

Create a method that will receive an integer parameter and then return an ArrayList that contains all of the number's factors excluding 1 and itself. Create a 2nd method ttat will remove numbers from its ArrayList parameter that are not composite numbers. Composite numbers are divisible by 1, itself, and must have at least 1 other positive factor. You will need to use the modulus operator (%) to determine if a number has a factor.

~~~
public class ArrayListFunHouse {
    public static ArrayList<Integer> getList of Factors(int number) {
        /// you will add code
    }
    public static void keepOnlyCompositeNumbers(List<Integer> nums) {
        // you will add code
    }
}
~~~

## Sample Data:

- `getListOfFactors(9)` returns `[3]`
- `getListOfFactors(23)` returns `[]`
- `getListOfFactors(50)` returns `[2, 5, 10, 25]`
- `getListOfFactors(100)` returns `[2, 4, 5, 10, 20, 25, 50]`
- `getListOfFactors(762)` returns `[2, 3, 6, 127, 254, 381]`  

if `nums == [2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79]` then after `keepOnlyCompositeNumbers(nums)` is called, `nums == [6, 8, 9, 10, 12, 15, 17, 24, 55, 66, 78, 7, 79]`
