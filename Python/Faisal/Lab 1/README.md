# Problems

## Problem 1

Write a function `numIncreasing` that collects numbers from the user. On each line, the user is prompted for a number. All numbers are collected and the user types enter/return to stop collecting. The funciton then prints a message depending on whether or not the inputed numbers were entered in increasing order. If no numbers were entered (enter/return on first line), the function prints a message saying that no numbers were entered (see below). Hint: the function `sorted` is very useful here, it accepts a list as an argument and returns a copy of that list in increasing order. Try it out on the shell first.

### Sample

~~~
>> numsIncreasing()
Please enter a number: -12
Please enter a number: 0
Please enter a number: 99.3
Please enter a number:
Numbers were entered in increasing order. 
>> numsIncreasing()
Please enter a number: 123
Please enter a number: 28
Please enter a number: 999
Please enter a number:
Numbers were not entered in increasing order. 
>> numsIncreasing()
Please enter a number: 
No numbers were entered
~~~


## Problem 2

Write a function `avgWordLength` that accepts one argument, the name of an input text file. The file conrains words that are spearated by spaces and/or newline characters (i.e. on multiple lines). The function then **returns** the average length of the words contained in the file. Don't forget to close the input file after you are done reading it.

### Sample

~~~
>> avgWordLength('words1.txt')
5.0
>> avgWordLength('words2.txt')
5.666666666666667
>> avgWordLength('words1.txt') == 5.0
True
~~~


## Problem 3

Implement a function `wordCounts` that accepts one argument, a list of words. The function then **returns** a dictionary whose keys are capitalized letters, and whose values are the **number of words** that start with that letter (capitalized or not). The keys should occur in the order that they are encountered in the list.

### Sample

~~~
>> wordCounts(['apple', 'orange', 'apricot', 'lemon'])
{'A': 2, 'O': 1, 'L': 1}
>> wordCounts(['MOUSE', 'bear', 'moose', 'BuFFalo', 'mastodon'])
{'M': 3, 'B': 2}
>> wordCounts(['print', 'or', 'return'])=={'P': 1, 'O': 1, 'R': 1}
True
~~~