def create_word_list(text: str) -> list[str]:
    word_list = []
    word = ""
    for char in text:
        if char == " ":
            if word != "":
                word_list.append(word)
                word = ""
        elif char in ",.?!":
            word_list.append(word)
            word_list.append(char)
            word = ""
        else:
            word += char
    return word_list

def count_word(word_list: list[str], target: str):
    count = 0
    for word in word_list:
        if word.lower() == target.lower():
            count += 1
    return count

def print_text(word_list: list[str]):
    text = ""
    for word in word_list:
        if word in ".,?!":
            text += word
        else:
            text += " " + word
    print(text.strip())

if __name__ == "__main__":
    choice = input("Welcome to Word Searcher! Enter 1 to type in text to search, 2 to search for a word, 3 to print the current text, or 0 to exit: ")

    while choice != "0":
        if choice == "1":
            text = input("Type in some text to search: ")
        elif choice == "2":
            target = input("Type in the word you would like to count: ")
            count = count_word(create_word_list(text), target)
            print(f"There were {count} instances of \' {target} \' in the input paragraph")
        elif choice == "3":
            print_text(create_word_list(text))
        else:
            print("Invalid selection, try again.")
        choice = input("\nEnter 1 to type in text to search, 2 to search for a word, 3 to print the current text, or 0 to exit: ")