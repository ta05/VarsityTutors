# Lesson 4 - Word Searcher
### Task

1. Greet the user and ask them if they want to enter text, a word to search for, or to exti the program.  

2. Input loop: the user should input a 1 to initiate text entry, 2. to input a word to search for, 0 to exit the program, and any other input should ask them to try again.  

3. Text entry: create a list of all the words and punctuation in the text entered by the user. You MUST remove the punctuation from the words, also storing the punctuation in the list. Assume that there are four punctuation marks that can be used: .,?!  

4. Print text: print the original input sentence from the list of its words and punctuation. No marks will be given if you simply store and reprint the original string. Punctuation must occur immediately without a space before it.  

5. Word searching: count the number of instances there are in the text of a word entered by the user. This MUST be case insensitive (e.g. 'The' and 'the' are two instances of the same word). Print the number of instances of the given word in the format shown in the sample output.  


### Sample Input and Output:

~~~
Welcome to Word Searcher! Enter 1 to type in text to search, 2 to search for a word, 3 to print the current text, or 0 to exit: 1
Type in some text to search: The quick brown fox, jumps over the lazy dog. Why was the dog lazy? I do 
not know!

Enter 1 to type in text to search, 2 to search for a word, 3 to print the current text, or 0 to exit: 2
Type in the word you would like to count: The
There were 3 instances of ' The ' in the input paragraph

Enter 1 to type in text to search, 2 to search for a word, 3 to print the current text, or 0 to exit: lazy
Invalid selection, try again.

Enter 1 to type in text to search, 2 to search for a word, 3 to print the current text, or 0 to exit: 2
Type in the word you would like to count: lazy
There were 2 instances of ' lazy ' in the input paragraph

Enter 1 to type in text to search, 2 to search for a word, 3 to print the current text, or 0 to exit: 3
The quick brown fox, jumps over the lazy dog. Why was the dog lazy? I do not know!

Enter 1 to type in text to search, 2 to search for a word, 3 to print the current text, or 0 to exit: 0
~~~