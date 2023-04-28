def swap_values(user_val1: int, user_val2: int, user_val3: int, user_val4: int) -> None:
    return user_val2, user_val1, user_val4, user_val3

if __name__ == "__main__":
    user_val1 = int(input("Enter value 1: "))
    user_val2 = int(input("Enter value 2: "))
    user_val3 = int(input("Enter value 3: "))
    user_val4 = int(input("Enter value 4: "))

    user_val1, user_val2, user_val3, user_val4 = swap_values(user_val1, user_val2, user_val3, user_val4)
    print(user_val1, user_val2, user_val3, user_val4)