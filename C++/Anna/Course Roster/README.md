# Course Roster

This assignment is composed of 5 files:

- `StringQueue.h` (template provided, you must complete the code)
- `StringQueue.cpp` (you must provide this file)
- `SortedList.h` (complete file provided, you cannot change it)
- `SortedList.cpp` (template provided, you must complete the code)
- `main.cpp` (you must provide this file)

Implement a program that simulates a class wait list as used during registration for courses. You will use two ADT's to implement the solution. The course roster will be implemented using the SortedList class and the wait list will be implemented using the `StringQueue` class.

## `StringQueue`

A regular queue that stores `string` values. In the template, you're provided with prototypes of the public member functions. Feel free to add any private variables/functions, but leave public function prototypes unchanged. You may use a linked list or an array to store the strings. You will need to implement the member functions in the `StringQueue.cpp` file (not provided). A test driver is provded in "downloadable files".

- `StringQueue(int n)`: initializes the queue. `n` is the maximum size of the queue.
- `~StringQueue()`: Cleans up the dynamically allocated memory (if any). Must be definied, even if empty.
- `int enqueue(string)`: Adds string `s` to the queue. Returnes the position of the string in the added queue (front of queue is position 1, hint: it's the number of elements). It should not succeed if the queue is full.
- `string dequeue()`: Removes the next value from the queue and returns it. It should not succeed if the queue is empty.
- `bool isEmpty()`: Returns `true` if the queue is empty, otherwise, returns `false`.
- `bool isFull()`: Returns `true` if the queue is fill, otherwise, returns `false`. The queue is full if it contains `n` elements, where `n` is the maximum size of the queue (from the constructor).
- `void display(ostream &out)`: outputs the elements in the queue numbered starting at 1, one per line, from front to rear, to the ostream. Use `out` in place of `cout`.

## `SortedList`

A list of strings with a maximum size `n`. The list is maintained in sorted order (enforced by the insert function). It is implemented using a linked list of Nodes. Much of the code is provided in `SortedList.h` and `SortedList.cpp`. You will need to make changes to `SortedList.cpp` to complete the implementation. A test driver is provided in 'downloadable files'.

- `SortedList(int n)`: Creates an empty list, `n` is the maximum size of the list.
- `~SortedList()`: Cleans up the dynamically allocated memory
- `void remove(string s)`: Find `s` and if found, removes `s` from the list. 
- `void insert(string s)`: Inserts string `s` into the list, in the position that will keep the list in ascending order. It should not succeed if the list is full.
- `bool isEmpty()`: Returns `true` if the list is empty, otherwise returns `false`.
- `bool isFull()`: Returns `true` if the list is full, otherwise returns `false`. The list is full if it contains `n` elements, where `n` is the maximum size of the list (from the constructor).
- `void displayList(ostream& out)`: outputs the elements in the list, in sorted order, numbered starting at 1, to the ostream. Use `out` in place of of `cout`.

## `main.cpp`

The class roster is a `SortedList` of a given size. The wait list is a `StringQueue` of a given size. The program should prompt the user for the class size and the wait list size. The user should be able to enter the following commands (assume that the names do not contain whitespace):

- add name: if the class is not full, add the name to the class. Otherwise, if the wait list is not full, ask the user if they want to join the wait list. If yes, add the name to the wait list and output the position.
- drop name: remove the student from the class. If the wait list is not empty, remove the next name from the waitlist and ask the user if the student wants to add the class. If yes, add to the class. If not, repeat, until a student is added or the wait list is empty. Note: if the student does not want to add the class they are still removed from the wait list.
- pr: print the roster of the class (sorted).
- pwl: print the wait list (from position 1 to the end).
- quit: quit the program.