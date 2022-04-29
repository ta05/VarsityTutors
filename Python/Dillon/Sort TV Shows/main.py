filename = input("Please enter the filename: ")
infile = open(f"./data/{filename}", "r")
output_keys = {}

key = 0
for line in infile.read().splitlines():
    if line.isdigit():
        key = int(line)
    else:
        if key in output_keys:
            output_keys[key] += [line]
        else:
            output_keys[key] = [line]

infile.close()
output_keys = dict(sorted(output_keys.items()))
print(output_keys)
output_titles = []

outfile = open(f"./data/output_keys.txt", "w")
for key in output_keys:
    outfile.write(f"{key}: {'; '.join(output_keys[key])}\n")
    output_titles += output_keys[key]
outfile.close()

outfile = open(f"./data/output_titles.txt", "w")
output_titles.sort()
for title in output_titles:
    outfile.write(title +"\n")
outfile.close()


