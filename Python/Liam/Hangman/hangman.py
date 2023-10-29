import random

def make_matrix(num_rows: int, num_cols: int) -> list[list[int]]:
    return [[random.randint(0, 1) for _ in range(num_cols)] for _ in range(num_rows)]


def even_cols(matrix: list[list[int]]) -> list[int]:
    even_columns = []
    for c in range(len(matrix[0])):
        if sum([matrix[r][c] for r in range(len(matrix))]) % 2 == 0:
            even_columns.append(c)
    return even_columns


def main():
    matrix = make_matrix(4, 4)
    print(matrix)
    print(even_cols(matrix))

if __name__ == "__main__":
    main()



