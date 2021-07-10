def count_evens(filename):
    f = open(filename, "r")
    count = 0
    evens = []
    for line in f.readlines():
        line = line.strip()
        if line == "START":
            count = 0
        elif line == "END":
            evens.append(count)
        elif int(line) % 2 == 0:
            count += 1
    return evens

print(count_evens("./Karim/files/nums.txt"))