'''
Write a program that requests the user for their name, and prints out a greeting "Nice to meet you NAME".
Repeat this until the user types in "Nope"
'''

def name():
    name = input("Please Enter a name: (Nope to end) ")
    while name != "Nope":
        print("Nice to meet you {}".format(name))
        name = input("Please Enter a name: (Nope to end) ")

name()