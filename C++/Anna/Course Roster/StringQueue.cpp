#include <iostream>
#include <cassert>
using namespace std;

#include "StringQueue.h"

StringQueue::StringQueue(int size) {
    maxsize = size;
    numitems = 0;
    front = 0;
    rear = 0;
    queue = new string[maxsize];
}

int StringQueue::enqueue(string val) {
    assert(!isFull());
    // Add val to the end of the queue
    queue[rear] = val;

    // Increment the rear position and number of items
    rear = (rear+1) % maxsize;
    numitems++;

    // Return the position of the string where the first item is at position 1
    return numitems;
}

string StringQueue::dequeue() {
    assert(!isEmpty());
    // Grab the item from the front of the queue
    string val = queue[front];

    // Increment front to start the queue at the next position
    // And decrement number of items
    front = (front+1) % maxsize;
    numitems--;

    return val;
}

bool StringQueue::isEmpty() {
    return numitems == 0;
}

bool StringQueue::isFull() {
    return numitems == maxsize;
}

void StringQueue::display(ostream& out) {
    int position = 1;
    int i = front;
    while (position <= numitems) {
        out << position << " " << queue[i] << endl;
        i = (i + 1) % maxsize;
        position++;
    }
}

