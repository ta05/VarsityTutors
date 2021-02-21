# Building your own functions
import math

# Returns Sum
def sum(li):
    sum = 0
    for i in li:
        sum += i
    return sum

# Returns Mean
def mean(li):
    if len(li) > 0:
        return sum(li) / len(li)
    return 0

# Returns Median
def median(li):
    sorted_li = sorted(li)
    if len(sorted_li) % 2 == 0:
        return (sorted_li[int(len(sorted_li)/2 - 1)] + sorted_li[int(len(sorted_li)/2)]) / 2
    return sorted_li[int(len(sorted_li) / 2)]

# Returns Standard Deviation
def stddev(li):
    if len(li) > 0:
        avg = mean(li)
        deviations = list(map(lambda x: (x - avg) ** 2, li))
        return math.sqrt(sum(deviations) / len(li))
    return 0


li = [1, 2, 3, 4]
my_sum = sum(li)
my_mean = mean(li)
my_median = median(li)
my_stddev = stddev(li)

print("Sum: {}".format(my_sum))
print("Mean: {}".format(my_mean))
print("Median: {}".format(my_median))
print("Standard Deviation: {:.3f}".format(my_stddev))