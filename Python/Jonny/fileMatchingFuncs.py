class Entry:

    def __init__(self, account_num, name, balance, phone, city):
        self.account_num = account_num
        self.name = name
        self.balance = balance
        self.phone = phone
        self.city = city

    def __eq__(self, other):
        return self.account_num == other.account_num and self.name == other.name and self.balance == other.balance and self.phone == other.phone and self.city == other.city


def read_file(filename):
    entries = []
    file = open(filename, "r")
    for line in file.readlines():
        entry = line.split()
        new_entry = Entry(entry[0], entry[1] + " " + entry[2], float(entry[3]), entry[4], entry[5])
        entries.append(new_entry)
    
    file.close()
    return entries


def sorted_file(filename):
    newfile = open("./Jonny/data/sorted_OldMaster.dat", "w")
    entries = read_file(filename)
    entries.sort(key=lambda x: x.account_num)

    write_string = ""

    for e in entries:
        write_string += "{: <12} {: <12} {: <12} {: <12} {: <12}\n".format(e.account_num, e.name, e.balance, e.phone, e.city)
    newfile.write(write_string)
    newfile.close()


def new_master_file(filename):
    entries = read_file("./Jonny/data/sorted_OldMaster.dat")
    transaction_file = open("./Jonny/data/transaction.dat", "r")
    for line in transaction_file.readlines():
        transaction = line.split()
        for i in range(len(entries)):
            if transaction[0] == entries[i].account_num:
                entries[i].balance = round((entries[i].balance + float(transaction[1])) * 100) / 100
                break
    
    transaction_file.close()
    newfile = open("./Jonny/data/newMaster.dat", "w")
    write_string = ""

    for e in entries:
        write_string += "{: <12} {: <12} {: <12} {: <12} {: <12}\n".format(e.account_num, e.name, e.balance, e.phone, e.city)
    newfile.write(write_string)
    newfile.close()


new_master_file("./Jonny/data/oldMaster.dat")


