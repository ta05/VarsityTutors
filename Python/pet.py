'''
Write a program that asks the user what pet they have, prints the pet type and the number of pets the user has.
Repeat until the user inputs "rock" as their pet
'''

def pet():
    pet = input("What pet do you have? ")
    count = 0
    while pet != "rock":
        count = count + 1
        print("You have a " + pet + " with a total of " + str(count) + " pet(s)")
        pet = input("What pet do you have? ")

pet()

