# Restaurant

## Description

A restaurant owner has asked you to create a program that manages the operation of the restaurant. She has tasked you with creating a menu for options and writing functions to carry out those options

## Task

First ask the user to input the capacity of the restaurant. Then present the user with a selection of options:


(1). Add Party to queue.

(2). Add VIP to queue.

(3). Seat Party.

(4). Clear Table.

(5). Remove Party.

(6). Print Waiting.

(7). Print Seated.

(8). Exit.


If the user types in the number associated with the option or if the input starts with the following (case-insensitive), the program should carry out the corresponding functions:

- "add party": `add_party()`
- "add vip": `add_vip()`
- "seat party": `seat_party()`
- "clear table": `clear_table()`
- "remove party": `remove_party()`
- "print waiting": `print_waiting()`
- "print seated": `print_seated()`

- "exit": Ends the program

## Functions

`add_party()`: Prompts the user for the customer's name and party size and appends the customer to the end of the waiting queue.


`add_vip()`: Prompts the user for the vip customer's name and party size and appends the customer to the end of the vip waiting queue.


`seat_party`: Grabs the first customer in the vip waiting queue or if the vip queue is empty, the first customer in the waiting queue and verifies that there are seats available for the customer's party. If so the customer is taken from their waiting queue and added to the seated queue. Otherwise a message that "Not enough seats available." displays and the customer remains on the waiting queue. Adjust the current capacity/available seating accordingly.


`clear_table()`: Prompts the user for the name of the customer whose table needs to be clear. If the customer is seated, removes that customer from the seated list. If not displays the message "No customer by that name is seated."


`remove_party()`: Prompts the user for the name of the customer who would like to leave the waiting queue. If the customer is in one of the waiting queues, removes the customer. If not, displays the message "No customer by that name is waiting."


`print_waiting()`: Prints the name of the customers in each waiting queue and each customer's party size.


`print_seated()`: Prints the name of the customers in the seated list and each customer's party size.

