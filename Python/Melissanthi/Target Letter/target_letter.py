def calculate(phrase: str, limit: int) -> str:
    '''
    Given the string parameter phrase and the 
    integer parameter limit, return a string
    of numbers explained in the problem statement.
    '''
    
    alphabet = "abcdefghijklmnopqrstuvwxyz"
    word_list = phrase.lower().split()
    target = ""
    for word in word_list:
        if (word[0] in alphabet[:limit] and word[1] in alphabet[:limit]) and (word[-1] in alphabet[-limit:] and word[-2] in alphabet[-limit:]):
            target = word
            break
    if target == "":
        target = word_list[-1]
    target_letter = target[0]
    return " ".join([str(word.index(target_letter)) if target_letter in word else "-1" for word in word_list])


def main():
    phrase = "horticultural hospitalities improbability kindheartedly"
    print(calculate(phrase, 20))


if __name__ == "__main__":
    main()
