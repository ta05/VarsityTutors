#include "stdio.h"

void printPrimesBetween(int x, int y);
int isPrime(int n);

int main() {
    printPrimesBetween(10, 20);
    printPrimesBetween(100, 200);
    printPrimesBetween(1000, 1050);
    return 0;
}

void printPrimesBetween(int x, int y) {
    printf("Prime numbers between %d and %d\n", x, y);
    for (int i = x; i <= y; i++) {
        if (isPrime(i)) {
            printf("%d ", i);
        }
    }
    printf("\n");
}

int isPrime(int n) {
    for (int j = 2; j < n / 2; j++) {
        if (n % j == 0) {
            return 0;
        }
    }
    return 1;
}