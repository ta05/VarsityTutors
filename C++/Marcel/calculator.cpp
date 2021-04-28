#include <iostream>
#include <math.h>


using namespace std;

int add(int num1, int num2);
int sub(int num1, int num2);
int mult(int num1, int num2);
double divi(int num1, int num2);
string oddOrEven(int num);
int power(int num1, int num2);

int main() {
    string quit;
    int choice;

    cout << "Welcome to the Calculator!" << endl;
    do{
        int num1, num2;
        cout << "What would you like to do?\n1: Add\n2: Subtract\n3: Multiply\n4: Divide\n5: Odd or Even\n6: Exponent\n0: Quit" << endl;
        cin >> choice;

        switch(choice) {
            case 1:
                cout << "Enter num1 that you'd like to add to num2" << endl;
                cin >> num1 >> num2;
                cout << add(num1, num2) << endl;
                break;
            case 2:
                cout << "Enter num1 from which you'd like to subtract num2" << endl;
                cin >> num1 >> num2;
                cout << sub(num1, num2) << endl;
                break;
            case 3:
                cout << "Enter num1 that you'd like to multiply by num2" << endl;
                cin >> num1 >> num2;
                cout << mult(num1, num2) << endl;
                break;
            case 4:
                cout << "Enter num1 that you'd like to divide by num2" << endl;
                cin >> num1 >> num2;
                cout << divi(num1, num2) << endl;
                break;
            case 5:
                cout << "Enter num that you'd like to check is odd or even" << endl;
                cin >> num1;
                cout << oddOrEven(num1) << endl;
                break;
            case 6:
                cout << "Enter num1 that you'd like to raise to the power of num2" << endl;
                cin >> num1 >> num2;
                cout << power(num1, num2) << endl;
                break;
            case 0:
                return 0;
        }
        cout << "Would you like to repeat? (Y/N)" << endl;
        cin >> quit;
    }
    while(quit != "N");

    return 0;
}

int add(int num1, int num2) {
    return num1 + num2;
}

int sub(int num1, int num2) {
    return num1 - num2;
}

int mult(int num1, int num2) {
    return num1 * num2;
}

double divi(int num1, int num2) {
    return num1 * 1.0 / num2;
}

string oddOrEven(int num) {
    return num % 2 == 0 ? "Even" : "Odd";
}

int power(int num1, int num2) {
    return (int) pow(num1, num2);
    
}