def keep_half_one(string):
    '''
        Uses the string's built-in step functionality to return a string with
        every other character.
    '''
    return string[::2]

def keep_half_two(string):
    '''
        Iterates through the string and uses the for loop's step functionality to 
        append every other character to a new string.
    '''
    new_string = ""
    for i in range(0, len(string), 2):
        new_string += string[i]
    return new_string

def keep_half_three(string):
    '''
        Uses recursion to recurse through the string and only appending the character
        to a new string every other run of the recursed function
    '''
    return keep_half_three_helper(string, 0, "")

def keep_half_three_helper(string, count, new_string):
    if len(string) == 0:
        return new_string
    elif count % 2 == 0:
        return keep_half_three_helper(string[1:], count + 1, new_string + string[0])
    else:
        return keep_half_three_helper(string[1:], count + 1, new_string)

s1 = "Crib's Boolean"
s2 = "Hannah Montana"
s3 = "Every second letter"
print(keep_half_one(s1))
print(keep_half_one(s2))
print(keep_half_one(s3))
