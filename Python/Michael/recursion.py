def split_array(nums):
    nums.sort(reverse=True)
    return split_array_helper(nums, 0, 0, 0)

def split_array_helper(nums, index, left, right):
    if index == len(nums):
        return left == right
    elif left < right:
        return split_array_helper(nums, index + 1, left + nums[index], right)
    else:
        return split_array_helper(nums, index + 1, left, right + nums[index])


def split_array_odd10(nums):
    return sum(nums) % 2 == 1

def split_array_53(nums):
    return split_array_53_helper(nums, 0, 0, 0)

def split_array_53_helper(nums, index, threes, fives):
    if index == len(nums):
        return threes == fives
    elif nums[index] % 5 == 0:
        fives += nums[index]
    elif nums[index] % 3 == 0:
        threes += nums[index]
    else:
        return split_array_53_helper(nums, index + 1, threes + nums[index], fives) or split_array_53_helper(nums, index + 1, threes, fives + nums[index])
    return split_array_53_helper(nums, index + 1, threes, fives)