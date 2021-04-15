sentence = input("Please enter a sentence: ")

for letter in sentence:
    if letter == " ":
        print(" : is a space")
    elif letter.lower() not in ['a', 'e', 'i', 'o', 'u']:
        print("{}: is NOT a vowel".format(letter))