def convert(num, base):
    if num == 0:
        return "0"
    output = ""
    is_negative = False
    if num < 0:
        is_negative = True
        num = -num
    n = 0
    while num >= base ** n:
        n += 1
    for i in range(n, -1, -1):
        output += str((int)(num / (base ** i)))
        num %= (base ** i)
    return "-" + output[1:] if is_negative else output[1:]

print(convert(-44, 2))
print(convert(95, 6))
print(convert(120, 10))
print(convert(120, 5))