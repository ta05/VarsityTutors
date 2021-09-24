num_rows = int(input("Enter the number of rows in the theater: "))
num_cols = int(input("Enter the number of seats per row: "))

seat_cols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

print()

for i in range(num_rows):
    for j in range(num_cols):
        print(str(i + 1) + seat_cols[j], end=" ")
