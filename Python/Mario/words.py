from prettytable import PrettyTable

fhandle = open("./Mario/text/test.txt", "r")

text = fhandle.read()

punctuation = ".?;:\"()-,!"

for char in punctuation:
    text = text.replace(char, "")

words = text.split()

word_frequency = {}

for word in words:
    word = word.lower()
    if word in word_frequency:
        word_frequency[word] += 1
    else:
        word_frequency[word] = 1

table = PrettyTable()
table.field_names = ["Word", "Count"]
for word in word_frequency:
    table.add_row([word, word_frequency[word]])

print(table)

