from typing import Callable
import math
import matplotlib.pyplot as plt
import numpy as np


def calc_r(deck: list[int], shuffled_deck: list[int]) -> float:
    X, Y = np.array(deck), np.array(shuffled_deck)
    EX, EY, EXY = np.mean(X), np.mean(Y), np.mean(X*Y)

    EX_2, EY_2 = np.mean(X**2), np.mean(Y**2)
    std_X = math.sqrt(EX_2 - EX**2)
    std_Y = math.sqrt(EY_2 - EY**2)

    cov_XY = EXY - EX * EY

    return cov_XY/(std_X*std_Y)

# numpy has built-in correlation coefficient formula
def calc_r_np(deck: list[int], shuffled_deck: list[int]):
    return np.corrcoef(deck, shuffled_deck)


def shuffle(first_half: list[int], second_half: list[int]) -> list[int]:
    shuffled = []
    for x, y in zip(first_half, second_half):
        shuffled.extend([x, y])
    return shuffled

def shuffle_1(deck: list[int]) -> list[int]:
    mid = len(deck) // 2
    return shuffle(deck[:mid], deck[mid:])


def shuffle_2(deck: list[int]) -> list[int]:
    mid = len(deck) // 2
    return shuffle(deck[mid:], deck[:mid])


def run(deck: list[int], shuffle: Callable[[list[int]], list[int]]):
    shuffled_deck = deck
    corr_coeffs = []
    for i in range(15):
        shuffled_deck = shuffle(shuffled_deck)
        corr_coeffs.append(calc_r(deck, shuffled_deck))
    shuffles = np.arange(1, 16)
    plt.plot(shuffles, corr_coeffs)
    plt.show()

deck_1 = list(range(1, 53))
deck_2 = list(range(1, 105))

run(deck_1, shuffle_1)
run(deck_1, shuffle_2)
run(deck_2, shuffle_1)
run(deck_2, shuffle_2)