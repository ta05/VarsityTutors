# Array Practice

The last element in each array in a 2D array is incorrect. It's your job to fix each array so that the value 0 is changed to the correct value.

In the first array, the final value should be the length of the 2D array.

In the second array, the final value should be the sum of the lengths of the rows (this is also the total number of elements in `array`).

In the third array, the final value should be the sum of the first and last values in the 2D array.

Create a method called `updateArray(int[][] array, int row, int col, int value)` that sets the `[row][col]` to the correct value. Then, call the `updateArray` method three times - once for each value change that you are supposed to make.

When inputting values to `updateArray`, you will have to hard code the row value, but the column value and the new value should be set so that it will work even if the rows in `array` are modified.

For example, if we wanted to set the value of the second to last index in the first array to the first element in the 2D array, we would write:

~~~
updateArray(array, 0, array[0].length - 2, array[0][0])
~~~