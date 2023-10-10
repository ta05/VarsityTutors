#include <iostream>

using namespace std;

int main() {
    int N;

    cout << "N value (must be greater than or equal to 0)? ";
    cin >> N;

    if (N < 0 || N > 12) {
        cout << "\nInvalid Input: " << N << endl;
        return 0;
    }

    int factorial = 1;
    for (int i = N; i > 1; i--) {
        factorial *= i;
    }

    int digitCount = 0;
    int factorialCopy = factorial;

    while (factorialCopy > 0) {
        digitCount++;
        factorialCopy /= 10;
    }

    cout << "\n" << N << "! is equal to " << factorial << ". There are " << digitCount << " digits." << endl; 
}