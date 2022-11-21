import csv
import random

def filter_by_word_length(word_dicts: dict, word_length: int, word_type: str) -> list[dict]:
    return [word_dict for word_dict in word_dicts if word_dict["word_length"] == word_length and word_dict["word_type"] == word_type]


def write_word_length_files(unique_word_dicts: list[dict], word_length: int, filename: str) -> None:
    file = csv.writer(filename)
    file.writerow(["word","word_type"])
    for word_dict in unique_word_dicts:
        if word_dict["word_length"] == word_length:
            file.writerow([word_dict["word"], word_dict["word_type"]])


def get_random_word(unique_word_dicts: list[dict]) -> list[dict]:
    return random.choice(unique_word_dicts)["word"]