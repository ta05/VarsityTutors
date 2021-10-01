word = input("Enter a word ")
vowels = set()

for letter in word:
    letter = letter.lower()
    if letter not in vowels and letter in "aeiou":
        vowels.add(letter)
    if len(vowels) == 5:
        break
print(word, "is a vowel word") if len(vowels) == 5 else print(word, "is not a vowel word")