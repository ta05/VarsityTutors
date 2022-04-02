def clean_up(text: str) -> str:
    punctuation = "\".,?!”“"
    for punc in punctuation:
        text = text.replace(punc, "")
    text = text.replace("—", " ")
    return text


if __name__ == "__main__":
    speech_file = open("./infiles/speech.txt", "r", encoding="utf-8")
    common_file = open("./infiles/common_words.txt", "r")
    most_freq_file = open("./outfiles/output.txt", "w")

    common_words = common_file.read().splitlines()
    speech = speech_file.read()

    common_file.close()
    speech_file.close()

    speech = clean_up(speech)
    speech_words = speech.split()

    word_count = {}

    for word in speech_words:
        word = word.lower()
        if word in common_words:
            continue
        elif word in word_count:
            word_count[word] += 1
        else:
            word_count[word] = 1

    word_count = dict(sorted(word_count.items(), key=lambda x: x[1], reverse=True)[:20])

    for word in word_count:
        most_freq_file.write(f"{word} - {word_count[word]}\n")

    most_freq_file.close()

