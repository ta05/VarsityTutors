# Diverse Array

This question involves reasoning about one-dimensional and two-dimensional arrays of integers. You will write three static methods, all of which are in a single enclosing class, named `DiverseArray`. The first method returns the sum of the values of a one-dimensional array; the second method returns an array that represents the sums of the rows of a two-dimensional array; and the third method analyzes row sums.

## arraySum

Write a `static` method `arraySum` that calculates and returns the sum of the entries in a specified one-dimensional array.

- `arraySum([1,3,2,7,3]) returns 16`

## rowSums

Write a `static` method `rowSums` that calculates the sums of each of the rows in a given two-dimensional array and returns these sums in a one-dimensional array. The method has one parameter, a two-dimensional array `mat` of `int` values. The array is in row-major order: `mat[r][c]` is the entry at row `r` and column `c`. The method returns a one-dimensional array with one entry for each row of `mat` such that each entry is the sum of the corresponding row `mat`. As a reminder, each row of a two-dimensional array is a one-dimensional array.  

- `rowSums({1,3,2,7,3}, {10,10,4,6,2}, {5,3,5,9,6}, {7,6,4,2,1}) returns {16,32,28,20}`

## isDiverse

Write a `static` method `isDiverse` that determines whether or not a given two-dimensional array is diverse. The method has one parameter: a two-dimensional array `mat` of `int` values. The method should return `true` if all the row sums in the given array are unique; otherwise, it should return `false`.  

- `isDiverse({1,3,2,7,3}, {10,10,4,6,2}, {5,3,5,9,6}, {7,6,4,2,1}) returns true`
- `isDiverse({1,1,5,3,4}, {12,7,6,1,9}, {8,11,10,2,5}, {3,2,3,0,6}) returns false`