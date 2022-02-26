infile = open("./Tanner/files/mbox.txt", "r")
outfile = open("./Tanner/files/emails_output.txt", "w")
counter_com = 0
counter_org = 0
counter_edu = 0

for line in infile.readlines():
    has_emails = False
    if line.find(".com") != -1:
        counter_com += 1
        has_emails = True
    if line.find(".org") != -1:
        counter_org += 1
        has_emails = True
    if line.find(".edu") != -1:
        counter_edu += 1
        has_emails = True
    if has_emails:
        outfile.write(line)

print(f"There are {counter_com} lines with email addresses ending in .com")
print(f"There are {counter_org} lines with email addresses ending in .org")
print(f"There are {counter_edu} lines with email addresses ending in .edu")
