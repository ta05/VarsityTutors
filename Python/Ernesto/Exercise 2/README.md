# Exercise 2 - Stacks and Queues

A python programmer is attempting to sum the values contained in a list that contains one or more sub-lists. For instance, if `list1 = [1, [2, 3], 4]` the result would be `10`. After successfully writing a program that summed the list, the programmer decided it would be better to flatten the list, so that if `list1 = [1, [2, 3], 4]` the flattened list would be `[1, 2, 3, 4]`. The function `sum` could then be used to summ the list. However, the programmer couldn't find a way to flatten the list, and then discovered the original program had been corrupted. In this exercise, you must:

1. Untangle the lines of code given below to re-create the program that sums the value of list1
2. Amend the code so list1 is flattened and where the sum of values is output using the statement `print(sum(queue))`

Corrupted code (lines out of order, lost indentation, one line missing):

~~~
if type(item) is list:
else:
result += item
item = stack.pop(0)
for e in item:
list1 = [1, [2, 3], 4]
print(result)
while stack:
stack = list1.copy()
result = 0
~~~