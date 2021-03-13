def roll_two(x, y):
    if x == y:
        return "YOU WIN"
    elif (x + y) % 2 == 0:
        return x + y
    else:
        return x * y

print(roll_two(4, 5))
print(roll_two(2, 2))
print(roll_two(7, 9))
print(roll_two(6, 1))