def print_format(data):
    print("{:<20}{:<7}{:<6}{:<8}".format("Name", "Amount", "Items", "Total"))
    for row in data:
        record = row.split(';')
        name = record[0][0:4]
        amount = float(record[1])
        quantity = int(record[2])
        total = amount * quantity
        print("{:<20}{:>6.2f}{:>6}{:>8.2f}".format(name, amount, quantity, total))

def scan_for(filename, word):
    file = open(filename, 'r')
    text = file.read()
    file.close()
    punctuation = '.,;!?'
    for punct in punctuation:
        text = text.replace(punct, '')
    words = text.split()
    freq = words.count(word)
    print("The word {} appears {} time(s) in {}".format(word, freq, filename))

def calc_tax(in_filename, out_filename):
    in_file = open(in_filename, 'r')
    out_file = open(out_filename, 'w')
    for line in in_file.readlines():
        line = line.strip()
        entry = line.split()
        amount = float(entry[1])
        rate = float(entry[2])
        tax = "{:.2f}\n".format(amount * rate)
        out_file.write(tax)
    in_file.close()
    out_file.close()