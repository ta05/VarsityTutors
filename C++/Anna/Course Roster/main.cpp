#include <string>
#include <iostream>

#include "SortedList.h"
#include "StringQueue.h"

using namespace std;

int main() {
    int classsize;
    cout << "Enter class size: ";
    cin >> classsize;
    
    int waitlistsize;
    cout << "Enter wait list size: ";
    cin >> waitlistsize;

    SortedList myclass = SortedList(classsize);
    StringQueue mywaitlist = StringQueue(waitlistsize);

    cout << "Enter the commands:" << endl;

    string command;

    while (command != "quit") {
        cin >> command;

        if (command == "add") {
            string name;
            cin >> name;

            if (!myclass.isFull()) {
                myclass.insert(name);
            }
            else if(!mywaitlist.isFull()) {
                cout << ">Class is full, join the wait list (y/n)?" << endl;
                string resp;
                cin >> resp;
                if (resp == "y" || resp == "Y") {
                    int position = mywaitlist.enqueue(name);
                    cout << "Added at position " << position << endl;
                }
            }
            else {
                cout << ">Class and wait list are full." << endl;
            }
        }
        else if (command == "drop") {
            string name;
            cin >> name;

            myclass.remove(name);
            string resp;
            string firstinwaitlist;

            while(!mywaitlist.isEmpty() && (resp != "y" && resp != "Y")) {
                firstinwaitlist = mywaitlist.dequeue();
                cout << ">Add " << firstinwaitlist << " to the class (y/n)?" << endl;
            }
            if (resp == "y" || resp == "Y") {
                myclass.insert(firstinwaitlist);
            }
            else {
                cout << "Wait list is empty. No one was added to the class." << endl;
            }
        }
        else if (command == "pr") {
            myclass.displayList(cout);
        }
        else if (command == "pwl") {
            mywaitlist.display(cout);
        }
    }
    return 0;
}