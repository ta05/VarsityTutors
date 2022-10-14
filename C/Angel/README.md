# Rotate 13

## Background

Rot-13 (rotate-13) is a simple substitution cipher in which each letter is encoded by the letter appearing 13 spaces later (or earlier) in the alphabet. 'A' becomes 'N', 'M' becomes 'Z', 'N' becomes 'A' and 'Z' becomes 'M'. Because 13 is half the number of letters in the alphabet, we use the same substitution for ciphering and deciphering. That is, applying rot-13 twice to a text yields the original text.

## Task

Write a program `rot13` that encodes its argument using rot-13 and prints the results followed by a newline character. You may assume that rot13 will receive exactly 1 argument, but it is good practice to check whether the number of arguments is correct. Only scenarios with one argument may be tested. Note that rot-13 only affects alphabetical characters. All non-alphabetical characters (punctuation, whitespace, etc.) Must be printed unchanged. Note also that arguments may be empty strings.