def search(elements, target):
    for i in range(len(elements)):
        if elements[i] == target:
            return i
    return - 1

my_list = [4,8,12,16,20,24,28,32]
print(search(my_list, 16))
print(search(my_list, 5))