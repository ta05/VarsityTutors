def remove_capitals(word: str) -> str:
    new_word = ""
    for char in word:
        if not char.isupper():
            new_word += char
    return new_word


def main():
    print(remove_capitals("A1B2C3D4"))
    print(remove_capitals("Georgia Institute of Technology"))

if __name__ == "__main__":
    main()