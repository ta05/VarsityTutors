class Roster:

    def __init__(self, roster={}):
        self.roster = roster
        self.commands = {
            "o": self.output_roster,
            "a": self.add_player,
            "r": self.remove_player,
            "u": self.update_rating,
            "c": self.change_number
        }

    def output_roster(self):
        for number in roster:
            print("Jersey number: " + number + ", Rating: " + roster[number])

    def add_player(self, num_players=1):
        if num_players == 1:
            num = input("Enter the new player's number: ")
            rating = input("Enter the new player's rating: ")
            self.roster[num] = rating
        else:
            for i in range(num_players):
                num = input("Enter player {}'s number: ".format(i+1))
                rating = input("Enter the player {}'s rating: ".format(i+1))
                self.roster[num] = rating

    def remove_player(self):
        num = input("Enter the player's number: ")
        self.roster.pop(num)

    def update_rating(self):
        num = input("Enter the player's number: ")
        rating = input("Enter the player's new rating: ")
        self.roster[num] = rating

    def change_number(self):
        num = input("Enter the player's number: ")
        new_num = input("Enter the player's new number: ")
        while new_num in self.roster:
            new_num = input("That number is taken. Enter the player's new number: ")
        self.roster[new_num] = self.roster[num]
        self.roster.pop(num)
    
    def execute(self, choice):
        if choice in self.commands:
            self.commands[choice]()
        else:
            print("Invalid input")

def print_menu():
    print("Welcome to the Team Roster\n\no - output roster\na - add player\nr - remove player\nu - update rating\nc - change number\nq - quit\n")

if __name__ == "__main__":
    ros = Roster()
    ros.add_player(5)
    print_menu()
    choice = input("What would you like to do: ")
    while choice != "q":
        ros.execute(choice)