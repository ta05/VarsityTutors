#include <iostream>
#include "../headers/recursion.h"

using namespace std;

int main() {
    charNumTimes(5, 'X');
    charNumTimes(3, 'o');
    
    cout << sumDigits(54321) << endl;
    cout << sumDigits(421) << endl;

    cout << rPower(2, 8) << endl;
    cout << rPower(3, 2) << endl;

    fibonnaci(4);
    fibonnaci(0);
    fibonnaci(1);

    return 0;
}