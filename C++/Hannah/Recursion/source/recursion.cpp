#include <iostream>
#include "../headers/recursion.h"

using namespace std;

void charNumTimes(int n, char c) {
    if (n == 1) {
        cout << c<< endl;
    }
    else {
        cout << c;
        charNumTimes(n-1, c);
    }
}

int sumDigits(int n) {
    if (n < 10) {
        return n;
    }
    return (n % 10) + sumDigits(n/10);
}

int rPower(int n, int e) {
    if (e == 0) {
        return 1;
    }
    return n * rPower(n, e-1);
}

int fib(int n) {
    if (n == 0 || n == 1) {
        return n;
    }
    return fib(n - 2) + fib(n - 1);
}

void fibonnaci(int n) {
    for (int i = 0; i <= n; i++) {
        cout << fib(i) << " ";
    }
    cout << endl;
}