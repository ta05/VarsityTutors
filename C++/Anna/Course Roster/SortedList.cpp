#include <iostream>
#include <cassert>
using namespace std;

#include "SortedList.h"

SortedList::SortedList(int size) {
    head = nullptr;
    maxsize = size;
    count = 0;

}

bool SortedList::isEmpty() {
    return (head==nullptr);
}

bool SortedList::isFull() {
    return count == maxsize;
}

SortedList::~SortedList() {
    ListNode *p;
        while (!isEmpty()) {
            // deletes the first node
            p = head;
            head = head->next;
            delete p;
        }
}

void SortedList::displayList(ostream& out) {
    //add the numbers!
    ListNode *p = head;
    int position = 1;
    while (p!=nullptr) {
        out << position << " " << p->value << endl;
        p = p->next;
        position++;
    }
}

void SortedList::remove(string val) {

    ListNode *p = head; // to traverse the list
    ListNode *n = nullptr; // trailing node pointer

    // skip nodes not equal to val, stop at last
    while (p && p->value!=val) {
        n = p; // save it!
        p = p->next; // advance it
    }

// p not null: val is found, set links + delete
    if (p) {
        if (n==nullptr) { // p points to the first elem.
            head = p->next;
            delete p;
        } else { // n points to the predecessor
            n->next = p->next;
            delete p;
        }
        count--;
    }
}

void SortedList::insert(string val) {

    assert(!isFull());

    ListNode *curr = head; // to traverse the list
    ListNode *prev = nullptr; // trailing node pointer

    // Create a new node that stores the val
    ListNode * newNode = new ListNode;
    newNode->value = val;

    // traverses the list until it finds a node with a value greater than the new node's value
    while (curr && curr->value<=val) {
        prev = curr; // save it!
        curr = curr->next; // advance it
    }

    // the previous node points at the newNode and newNode points at the current node
    newNode->next = curr;
    if(prev) {
        prev->next = newNode;
    }
    else {
        head = newNode;
    }
}