def binary__search(arr: list, target):
    low = 0
    high = len(arr) - 1
    while low <= high:
        mid = int((high + low) / 2)
        if target == arr[mid]:
            return mid
        elif target > arr[mid]:
            low = mid + 1
        else:
            high = mid - 1
    return -1

def two_sum(num_list: list, target_sum: int):
    sorted_list = sorted(num_list)
    for i in range(len(num_list)):
        complement = target_sum - sorted_list[i]
        j = binary__search(sorted_list, complement)
        if j != -1 and j != i:
            res = [num_list.index(sorted_list[i]), num_list.index(sorted_list[j])]
            res.sort()
            return res
    return "No two sum found"

print(two_sum([2, 8, 12, 15], 20))
print(two_sum([8, 7, 2, 5, 3, 1], 20))
print(two_sum([8, 7, 2, 5, 3, 1], 10))
