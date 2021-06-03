#include <iostream>

using namespace std;

int convert(int num, int ob, int nb);

int main() {
    int num;
    int ob;
    int nb;

    cout << "Welcome to the base converter. Please enter the number, the old base and the new base.\n" << endl;
    cin >> num >> ob >> nb;

    cout << convert(num, ob, nb);
    return 0;
}

int convert(int num, int ob, int nb) {
    int base10num = 0;
    int place = 1;

    while(num > 0) {
        int lastdigit = num % 10;
        num /= 10;
        base10num += place * lastdigit;
        place *= ob;
    }

    int maxplace = 1;
    int numdigits = 1;
    while (maxplace * nb <= base10num) {
        numdigits++;
        maxplace *= nb;
    }

    int finalnum = 0;

    for (int i = 0; i < numdigits; i++) {
        int coeff = base10num / maxplace;
        finalnum = finalnum * 10 + coeff;
        base10num %= maxplace;
        maxplace /= nb;
    }

    return finalnum;
}