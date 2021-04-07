num_pass = 0
veg_meals = 1
seats = 3
flight = []

option = "Y"

while option not in ["N", "2"] and num_pass < seats:
    first_name = input("What is your first name? ")
    last_name = input("What is your last name? ")
    meal = input("\nWould you like a vegetarian or standard meal?\n1. Vegetarian\n2. Standard\n")[0].upper()
    if meal == "V" or meal == "1":
        if veg_meals == 0:
            print("The next flight with a vegetarian meal leaves in 4 hours.")
            meal = input("Would you like to take this flight and receive a standard meal or take the next flight and receive a vegetarian meal?\n1. This Flight\n2. Next Flight\n")[0].upper()
            if meal in ["N", "2"]:
                print("You will be put on the next flight")
                option = input("Are there anymore passengers you would like to add to the flight?\n1. Yes\n2. No\n")[0].upper()
                continue
            else:
                print("You will be given a standard meal on this flight")
                meal = "S"
        else:
            veg_meals -= 1
    meal = "S" if meal not in ["V", "1"] else "V"
    num_pass += 1
    flight.append((first_name, last_name, num_pass, meal))
    if num_pass == seats:
        print("All seats are taken. Next flight leaves in 4 hours")
    else:
        option = input("Are there anymore passengers you would like to add to the flight?\n1. Yes\n2. No\n")[0].upper()

print("\n{: <12} {: <12} {: <12} {: <12}".format("First Name", "Last Name", "Seat Number", "Meal"))
for passenger in flight:
    print("{: <12} {: <12} {: <12} {: <12}".format(passenger[0], passenger[1], passenger[2], passenger[3]))

