from statistics import mean

def numsIncreasing() -> None:
    nums = []
    number = input("Please enter a number: ")
    while number != "":
        nums.append(float(number))
        number = input("Please enter a number: ")
    if len(nums) == 0:
        print("No numbers were entered")
    else:
        if nums == sorted(nums):
            print("Numbers were entered in increasing order.")
        else:
            print("Numbers were not entered in increasing order.")


def avgWordLength(file: str) -> float:
    infile = open(file, "r")
    words = infile.read().split()
    infile.close()
    words_length = [len(word) for word in words]
    return mean(words_length)


def wordCounts(words: list[str]) -> dict[str, int]:
    word_count = {}
    for word in words:
        first_letter = word[0].upper()
        word_count[first_letter] = word_count.get(first_letter, 0) + 1
    return word_count
