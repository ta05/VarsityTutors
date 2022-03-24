# Recursion

## Question 5

Give a recursive implement to the following functions:

**`count_lowercase(s, low, high)`**: The function is given a string `s` and two indices: `low` and `high` which indicate the range of indices that need to be considered. The function should return the number of lowercase letters at the positions low, low+1, ..., high in `s`.

**`is_number_of_lowercase_even(s, low, high)`**: The function is given a string `s` and two indices: `low` and `high` which indicate the range of the indices that need to be considered. The function should return `True` if there are an even number of lowercase letters at the positions low, low+1, ..., high in `s`, or `False` otherwise.

## Question 6

Give a recursive implement to the following functions:

**`appearances(s, low, high)`**: The function is given a string `s` and two indices: `low` and `high` which indicate the range of indices that need to be considered. The function should return a dictionary that stores a mapping of characters to the number of times they each appear in `s`. That is, the keys of the dictionary should be the different characters in `s` and their associated values should be the number of times each of them appears.

For ecample, the call `appearances("Hello world", 0, 10)` could return `{'H': 1, 'e': 1, 'l': 3, 'o': 2, ' ': 1, 'w': 1, 'r': 1, 'd': 1}`.

**Note**: A dictionary is a mutable object. Use that property to update the dictionary returned from your recursive call.

## Question 7

Give a recursive implement to the following functions:

**`split_by_sign(lst, low, high)`**: The function is given a list `lst` of non-zero integers and two indices: `low` and `high` (`low` <= `high`) which indicate the range of indices that need to be considered. The function should reorder the elements in `lst`, so that all the negative numbers would come before all the positive numbers.

**Note**: The order in which the negative elements are at the end and the order in which the positive are at the end doesn't matter as long as all the negative numbers are before all the positive ones.