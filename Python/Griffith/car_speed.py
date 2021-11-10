car_num = 1
done = False

while not done:
    dist = float(input("Enter the miles driven by car {}: ".format(car_num)))
    time = float(input("Enter the number of hours it took {} to drive that distance: ".format(car_num)))

    speed = dist/time

    print("\nCar {} traveled at {} MPH".format(car_num, speed))

    cont_prompt = input("\nWould you like to calculate the speed of another car (type \"Yes\" or \"No\")? ")
    if cont_prompt.lower() == "no":
        done = True
    else:
        car_num += 1
    print("")
print("Have a nice day!")