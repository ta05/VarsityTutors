import random

def password_generator1():
    uppercase = list("ABCDEFGHIJKLMNOPQRSTUVWXYZ")
    lowercase = list("abcdefghijklmnopqrstuvwxyz")
    special_chars = list("<>?!:;/&%")

    num_upper = 4
    num_lower = 4
    num_special = 4

    password = []

    for i in range(num_upper):
        index = random.randint(0, len(uppercase) - 1)
        char = uppercase[index]
        password.append(char)
    
    for i in range(num_lower):
        index = random.randint(0, len(lowercase) - 1)
        char = lowercase[index]
        password.append(char)
    
    for i in range(num_special):
        index = random.randint(0, len(special_chars) - 1)
        char = special_chars[index]
        password.append(char)

    random.shuffle(password)
    return "".join(password)
    
def password_generator2():
    uppercase = list("ABCDEFGHIJKLMNOPQRSTUVWXYZ")
    lowercase = list("abcdefghijklmnopqrstuvwxyz")
    special_chars = list("<>?!:;/&%")

    num_upper = 4
    num_lower = 4
    num_special = 4

    password = []

    for i in range(num_upper):
        index = random.randint(0, len(uppercase) - 1)
        char = uppercase[index]
        password.append(char)
        uppercase.remove(char)
    
    for i in range(num_lower):
        index = random.randint(0, len(lowercase) - 1)
        char = lowercase[index]
        password.append(char)
        lowercase.remove(char)
    
    for i in range(num_special):
        index = random.randint(0, len(special_chars) - 1)
        char = special_chars[index]
        password.append(char)
        special_chars.remove(char)

    random.shuffle(password)
    return "".join(password)

def password_generator3(num_upper, num_lower, num_special):
    uppercase = list("ABCDEFGHIJKLMNOPQRSTUVWXYZ")
    lowercase = list("abcdefghijklmnopqrstuvwxyz")
    special_chars = list("<>?!:;/&%")

    password = []

    for i in range(num_upper):
        index = random.randint(0, len(uppercase) - 1)
        char = uppercase[index]
        password.append(char)
        uppercase.remove(char)
    
    for i in range(num_lower):
        index = random.randint(0, len(lowercase) - 1)
        char = lowercase[index]
        password.append(char)
        lowercase.remove(char)
    
    for i in range(num_special):
        index = random.randint(0, len(special_chars) - 1)
        char = special_chars[index]
        password.append(char)
        special_chars.remove(char)

    random.shuffle(password)
    return "".join(password)


print(password_generator1())
print(password_generator2())
print(password_generator3(5,5,3))