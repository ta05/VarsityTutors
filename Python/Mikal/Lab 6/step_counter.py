def feet_to_steps(user_feet: float) -> int:
    return int(user_feet/2.5)

if __name__ == "__main__":
    user_feet = float(input("Enter feet walked: "))
    user_steps = feet_to_steps(user_feet)
    print(user_steps)
