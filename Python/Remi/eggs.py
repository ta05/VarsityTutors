print("This program will determine the required number of 1-dozen egg cartons.")
eggs = int(input("How many eggs did you collect today? "))

EGGS_PER_CARTON = 12

if eggs < 0:
    print("Your value cannot be negative")

else:
    print("We will pack your {:} egg(s) in {:} carton(s).".format(eggs, eggs//EGGS_PER_CARTON))
    print("There will be {:} egg(s) left over.".format(eggs%EGGS_PER_CARTON))