def purchase():
    total = 0
    price = float(input("Enter cost of purchase: "))

    while price != 0:
        total += price
        price = float(input("Enter cost of purchase: "))
    
    print("\nYour purchase total is ${:.2f}".format(total))

purchase()