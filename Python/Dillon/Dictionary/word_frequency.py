def total_word_count(string: str) -> int:
    return len(string.split())


def unique_word_count_ignore_case(string: str) -> int:
    words = [word.lower() for word in string.split()]
    return len(set(words))


def word_frequency_ignore_case(string: str) -> dict[str, int]:
    word_freq = {}
    for word in string.split():
        word = word.lower()
        if word in word_freq:
            word_freq[word] += 1
        else:
            word_freq[word] = 1
    return word_freq


def print_frequencies(words: dict[str, int], value: int):
    num_items = 0
    for word in words:
        if words[word] > value:
            print("{:<10}\t{:}\t".format(word + ":", words[word]), end='')
            num_items += 1
            if num_items % 2 == 0:
                print("")


if __name__ == "__main__":
    string = "The governing wisdom about writing sentences says not to repeat. Repetition is bad. Repetition is sloppy. Writers are encouraged to consult a thesaurus and change up that pesky offending word. But is this really true? Literature is full of repetition. Literary writers constantly use the literary device of repeated words. I think the only type of repetition which is bad is sloppy repetition. Repetition which is unintentional, which sounds awkward. If you repeat on purpose, repetition is gorgeous. I mean, think about music. Music is all about repetition and patterns. If you didn't have repetition in music, it would all just be noise"
    for punc in ".,?!":
        string = string.replace(punc, "")
    words = word_frequency_ignore_case(string)

    print_frequencies(words, 2)