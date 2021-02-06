'''
Grandma gives hugs to each of her grandchildren on their birthdays equal to how old they are turning. This year, she is giving out virtual hugs.
Write a program that requests how old the user is turning and prints out that number of virtual hugs ("***HUG***")
'''

def hug():
    age = int(input("How old are you turning? "))

    for _ in range(0, age):
        print("***HUG***")


hug()