# Text Analysis

## Background

Text analysis can be a powerful tool to understand your data. There are many machine learning algorithms that use text analysis to infer similarity based on shared properties between a corpus of documents. For this problem, you will do a word count analysis of Martin Luther King Jr.'s "I Have a Dream" speech.

## Task

Read the file speech.txt and count the frequency of each word. To get more meaningful results from our analysis, we want to remove the most commonly used words in the English language. Use common_words.txt to exclude these words from your analysis.

Finally, write out to a file the **twenty** most frequently used words in the order from most to least frequent and the number of times they appear.

## Example Output

~~~
word1 - 20
word2 - 19
word3 - 18
...
~~~

Note that you may have to clean up the speech data (eg. remove whitespace, normalize cases, remove punctuation) so that your data is accurate. For example, you would not want the word "nation", "nation.", "nation's", and "Nation" to be counted differently.