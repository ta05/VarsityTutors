from io import TextIOWrapper
import sys


def output(data: list, outfile: TextIOWrapper):
    outfile.write(str(data))


def frequency(text: str) -> dict[str, int]:
    for punc in '.,?!\":':
        text = text.replace(punc, "")
    word_list = text.split()
    word_freq = {}

    for word in word_list:
        if word in word_freq:
            word_freq[word] += 1
        else:
            word_freq[word] = 1
    
    return word_freq


def dict_to_list_of_tuples(d: dict) -> list[tuple]:
    return sorted([(key, d[key]) for key in d], key=lambda x: x[1], reverse=True)


def main():
    infile = open(sys.argv[1], "r")
    outfile = open(sys.argv[2], "w")

    text = infile.read()

    word_frequency = dict_to_list_of_tuples(frequency(text))

    output(word_frequency, outfile)

main()

