def character_count():
    sentence = input("Enter a sentence")
    character = input("Enter a character to be counted")
    freq = {character: 0}
    for char in sentence:
        if char == character:
            freq[character] += 1
    print(freq[character])

character_count()