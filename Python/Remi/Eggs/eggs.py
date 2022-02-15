print("This program will determine the required number of 1-dozen egg cartons.")
eggs = int(input("How many eggs did you collect today? "))

EGGS_PER_CARTON = 12

if eggs < 0:
    print("Your value cannot be negative")

else:
    eggs_in_cartons = eggs // EGGS_PER_CARTON
    eggs_left_over = eggs % EGGS_PER_CARTON
    print("We will pack your {:} egg(s) in {:} carton(s).".format(eggs, eggs_in_cartons))
    print("There will be {:} egg(s) left over.".format(eggs_left_over))