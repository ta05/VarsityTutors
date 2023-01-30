#include <iostream>

using namespace std;

int main() {
    int seedVal;
    int highestValue;
    int lowestValue;

    cin >> seedVal;
    cin >> lowestValue;
    cin >> highestValue;

    srand(seedVal);

    int rand1 = (rand() % (highestValue - lowestValue + 1)) + lowestValue;

    cout << rand1 << endl;

    return 0;
}