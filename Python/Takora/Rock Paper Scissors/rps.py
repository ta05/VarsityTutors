import random

def main():
    choice_dict = {1: "Rock", 2: "Paper", 3: "Scissors"}
    cont = True
    while cont:
        user = choice_dict[int(input("Enter 1 for Rock, 2 for Paper, 3 for Scissors: "))]
        computer = choice_dict[random.randint(1, 3)]

        print(f'You chose {user}\nThe computer chose {computer}')

        if user == computer:
            print("It is a tie")
        elif user == "Rock":
            if computer == "Paper":
                print("Computer wins")
            else:
                print("User wins")
                cont = False
        elif user == "Paper":
            if computer == "Scissors":
                print("Computer wins")
            else:
                print("User wins")
                cont = False
        else:
            if computer == "Rock":
                print("Computer wins")
            else:
                print("User wins")
                cont = False
        print("")

if __name__ == "__main__":
    main()