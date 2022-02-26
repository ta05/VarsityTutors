nums = []
for i in range(20):
    num = int(input("Please enter a number: "))
    nums.append(num)

print(f"The lowest number in the list is {min(nums)}\nThe highest number in the list is {max(nums)}")