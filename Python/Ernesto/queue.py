list1 = [1, [2, 3], 4]
stack = list1.copy()
queue = []
while stack:
    item = stack.pop(0)
    if type(item) is list:
        for e in item:
            queue.append(e)
    else:
        queue.append(item)
print(sum(queue))