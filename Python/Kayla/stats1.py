# Using pythons built-in functions

import statistics


a = [1,2,3,4]
# Sum of items in a list
my_sum = sum(a)

# Mean of items in a list
my_mean = statistics.mean(a)

# Median of list
my_median = statistics.median(a)

# Standard Deviation
my_stddev = statistics.pstdev(a)

print("Sum: {}".format(my_sum))
print("Mean: {}".format(my_mean))
print("Median: {}".format(my_median))
print("Standard Deviation: {:.3f}".format(my_stddev))