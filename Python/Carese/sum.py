'''
Write a program that continues to request the user for a number input and keeps track of the sum until the sum exceeds 100
After, print the sum and the number of numbers entered in by the user
'''

def sum():
    sum = 0
    count = 0

    while sum <= 100:
        num = int(input("Enter a number: "))
        sum = sum + num
        count = count + 1

    print("Sum: {}".format(sum))
    print("Numbers Entered: {}".format(count))

sum()