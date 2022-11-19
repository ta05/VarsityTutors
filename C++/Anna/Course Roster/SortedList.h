#include <string>
using namespace std;

class SortedList {
    private:
        struct ListNode { // the node data type
            string value; // data
            ListNode *next; // ptr to next node
        };
        ListNode * head; // the list head
        int maxsize; // max list size
        int count; // current size

    public:
        SortedList(int); // creates an empty list of a given max size
        ~SortedList();

        void remove(string);
        void insert(string);
        bool isEmpty();
        bool isFull();
        void displayList(ostream& out);
};