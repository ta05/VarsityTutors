import re

# Function 1
def clean_word(word: str) -> str:
    """
    Makes a cleaned word by making letters lowercase and removes non-alphabetic characters

    Parameters
    ----------
    word: argument (str)

    Returns: cleaned word
    """
    return re.sub(r'[^a-zA-Z]', '', word).lower()

# Function 2
def clean_word_list(words: list[str]) -> str:
    """
    Accepts list of uncleaned words and cleans and alphabetically sorts words

    Parameters
    ----------
    words: multiple words as list

    Returns alphabetically ordered cleaned words
    ----------
    """

    return sorted([clean_word(word) for word in words])

def main():
    print(clean_word_list(["Hello9!", "By3E"]))


if __name__ == "__main__":
    main()