def rainfall():
    total = 0
    years = input("How many years of rainfall? ")
    for i in range(int(years)):
        print("Year {}".format(i+1))
        for j in range(12):
            rain = float(input("How much rain did you receive this month? "))
            total += rain
    months = int(years) * 12
    print("Number of months: {}".format(months))
    print("Total inches of rainfall: {}".format(total))
    print("Average rainfall: {:.2f}".format(total / months))
    
rainfall()