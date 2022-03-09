list1 = [1, [2, 3], 4]
stack = list1.copy()
result = 0
while stack:
    item = stack.pop(0)
    if type(item) is list:
        for e in item:
            result += e
    else:
        result += item
print(result)