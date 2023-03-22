def trace(matrix: list[list[int]]):
    if len(matrix) and (len(matrix) == len(matrix[0])):
        return sum([matrix[i][i] for i in range(len(matrix))])
    print("Trace is only defined for a square matrix")

res = trace([[2, 4], [4, 6]])
if res is not None:
    print(res)

res = trace([[6, 2, 3], [5, 6, 7], [8, 9, 5]])
if res is not None:
    print(res)

res = trace([[2, 6, 10, 9], [9, 11, 0, 39], [35, 22, 1, 21]])
if res is not None:
    print(res)

res = trace([[2, 6, 10, 9], [9, 11, 0, 39], [35, 22, 1, 21], [22, 15, 76, 8]])
if res is not None:
    print(res)