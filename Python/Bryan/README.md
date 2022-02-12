# Caesar Cipher

## Introduction

The Caesar cipher is one of the earliest known and simplest ciphers. It is a type of substitution cipher in which each letter in a plaintext message is 'shifted' a certain number of places down the alphabet. For example, with a shift of 1, A would be replaced by B, B would become C, and so on.

## Task

Implement a function called `caesarcipher`. This function accepts three parameters: a string called `message`, a boolean called `encode` and an integer representing the `shift`. The string may be empty. The boolean must be `True` or `False`. The integer representing the shift may be positive or negative.  

The `caesarcipher` function must shift each alphanumberic character in the message the specified number of places. Do not shift characters that are not letter [a-z]. [A-z] or digits [0-9]. Letters must only consider letters when shifting, i.e., shifting a 'Z' two places in the positive direction, replaces the 'Z' with a 'B'. Shifting an 'a' three places int he negative direction replaces the 'a' with an 'x'. Numbers must only consider numbers when shifting, i.e., shifting '0' ten places in the positive direction replaces the '0' with a '0'. Shifting '0' eleven places in the positive direction replaces the '0' with a '1'.  

The function must return the string's cipher.  

Note that the opposite must be done if the boolean called `encode` is set to `False`. If it is set to `False`, you must decode the cipher. Shift the letters and digits appropriately to discover and return the hidden message.