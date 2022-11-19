#include <string>
using namespace std;

class StringQueue {
    private:
        //add your member variables here
        //you may use an array or linked list or ...
        int maxsize;
        int numitems;
        int front;
        int rear;
        string * queue;

    public:
        // Constructor
        StringQueue(int);

        // Queue operations
        int enqueue(string); //returns position where inserted, front is 1
        string dequeue();
        bool isEmpty();
        bool isFull();
        void display(ostream& out);
};