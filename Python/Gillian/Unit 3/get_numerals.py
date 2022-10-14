def get_numerals(word: str) -> str:
    new_word = ""
    for char in word:
        if char.isdigit():
            new_word += char
    return new_word


def main():
    print(get_numerals("A1B2C3D4"))

if __name__ == "__main__":
    main()