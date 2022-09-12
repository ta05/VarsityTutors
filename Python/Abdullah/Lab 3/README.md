# Lab 3

## Task

Write a program that will allow a manager to determine and display the total sales for a department. The manager will enter the sales goal for the mont. Then the manager will enter (input) the sales for each salesperson for four (4) weeks. After each salesperson, the program should ask the manager if there is another. Once all the sales are entered the program will accumulate the total sales for the department.

Display the total number of employees in the department and total sales for the depart,ent. The manager earns a 2% bonus on all sales for the month. If the total department's sales exceeds the sales goal, then the manager bonus is 5% of the total sales. Determine and display the sales goal and manager's bonus amount.

Hint: two loops are required -- use a loop to allow for another salesperson's monthly sales to be entered and a second loop for the four (4) weeks of sales of the individual salesperson.

Some sample input/output is provided on the next page. The output is based on the input for two (2) emplotees, one with weekly sales of (1200, 1300, 1250, 2250) and the other with (2399, 2103, 1900, 1000). Sales goal of the month $11000.

Display screenshots of at least 4 instances of the program:
- one with at least 2 employees in the department.
- one with at least 3 salespersons in the department.
- one where the sales goal is exceeded.
- one where the sales goal is not met.

## Example

**Input**
~~~
Sales goal: 11000
Salesperson 1 week 1: 1200
Salesperson 1 week 2: 1300
Salesperson 1 week 3: 1250
Salesperson 1 week 4: 2250
Another salesperson? (y/n): y
Salesperson 2 week 1: 2399
Salesperson 2 week 2: 2103
Salesperson 2 week 3: 1900
Salesperson 2 week 4: 1000
Another salesperson? (y/n): n
~~~

**Output**
~~~
Department Monthly Sales and Commission


Number of Employees:   2

Department Sales Goal: $11000


Total Sales                 $13402.00
Mgr. Bonus                    $670.10
~~~