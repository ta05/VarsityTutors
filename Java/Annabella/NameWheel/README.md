# NameWheel

Write a class for a NameWheel object. The NameWheel class has a 2D String array property called wheel which holds names or null values. The wheel's edges can hold String elements or null. The non-edges always hold null values. Complete the following methods and write a tester class.


**`NameWheel(int size)`**

The `NameWheel` constructor takes in a `size` parameter. Initialize `wheel` as a 2D array of `size` *size* x *size*.


**`boolean contains(String name)`**

Takes in a `name` as a parameter and returns whether the `name` is in the `wheel` matrix.


**`NameWheel add(String name)`**

Takes in a `name` as a parameter and adds the `name` to a null-space on the edge of the `wheel` if there is a null space available. Returns the `NameWheel`.


**`NameWheel add(int row, int col, String name)`**

Takes in a `name`, `row` and `col` as parameters and adds the name to the `wheel` at `wheel[row][col]` if the location is on the edge of the `wheel` and the current value at that position is null. Returns the `NameWheel`.


**`NameWheel remove(String name)`**

Takes in a `name` parameter and removes an element with the same *name* by replacing it with null. If there is no element with the same value, the wheel is unchanged. Returns the `NameWheel`.


**`NameWheel remove(int row, int col)`**

Takes in row and col parameters and removes the element at `wheel[row][col]` by replacing the value with null. Returns the `NameWheel`.


**`String toString()`**

Returns a String where each name within a row is separated by a tab and each row is separated by a new line. null values are replaced with the String "null".

- `wheel` = `{{"B", "T", "E"}, {null, null, "Z"}, {"G", "K", "R"}}`

- `toString()` returns `"B\tT\tE\nnull\tnull\tZ\nG\tK\tR"`


**`NameWheel rotateClockwise()`**

Rotates the elements on the outermost edge of the wheel clockwise and returns `NameWheel`.

- Before `wheel` = `{{"B", "T", "E"}, {null, null, "Z"}, {"G", "K", "R"}}`

- After `wheel` = `{{null, "B", "T"}, {"G", null, "E"}, {"K", "R", "Z"}}`


**`NameWheel rotateCounterClockwise()`**

Rotates the elements on the outermost edge of the wheel counterclockwise and returns `NameWheel`.

- Before `wheel` = `{{"B", "T", "E"}, {null, null, "Z"}, {"G", "K", "R"}}`

- After `wheel` = `{{"T", "E", "Z"}, {"B", null, "R"}, {null, "G", "K"}}`