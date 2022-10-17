# Array Assignment

## CopyRange

### Task

Write the method `copyRange` that takes an array fo Strings as a parameter, and the start and end position of the elemenst in the array to copy. If either the start or end positions are not valid positions in the array, return the original array. Otherwise, return an array made up of the elements in the original array from the given start position to the end position.

### Sample Inpus and Outputs

- `copyRange({"1","2","3","4","5"}, 2, 4)` -> `{"3","4","5"}`
- `copyRange({"1","2","3","4","5"}, 4, 8)` -> `{"1","2","3","4","5"}`


## middleTwo

### Task

Write the method `middleTwo` that takes in a String and returns a String array that holds the middle character(s) of the String. If the String has an even length, return an array of length 2 that holds the middle two characters. If the String has an odd length, return an array of length 1 that holds the middle character. If the String is empty, return an array of size 0.


## allHaveAT

### Task

Write the method `allHaveAT` that takes in a String array and returns true if all the Strings have a "t" and false otherwise.


## allBefore

### Task

Write the method `allBefore` that takes two String arrays and returns true if each element in the first array comes before the corresponding element in the second array and false otherwise.

### Sample Inputs and Outputs

- `allBefore({"home", "Halloween", "costume"}, {"trip", "July 4", "fireworks"})` -> true


## bookEnds

### Task

Write the method `bookEnds` that takes an array of integers and returns the number of elements that have a 1 in both the preceding and succeeding positions.

### Sample Inputs and Outputs

- `bookEnds({1,2,1,3,3,1,3,1,4,4})` -> 2