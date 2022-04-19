import random

neg_count = 0
ls = []

for _ in range(40):
    num = random.uniform(-50, 50)
    if num < 0:
        neg_count += 1
        ls.append(round(num, 2))

print(ls)
print(f"There are {neg_count} negative numbers in the list.")