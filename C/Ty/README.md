# Functions

The code below outputs prime numbers in specified ranges. Rewrite the program so it produces the same output, except create two new functions that eliminate the redundant code. The first function shuld take as input an integer *n* and return whether or not it is a prime number. The second function should take as input two integers that specify a number range, test if each number in the range is prime using the first function, and if it is prime, then output it. It doesn't need to return anything. Finally the main function should be modified to use your prime range function. Be sure to include function prototypes.

~~~c
int main() {
    int isDivisible;

    printf("Prime numbers between 10 and 20\n");
    for (int i = 10; i <= 20; i++) {
        isDivisible = 0;
        for (int j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                isDivisible = 1;
                break;
            }
        }
        if (!isDivisible) {
            printf("%d ", i);
        }
    }
    printf("\n");

    printf("Prime numbers between 100 and 200\n");
    for (int i = 100; i <= 200; i++) {
        isDivisible = 0;
        for (int j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                isDivisible = 1;
                break;
            }
        }
        if (!isDivisible) {
            printf("%d ", i);
        }
    }
    printf("\n");

    printf("Prime numbers between 1000 and 1050\n");
    for (int i = 1000; i <= 1050; i++) {
        isDivisible = 0;
        for (int j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                isDivisible = 1;
                break;
            }
        }
        if (!isDivisible) {
            printf("%d ", i);
        }
    }
    printf("\n");
}
~~~