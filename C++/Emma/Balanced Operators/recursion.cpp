#include <string>
#include <iostream>

using namespace std;

string operatorsFrom(string str) {
    if(str.empty()) {
        return "";
    }
    if(str[0] == '(' || str[0] == '[' || str[0] == '{' || str[0] == ')' || str[0] == ']' || str[0] == '}') {
        return str[0] + operatorsFrom(str.substr(1));
    }
    return operatorsFrom(str.substr(1));
}

bool operatorsAreMatched(string ops) {
    if(ops.empty()) {
        return true;
    }
    if(ops.find("()") != -1) {
        return operatorsAreMatched(ops.substr(0, ops.find("()")) + ops.substr(ops.find("()") + 2));
    }
    else if(ops.find("[]") != -1) {
        return operatorsAreMatched(ops.substr(0, ops.find("[]")) + ops.substr(ops.find("[]") + 2));
    }
    else if(ops.find("{}") != -1) {
        return operatorsAreMatched(ops.substr(0, ops.find("{}")) + ops.substr(ops.find("{}") + 2));
    }
    return false;
}

bool isBalanced(string str) {
    string ops = operatorsFrom(str);
    return operatorsAreMatched(ops);
}

int main() {
    cout << operatorsAreMatched(operatorsFrom("public Car(String name, int mileage) {}")) << endl;
    return 0;
}