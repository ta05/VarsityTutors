# List Lab

## printStr

### Task

Write a function **`printStr`** that takes a list of integers as a parameter. The numbers in the list represent Unicode encodings, and the function **prints** the characters associated with the codes all on one line with no spaces between them. For example, if the function were called on the list `[109, 111, 109]`, it would print `mom` to the screen since 'm' is encoded by 109 and 'o' is encoded by 111. If there are any non-numeric values, floating point numbers, or negative integers in the list, those values are skipped by the function since those do not correspond to valud encodings. For example, id the function were called on the list `[109, -1, 111, 0.5, 109, '1']`, it would print `mom` to the screen since the only valud values in the list are the ones from the previous example. The function should not modify the list passes as a parameter in any way.

### Examples

~~~py
>>> lst1 = [84, 111, 100, 97, 121, 32, 105, 115, 32, 84, 117, 101, 115, 100, 97, 121, 46]
>>> lst2 = [37, 33, 35, 36, 33, 64, 35, 42, 36, 38, 35, 32, 119, 105, 115, 104, 32, 73, 32, 99, 111, 117, 108, 100, 32, 117, 100, 101, 114, 115, 116, 97, 110, 100, 32, 116, 104, 105, 115, 32, 98, 101, 116, 116, 101, 114, 46]
>>> lst3 = [65, 110, 110, 105, 107, 97]
>>> lst4 = [65, 110, -3, 110, 105, -8.5, 11.1, 107, 'ten', 97]
>>> lst5 = []
>>> printStr(lst1)
Today is Tuesday.
>>> printStr(lst2)
%!#$!@#*$&# wish I could uderstand this better.
>>> printStr(lst3)
Annika
>>> printStr(lst4)
Annika
>>> printStr(lst5)

~~~

## alphabetical

### Task

Implement a function **`alphabetical`** that takes a list of strings as a parameter and **returns** `True` if the strings are alphabetical order in the list and `False` if there are any pairs of strings in the list that are not in alphabetical order. An empty list and a list with a single string should not be considered to be in alphabetical order. The capitalization of the strings should not matter when determining ordering. So, for example, the list `['aardvark', 'Paris', 'zebra']` is considered to be in alphabetical order since 'a' comes before 'p' which comes before 'z'. The capitalization of the 'P' in 'Paris' does not impact the results of the function. Duplicate strings next to each other are considered to be in order. **A correct solution to this function will use an indexed loop**, that is, one that makes a call to the `range` function to generate indices into the list and uses those indices to solve the problem.


### Examples

~~~py
>>> ans = alphabetical(['aardvark', 'Paris', 'zebra'])
>>> ans
True
>>> ans = alphabetical(['Amber', 'Amsterdam', 'Amsterdam', 'pizza'])
>>> ans
True
>>> ans = alphabetical(['ache', 'acne', 'acute', 'acted'])
>>> ans
False
>>> ans = alphabetical(['Amber', 'Chad', 'Jack', 'JoJo', 'LaRue', 'Annika'])
>>> ans
False
>>> ans = alphabetical(['Ash', 'Jack', 'pizza', 'wine', 'Zanzibar'])
>>> ans
True
>>> ans = alphabetical(['Amber'])
>>> ans
True
>>> ans = alphabetical([])
>>> ans
True
~~~