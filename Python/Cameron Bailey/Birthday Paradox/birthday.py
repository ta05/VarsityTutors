import matplotlib.pyplot as plt
import numpy as np

DAYS = np.arange(1,366,1)

def my_party(n):
    birthdays = []
    for _ in range(n):
        birthday = np.random.choice(DAYS)
        if birthday in birthdays:
            return 1
        birthdays.append(birthday)
    return 0


def proportion(number_of_people, run_amount=10000):
    total = 0
    for i in range(run_amount):
        total += my_party(number_of_people)
    return total / run_amount


Birthday_Paradox_for_5 = 1 - (364*363*362*361)/(365**4)


if __name__ == "__main__":
    party_sizes = [5,10,15,20,25,30,35,40,45]
    at_least_two_prob = [proportion(n, 10000) for n in party_sizes]

    plt.plot(party_sizes, at_least_two_prob)
    plt.title('Birthday Paradox')
    plt.xlabel('Size of the Party')
    plt.ylabel('At Least Two')

    plt.show()





