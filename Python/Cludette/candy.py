num_candy = int(input("Please enter the number of candy bars: "))

candy_bars = []

for i in range(num_candy):
    candy_bar = input("Please enter the ingredients in the candy bar separated by spaces:\n").split()
    candy_bars.append(candy_bar)

allergies = input("Please enter the ingredients Michael is allergic to separated by spaces:\n").split()

num_can_eat = 0
for bar in candy_bars:
    for ingredient in allergies:
        if ingredient in bar:
            break
        if ingredient == allergies[-1]:
            num_can_eat += 1

print(f"Michael can eat {num_can_eat} candy bar(s)")
