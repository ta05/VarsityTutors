def trace(matrix: list[list[int]]):
    if len(matrix) and (len(matrix) == len(matrix[0])):
        return sum([matrix[i][i] for i in range(len(matrix))])
    print("Trace is only defined for a square matrix")
