import csv

pokemon = {}
with open("./file/pokemon_data.csv", 'r') as f:
    csvreader = csv.reader(f)
    next(csvreader)
    for line in f:
        number, name = line.strip().split(',')
        pokemon[int(number)] = name.strip()

gen1 = {}
gen2 = {}
gen3 = {}
gen4 = {}
gen5 = {}
gen6 = {}

for key in pokemon:
    if key <= 151:
        gen1[key] = pokemon[key]
    elif key <= 251:
        gen2[key] = pokemon[key]
    elif key <= 386:
        gen3[key] = pokemon[key]
    elif key <= 494:
        gen4[key] = pokemon[key]
    elif key <= 649:
        gen5[key] = pokemon[key]
    elif key <= 721:
        gen6[key] = pokemon[key]
    else:
        break

print(gen6)