#include <iomanip>
#include <iostream>

using namespace std;

int main() {
    int seedVal;
    int highestInput;

    cin >> seedVal;
    cin >> highestInput;

    srand(seedVal);

    int rand1 = (rand() % (highestInput));
    int rand2 = (rand() % (highestInput));
    int rand3 = (rand() % (highestInput));
    int rand4 = (rand() % (highestInput));
    int rand5 = (rand() % (highestInput));

    cout << rand1 << endl;
    cout << rand2 << endl;
    cout << rand3 << endl;
    cout << rand4 << endl;
    cout << rand5 << endl;

    double average = (rand1 + rand2 + rand3 + rand4 + rand5)/5.0;

    cout << "Average " << fixed << setprecision(1) << average << endl;

    return 0;
}