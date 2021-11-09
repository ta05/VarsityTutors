# ArrayResizer

## Task 1

Write the method `isNonZeroRow`, which returns whether all elements in row `r`of a two-dimensional array `array2D` are not equal to zero.  

For example, consider the following statement, which initializes a two-dimensional array.

int[][] arr = {{2, 1, 0}, {1, 3, 2}, {0, 0, 0}, {4, 5, 6}};  

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