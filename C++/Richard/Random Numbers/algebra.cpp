#include <iostream>

using namespace std;

int main() {
    int seedVal;
    int highestValue;

    cin >> seedVal;
    cin >> highestValue;

    srand(seedVal);

    int A = (rand() % highestValue) + 1;
    int B = (rand() % highestValue) + 1;
    int C = (rand() % highestValue) + 1;

    int X = A * B + C;

    cout << A << " * " << B << " + " << C << " = " << X << endl;

    return 0;
}