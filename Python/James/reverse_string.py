def reverse(str):
    res = ""
    for i in range(len(str) - 1, -1, -1):
        res += str[i]
    return res

print(reverse(input("Please enter a string: ")))