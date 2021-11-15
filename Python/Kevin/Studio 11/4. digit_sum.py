def digit_sum(num):
    total = 0
    num = str(num).replace(".", "")
    multiplier = 1 # represent whether the number is positive or negative
    if num[0] == '-':
        multiplier = -1
        num = num[1:]
    for i in range(len(num)):
        if i == 0:
            total += multiplier * int(num[i])
        else:
            total += int(num[i])
    return total

print(digit_sum(1234))
print(digit_sum(-593.42))