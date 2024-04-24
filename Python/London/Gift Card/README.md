# Gift Card

Write/modify the following instance methods for your `GiftCard` class:

A constructor `__init__` that allows an initial balance and id, with default values of 0 for each otherwise.
Getter methods `get_balance` and `get_id`
Setter methods `set_balance` and `set_id`
A `debit` method that subtracts the amount of a purchase from the balance, prints "Transaction Accepted. Thanks for your purchase!" and returns `True` if the balance equals or exceeds the amount; but prints "Transaction Rejected. Insufficient balance." and returns `False` otherwise.

Then in a separate block, test your code that does the following:

Creates three `GiftCard` objects - `g0`, th default; `g1` with id 1122 and initial balance of 20, and `g2` with id 9876 and initial balance 5.
Prints out each of their ids and balances (one line each).
Sets g0's id to 2344 and its balance to 10.
Tries to debit 5.18 from each.
Again prints out their ids and balances (again, one line each).
Then, tries to debit 7.96 from each.
Prints outs their ids and balances (one line each).