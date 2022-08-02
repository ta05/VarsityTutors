import random

def main():
    print("Welcome to the guessing game!\n")

    answer = random.randint(1,10)
    my_guesses = set()

    guess = int(input("Guess a number between 1 and 10: "))

    while guess != answer:
        if guess in my_guesses:
            guess = int(input("You've already guessed that number. Guess a different number: "))
        else:
            my_guesses.add(guess)
            if guess < answer:
                guess = int(input("Your guess was too low. Guess a higher number: "))
            else:
                guess = int(input("Your guess was too high. Guess a lower number: "))
    my_guesses.add(guess)
    print(f"Correct! You guessed the number in {len(my_guesses)} guess(es)!")

if __name__ == "__main__":
    main()
