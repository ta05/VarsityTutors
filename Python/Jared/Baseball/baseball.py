player_stats = {}

choice = input("Would you like to enter a player's stats? (y/n): ")

while choice.lower() not in ["y", "n", "yes", "no"]:
    choice = input("Please select a valid option. Would you like to enter a player's stats? (y/n): ")


while choice.lower() in ["y", "yes"]:
    name = input("\nWhat is the player's name? ")
    bats = int(input(f"How many times did {name} go to bat? "))
    no_hits = int(input(f"How many times did {name} no hit? "))
    singles = int(input(f"How many times did {name} hit a single? "))
    doubles = int(input(f"How many times did {name} hit a double? "))
    triples = int(input(f"How many times did {name} hit a triple? "))
    homeruns = int(input(f"How many times did {name} hit a homerun? "))

    while sum([no_hits, singles, doubles, triples, homeruns]) != bats:
        print("\nThe cumulative number of hit results doesn't equal the number of bats! Please reenter the data")

        bats = int(input(f"\nHow many times did {name} go to bat? "))
        no_hits = int(input(f"How many times did {name} no hit? "))
        singles = int(input(f"How many times did {name} hit a single? "))
        doubles = int(input(f"How many times did {name} hit a double? "))
        triples = int(input(f"How many times did {name} hit a triple? "))
        homeruns = int(input(f"How many times did {name} hit a homerun? "))


    player_stats[name] = {
        "no_hits": no_hits,
        "singles": singles,
        "doubles": doubles,
        "triples": triples,
        "homeruns": homeruns
    }

    choice = input("\nWould you like to enter another player's stats? (y/n): ")

    while choice.lower() not in ["y", "n", "yes", "no"]:
        choice = input("Please select a valid option. Would you like to enter another player's stats? (y/n): ")

print()

for name in player_stats:
    stats = player_stats[name]
    points = stats["singles"] + 2*stats["doubles"] + 3*stats["triples"] + 4*stats["homeruns"]
    print(f"{name} scored {points} point(s)")