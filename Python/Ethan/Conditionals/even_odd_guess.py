import random

def is_odd(number: int) -> bool:
    return number % 2 == 1


def check_guess(secret_number: int, guess: str) -> bool:
    if is_odd(secret_number):
        return guess == "odd"
    else:
        return guess == "even"


def main():
    guess = input("Guess (even/odd): ")
    secret = random.randint(0, 99)

    print(f"You're right! The secret number {secret} is {guess}." if check_guess(secret, guess) else f"You're wrong! The secret number {secret} is not {guess}.")


if __name__ == "__main__":
    main()