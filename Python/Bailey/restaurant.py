def get_menu_choice():
    curr_capacity = 0

    print("What would you like to choose:")

    while True:
        choice = input("\n(1). Add Party to queue.\n(2). Add VIP to queue.\n(3). Seat Party.\n(4). Clear Table.\n(5). Remove Party.\n(6). Print Waiting.\n(7). Print Seated.\n(8). Exit.\n\n")
        print("")
        if choice == '1' or choice.lower().startswith("add party"):
            add_party()
        elif choice == '2' or choice.lower().startswith("add vip"):
            add_vip()
        elif choice == '3' or choice.lower().startswith("seat"):
            curr_capacity = seat_party(curr_capacity)
        elif choice == '4' or choice.lower().startswith("clear"):
            curr_capacity = clear_table(curr_capacity)
        elif choice == '5' or choice.lower().startswith("remove"):
            remove_party()
        elif choice == '6' or choice.lower().startswith("print waiting"):
            print_waiting()
        elif choice == '7' or choice.lower().startswith("print seated"):
            print_seated()
        elif choice == '8' or choice.lower().startswith("exit"):
            return
        else:
            print("Unknown choice")
    

def add_party():
    name = input("What is your name? ")
    party = int(input("How large is your party? "))
    waiting.append((name, party))

def add_vip():
    name = input("What is your name? ")
    party = int(input("How large is your party? "))
    vip_waiting.append((name, party))

def seat_party(capacity):
    if len(vip_waiting) > 0:
        if vip_waiting[0][1] > max_capacity - capacity:
            print("Not enough seats available.")
        else:
            capacity += vip_waiting[0][1]
            seated.append(vip_waiting.pop(0))
    else:
        if waiting[0][1] > max_capacity - capacity:
            print("Not enough seats available.")
        else:
            capacity += waiting[0][1]
            seated.append(waiting.pop(0))
    return capacity

def clear_table(capacity):
    name = input("Which party is finished eating? ")
    for i in range(len(seated)):
        if name in seated[i][0]:
            capacity -= seated[i][1]
            seated.pop(i)
            return capacity
    print("No customer by that name is seated.")
    return capacity

def remove_party():
    name = input("Which customer would like to leave? ")
    for i in range(len(vip_waiting)):
        if name in vip_waiting[i][0]:
            vip_waiting.pop(i)
            return
    for i in range(len(waiting)):
        if name in waiting[i][0]:
            waiting.pop(i)
            return
    print("No customer by that name is waiting.")


def print_waiting():
    print("People who are waiting:")
    for customer in vip_waiting:
        print("   VIP {} party of {}".format(customer[0], customer[1]))
    for customer in waiting:
        print("   {} party of {}".format(customer[0], customer[1]))

def print_seated():
    print("People who are seated:")
    for customer in seated:
        print("   {} party of {}".format(customer[0], customer[1]))

if __name__ == "__main__":
    max_capacity = int(input("What is the restaurant's capacity? "))
    waiting = []
    vip_waiting = []
    seated = []

    get_menu_choice()
        