import glob

def pair_sum(f):
    file = open(f, 'r')
    target = int(file.readline().strip())
    nums = [int(x.strip()) for x in file.readline().split(',')]
    num_set = {}
    sum_pairs = {}
    for i, num in enumerate(nums):
        if (target - num) not in num_set:
            num_set[num] = i
        else:
            sum_pairs[num] = target - num
    for key in sum_pairs:
        print("{} + {} = {}".format(key, sum_pairs[key], target))
        nums.remove(sum_pairs[key])
        nums.remove(key)
    print(nums)





for f in glob.glob("./Dawit/Sum of Two/data/*.dat"):
    pair_sum(f)

