def search(elements, low, high, target):
    if low > high:
        return -1
    mid = (high + low) // 2
    if elements[mid] == target:
        return mid
    elif elements[mid] < target:
        return search(elements, mid + 1, high, target)
    else:
        return search(elements, low, mid - 1, target)

my_list = [4,8,12,16,20,24,28,32]
print(search(my_list, 0, len(my_list), 16))
print(search(my_list, 0, len(my_list), 5))
