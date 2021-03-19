#include <iostream>
#include <fstream>
using namespace std;

int count(string s, char ch);

int main() {
    fstream file("./data/green_eggs_and_ham.txt");
    string line;
    char character;
    cout << "Which character would you like to count? ";
    cin >> character;

    int total = 0;
    int numLinesAppearedIn = 0;

    if(file.is_open()) {
        while(getline(file, line)) {
            int charCount = count(line, character);
            total += charCount;
            if (charCount > 0)
                numLinesAppearedIn++;
        }
        file.close();
    }
    if(total > 0)
        cout << "The file has " << numLinesAppearedIn << " line(s) that contain the character \'" << character << "\', and the character appears in the text a total of " << total << " time(s)" << endl;
    else
        cout << "The file does not contain the character \'" << character << "\'" << endl;
}

int count(string s, char ch) {
    int count = 0;
    for(char character: s)
        if(character == ch)
            count++;
    return count;
}