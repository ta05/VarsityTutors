def reverse(num):
    res = ""
    for i in range(len(num) - 1, -1, -1):
        res += num[i]
    return res

print(reverse(input("Please enter a number: ")))