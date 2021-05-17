#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int getsize(string line);
int getmax(int a[], int size);
int getmode(int arr[], int size);

int main() {
    string filename;
    string line;
    cout << "Please enter a file name: ";
    cin >> filename;
    fstream file("./data/" + filename);
    if (file.is_open()) {
        getline(file, line);
        int size = getsize(line);
        int nums[size];
        for (int i = 0; getline(file, line); i++) {
            nums[i] = stoi(line);
        }
        int mode = getmode(nums, size);
        cout << "The mode is " << mode << endl;

        file.close();
    }

    return 0;
}

int getsize(string line) {
    return stoi(line);
}

int getmax(int arr[], int size) {
    int max = arr[0];
    for (int i = 0; i < size; i++)
    {
        if(max < arr[i])
            max = arr[i];
    }
    return max;
}

int getmode(int arr[], int size) {
    int histsize = getmax(arr, size) + 1;
    int hist[histsize] = {};
    int currmax = 0;
    int mode = arr[0];
    for (int i = 0; i < histsize; i++) {
        hist[arr[i]]++;
        if(hist[arr[i]] > currmax) {
            currmax = hist[arr[i]];
            mode = arr[i];
        }
    }
    return mode;
}