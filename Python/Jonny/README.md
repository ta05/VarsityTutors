# File Processing

Write a read_file() method that reads in the 'oldMaster.dat' file, adds an Entry for each line of data into a list and then returns the list of Entries.

The Entry class should have the following attributes: *account_num* (string), *name* (string), *balance* (float), *phone* (string), *city* (string).

Add an `__eq__` function to the class, so that you can test two Entry objects for equality. Two entries are equal if all of their attributes are equal.

Write a sorted_file() method which writes an 'sorted_oldMaster.dat' file with all the entries in the oldMaster.dat file sorted by ascending account number.

Write a new_master_file() method that reads in the 'transactions.dat' file and adds the transaction amount to the balance of the corresponding Entry and writes a sorted Entry list as 'newMaster.dat'


