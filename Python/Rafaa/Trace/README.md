# Trace

The goal of this lab is to calculate the trace of a matrix (a 2-D list). In linear algebra the trace of a matrix is defined to be the sum of elements on the main diagonal:

$$
tr\left(\begin{bmatrix}
    5 & 3 & 5 \\
    4 & -1 & 2 \\
    -3  & 8  & 7
\end{bmatrix}\right) = 5 - 1 + 7 = 11
$$

To be more specific, this is how you calculate it mathematically for **n x n** matrices.

$$trace(A) = \sum_{i=1}^n a_{ii} \$$

**Note:** The trace is only defined for a square matrix (**n x n**).

**Function Signature:**
~~~py
def trace(matrix):
    # your code goes here
    return trace_value
~~~

## Task Steps

1. Use the `trace(matrix)` function above.
2. Check if the matrix is square or not (a matrix is square if number of rows equals number of columns)
3. If it is not a square matrix, then return "Trace is only defined for square matrices"
4. Otherwise, calculate the summation over the elements of the main diagonal.

## Examples

- `trace([[2, 4], [4, 6]])` returns `8`
- `trace([[6, 2, 3], [5, 6, 7], [8, 9, 5]])` returns `17`
- `trace([[2, 6, 10, 9], [9, 11, 0, 39], [35, 22, 1, 21]])` prints "Trace is only defined for square matrices"
- `trace([[2, 6, 10, 9], [9, 11, 0, 39], [35, 22, 1, 21], [22, 15, 76, 8]])` returns `22`
