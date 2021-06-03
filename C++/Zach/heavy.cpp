#include <vector>
#include <iostream>

using namespace std;

int convert(int num, int ob);
int heavy(int num);
bool contains(vector<int> vec, int num);

int main() {
    int num;
    int ob;

    cout << "Welcome to the heavy sequence. Please enter the number and the base.\n" << endl;
    cin >> num >> ob;

    if(ob != 10) {
        num = convert(num, ob);
    }

    vector<int> seen;
    
    while(true) {
        int heavynum = heavy(num);
        if(heavynum == 1) {
            cout << 1;
            return 1;
        }
        if(contains(seen, heavynum)) {
            cout << 0;
            return 0;
        }
        seen.push_back(heavynum);
        num = heavynum;
    }
}

int convert(int num, int ob) {
    int base10num = 0;
    int place = 1;

    while(num > 0) {
        int lastdigit = num % 10;
        num /= 10;
        base10num += place * lastdigit;
        place *= ob;
    }

    return base10num;
}

int heavy(int num) {
    int heavynum = 0;
    while(num > 0) {
        int lastdigit = num % 10;
        heavynum += lastdigit * lastdigit;
        num /= 10;
    }
    return heavynum;
}

bool contains(vector<int> vec, int num) {
    for (int i = 0; i < vec.size(); i++) {
        if (vec.at(i) == num)
            return true;
    }
    return false;
}

