word = "philip"

print("The word is defined to be the characters:\n")
for letter in word:
    print(letter)
print("---------------------------")
print("\nIn reverse, the characters are:\n")
for i in range(len(word) - 1, -1, -1):
    print(word[i])