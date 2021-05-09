import random
import string

digits = string.digits
lowercase = string.ascii_lowercase
uppercase = string.ascii_uppercase
symbols = string.punctuation

num_lowercase = int(input("How many lowercase characters would you like in your new password? "))
num_uppercase = int(input("How many uppercase characters would you like in your new password? "))
num_digits = int(input("How many digits would you like in your new password? "))
num_symbols = int(input("How many symbols would you like in your new password? "))

new_password = []
for i in range(num_lowercase):
    new_password.append(random.choice(lowercase))
for i in range(num_uppercase):
    new_password.append(random.choice(uppercase))
for i in range(num_digits):
    new_password.append(random.choice(digits))
for i in range(num_symbols):
    new_password.append(random.choice(symbols))

random.shuffle(new_password)

print("Your new password is " + "".join(new_password))

