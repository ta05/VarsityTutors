# ArrayResizer

## Task 1

Write the method `isNonZeroRow`, which returns whether all elements in row `r`of a two-dimensional array `array2D` are not equal to zero.  

For example, consider the following statement, which initializes a two-dimensional array.

`int[][] arr = {{2, 1, 0}, {1, 3, 2}, {0, 0, 0}, {4, 5, 6}};`  

Sample calls to `isNonZeroRow are shown below.  

|     **Call to** `isNonZeroRow`      | Description |              Explanation               |
| ----------------------------------- | ----------- | -------------------------------------- |
| `ArrayResizer.isNonZeroRow(arr, 0)` |   `false`   | At least one value in row `0` is zero. |
| `ArrayResizer.isNonZeroRow(arr, 1)` |   `true`    |  All values in row `1` are non-zero.   |
| `ArrayResizer.isNonZeroRow(arr, 2)` |   `false`   | At least one value in row `2` is zero. |
| `ArrayResizer.isNonZeroRow(arr, 3)` |   `true`    |  All values in row `3` are non-zero.   |

Complete the `isNonZeroRow` method.

- **Precondition**: `r` is a valid row index in `array2D`.
- **Postcondition**: `array2D` is unchanged.


## Task 2

Write the method `resize`, which returns a new two-dimensional array containing only rows from `array2D` with all non-zero values. The elements of wach row should appear in the same order as the order in which they appeared in the original array.  

The following code segment initializes a two-dimensional array and calls the `resize` method.  

`int[][] arr = {{2, 1, 0}, {1, 3, 2}, {0, 0, 0}, {4, 5, 6}};`  
`int[][] smaller = ArrayResizer.resize(arr)`  

When the code segment completes, the following will be the contents of `smaller`.  

`{{1, 3, 2}, {0, 0, 0}, {4, 5, 6}}`  

A helper method, `numNonZeroRows`, has been provided for ou. The method returns the number of rows in its two-dimensional array parameter that contain no zero values.  

Complete the `resize` method. Assume that `isNonZeroRow` works as specified.

- **Precondition**: `array2D` contains at least one column and at least one row with no zeros.
- **Postcondition**: `array2D` is unchanged.

