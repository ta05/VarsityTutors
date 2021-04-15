
f = open("./Chris/Average/data/numbers.txt")
sum = 0
count = 0
for line in f.readlines():
    sum += int(line)
    count += 1
print("Average: " + str(sum/count))