#include <iostream>

using namespace std;

int main() {
    int number;
    int reversedNumber;
    
    cout << "Enter a positive number: ";
    cin >> number;

    while (number < 0) {
        cout << "Please enter a positive number: ";
        cin >> number;
    }

    int originalNumber = number;

    while (number > 0) {
        reversedNumber = reversedNumber * 10 + (number % 10);
        number /= 10;
    }

    cout << "The reversed of " << originalNumber << " is " << reversedNumber << endl;

    return 0;
}