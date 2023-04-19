#include <iostream>

using namespace std;

int main() {
    double sales[12];
    double min_sale = LONG_MAX;
    double max_sale = LONG_MIN;

    for (int i = 0; i < sizeof(sales)/sizeof(sales[i]); i++) {
        do {
            cout << "Enter a value (>=0): ";
            cin >> sales[i];
            cout << "i is " << i << endl;
        } while (sales[i] < 0);
        min_sale = min(min_sale, sales[i]);
        max_sale = max(max_sale, sales[i]);
    }
    printf("The MAX_SALE is $%.2f.\n", max_sale);
    printf("The MIN_SALE is $%.2f.\n", min_sale);
}
