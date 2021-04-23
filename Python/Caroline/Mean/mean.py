def mean_all(matrix):
    sum = 0
    count = 0
    for row in matrix:
        for value in row:
            sum += value
        count += len(row)
    average = sum/count if count != 0 else 0
    print("The average of the values in the matrix: {:.2f}".format(average))


def mean_row(matrix):
    mean_list = []
    for row in matrix:
        sum = 0
        for value in row:
            sum += value
        count = len(row)
        mean_list.append(sum / count if count != 0 else 0)
    print("The average of each row:\n{}".format(mean_list))


def mean_col(matrix):
    mean_list = []
    for c in range(len(matrix[0])):
        sum = 0
        for r in range(len(matrix)):
            sum += matrix[r][c]
        count = len(matrix)
        mean_list.append(sum / count if count != 0 else 0)
    print("The average of each column:\n{}".format(mean_list))


list_of_lists = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12]
]

mean_all(list_of_lists)
mean_row(list_of_lists)
mean_col(list_of_lists)