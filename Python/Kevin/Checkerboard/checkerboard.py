def checkerboard(num_rows, num_cols, s1, s2):
    board = []
    for i in range(num_rows):
        row = []
        for j in range(num_cols):
            row.append(s1) if (i + j) % 2 == 0 else row.append(s2)
        board.append(row)
    return board

if __name__ == "__main__":
    num_rows = int(input("Enter the number of ROWS: "))
    num_cols = int(input("Enter the number of COLUMNS: "))

    elem1 = input("Enter the first string: ")
    elem2 = input("Enter the second string: ")

    board = checkerboard(num_rows, num_cols, elem1, elem2)

    for row in board:
        print(row)
    
    print(board)