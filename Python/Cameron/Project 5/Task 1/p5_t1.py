
text = ""

while "!" not in text:
    user_input = input("Enter text: ")
    text += user_input

letter_freq = {}

for letter in text:
    letter = letter.lower()
    if not letter.isalpha():
        letter = "Other"
    if letter in letter_freq:
        letter_freq[letter] += 1
    else:
        letter_freq[letter] = 1

max_freq = 0
max_char = []
vowel_count = 0
consonant_count = 0
for key in letter_freq:
    print("Count of {} is {}".format(key, letter_freq[key]))
    if key in ["a", "e", "i", "o", "u"]:
        vowel_count += letter_freq[key]
    else:
        consonant_count += letter_freq[key]
    if letter_freq[key] > max_freq:
        max_freq = letter_freq[key]
        max_char = [key]
    elif letter_freq[key] == max_freq:
        max_char.append(key)
print("Vowel count is {}".format(vowel_count))
print("Consonant count is {}".format(consonant_count))
print("Max values:\n{}".format(" ".join(max_char)))





