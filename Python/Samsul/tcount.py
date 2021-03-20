def tcount(s):
    count = 0
    for letter in s:
        if letter.lower() == "t":
            count += 1
    return count


print("The letter 't' appeared in the string {} time(s).".format(tcount("The mitochondria is the powerhouse of the cell.")))
print("The letter 't' appeared in the string {} time(s).".format(tcount("Terrible Toddlers tipped two tall trophies")))