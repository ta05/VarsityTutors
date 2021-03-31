# Matrices

## Matrix to String

Write a function `mat_to_str` which accepts a list of lists as a parameter and returns the matrix in string form with each row being on a new line

### Examples

- Input: `[[1,2],[3,4],[5,6]]`
- Output: `"1 2 \n3 4 \n5 6\n"`


- Input: `[[4,4,4],[8,8,8],[12,,12,12], [16,16,16]]`
- Output: `"4 4 4 \n8 8 8 \n12 12 12 \n16 16 16 \n"`


- Input: `[[7],[1]]`
- Output: `"7 \n1 \n"`


## Matrix Multiplication

Matrix multiplication is a binary operation that produces a matrix from two matrices. For matrix multiplication, the number of columns in the first matrix must be equal to the number of rows in the second matrix. The resulting matrix, known as the matrix product, has the number of rows of the first and the number of columns of the second matrix.

Write a function which accepts two matrices as parameters and returns their product if possible.

### Examples

- Input: `[[1, 2], [3, 4]]`, `[[5, 6], [7, 8]]`
- Output: `[[19, 22], [43, 50]]`

- Input: `[[1, 2], [3, 4]]`, `[[5, 6, 7], [8, 9, 10]]`
- Output: `[[21, 24, 27], [47, 54, 61]]`

- Input: `[[5, 6, 7], [8, 9, 10]]`, `[[5, 6], [7, 8]]`
- Output: `"The matrices cannot be multiplied"`