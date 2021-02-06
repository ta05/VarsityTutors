'''
Write a program that asks the user to input how many numbers they would like to check and loops that number of times asking the user to enter a number
and outputting whether that number is even or odd. After the loop ends, print the number of even and odd numbers entered.
'''

def evenOrOdd():
    check = int(input("How many numbers would you like to check? "))
    even_count = 0
    odd_count = 0

    for _ in range(0, check):
        num = input("Enter number: ")
        if int(num) % 2 == 0:
            print(num + " is an even number.")
            even_count = even_count + 1
        else:
            print(num + " is an odd number.")
            odd_count = odd_count + 1

    print("You entered " + str(even_count) + " even number(s).")
    print("You entered " + str(odd_count) + " odd number(s).")


evenOrOdd()