# Palindrome Search

A palindrome is a word, phrase or sequence that reads the same forwards and backwards. Write a PalindromeSearch class that accepts a String *word* as a parameter in its constructor, implement the following methods and tests them in a main method.

## isPalindrome

Checks whether *word* is an exact palindrome. Returns true if the word is a palindrome and false if not.

## isNearlyPalindrome

Checks whether *word* would be a palindrome if case-sensitivity and spaces are ignored. Returns true if the word is nearly a palindrome and false if not.

## isOffByOnePalindrome

Checks whether *word* would be a palindrome if a single character were removed. Returns true if the word is a palindrome off by one character and false if not.

## findOffByOneLetterIndex

If *word* isOffByOnePalindrome finds and returns the index of the character that if removed would make the word a palindrome.

## convertToPalindrome

- If *word* is a palindrome, return the word
- Otherwise, if *word* is nearly a palindrome, return the word converted to a palindrome by removing spaces and ignoring case.
- Otherwise, if *word* is a palindrome off by one, return the word converted to a palindrome by removing the offending character.
- Otherwise return null.