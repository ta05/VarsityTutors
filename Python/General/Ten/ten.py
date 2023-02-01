def is_list_mult10(nums: list):
    for num in nums:
        if num % 10 != 0:
            return False
    return True

def is_list_no_mult10(nums: list):
    for num in nums:
        if num % 10 == 0:
            return False
    return True

if __name__ == "__main__":
    f = open("./Ten/data/data.txt", "r")
    for line in f.readlines():
        nums = [int(num) for num in line.split()[1:]]
        print(nums)
        if is_list_mult10(nums):
            print("The list contains all multiples of 10")
        elif is_list_no_mult10(nums):
            print("The list contains no multiples of 10")
        else:
            print("The list contains mixed values")