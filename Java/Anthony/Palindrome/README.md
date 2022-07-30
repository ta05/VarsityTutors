# Palindrome

A palindrome is a string like "radar", "racecar", and "abba" that reads the same in either direction. To enable longer palindromes, we can ignore spaces, punctuation, and the cases of the letters. For example:

~~~
"A man, a plan, a canal, Panama!"
~~~

is a palindrome, because if we ignore spaces and punctuation and convert everything to lowercase we get

~~~
"amanaplanacanalpanama"
~~~

which is a palindrome.

Add a static method called `isPalindrome()` that takes a `String` object as a parameter and determines if it is a palindrome, returning `true` if it is and `false` if it is not.

A string of length 1 and an empty string should both be considered palindromes. *Throw* an exception for `null` values.

Although this problem could be solved using recursion or an appropriately constructed loop that manipulates the `String` object directly, **your method must use an instance of one or more of the following collection classes:**
- `Stack`
- `Queue`

**You must not use any other data structure, including arrays or linked lists.** Rather, you should put individual characters from the original string into an instance of one or more of the above collections, and use those collection object(s) to determine if the string is a palindrome.

For full credit, you should:

- Write your method so that spaces, punctuation, and the cases of the letters don't prevent a string from being palindrome. To put it another way, make sure that your method considers characters in the string that are letters of the alphabet and that it ignores the cases of the letters.
- Make your method as efficient as possible. In particular
  - **You should perform only one iteration over the original** `String` **object.** After one iteration, any additional manipulations of the characters should be done using the collection object(s) that you have chosen to use.