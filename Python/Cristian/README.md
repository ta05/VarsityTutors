# Problem 5

**Write a program.** Assume that you work as an analyst and need to check text files for possible plagiarism. Your program should read files, parse lines into words and check words for similarity. The program should output how many words are the same. For example, it can output the following message:

~~~
The 10 common word(s) are: {'spill', 'and', 'is', 'even', 'to', 'oil', 'a', 'can', 'no', 'cause'}
~~~

The content of file1.txt

~~~
there is no such thing as a good oil spill if the time and place are
just right even a small oil spill can cause damage to sensitive ecosystems
~~~

The content of file2.txt

~~~
no oil spill is entirely benign depending on timing and location even
a relaitvely minor spill can cause significant harm to individual organisms
and entire populations
~~~

**Hint**: Use sets and set operations!  

If you have difficulty to work with files, you can write a program without file handlers (use strings) for partial credit.