word = input("Enter a word (blank to stop): ")

largest = smallest = word

while word != "":
    if len(word) > len(largest):
        largest = word
    if len(word) < len(smallest):
        smallest = word
    word = input("Enter a word (blank to stop): ")

print(f"The longest word was {largest} and the smallest word was {smallest}") if len(largest) > 0 else print("No words were entered")