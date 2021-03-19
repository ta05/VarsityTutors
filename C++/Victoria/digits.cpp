#include <iostream>
#include <vector>
#include <fstream>
using namespace std;


int main() {
    fstream file("./data/nums.txt");
    string line;
    vector<string> numbers;
    if(file.is_open()) {
        while(getline(file, line)) {
            numbers.push_back(line);
        }
        file.close();
    }

    for(int i = 0; i < numbers.size() - 1; i++) {
        int minLenIndex = i;
        for (int j = i; j < numbers.size(); j++) {
            if(numbers[j].length() < numbers[minLenIndex].length())
                minLenIndex = j;
        }
        string temp = numbers[minLenIndex];
        numbers[minLenIndex] = numbers[i];
        numbers[i] = temp;
    }

    for(string num : numbers)
        cout << num << endl;
}