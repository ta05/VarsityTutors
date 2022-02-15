days = int(input("Number of days worked: "))
while days < 1:
    days = int(input("Enter number of days >= 1: "))
salary = 0.01
total = 0

print("\nSalary Earned Each Day\n")

print("Day\tAmount($)")
print("---\t---------")

for day in range(1, days + 1):
    total += salary
    print(f"{day}\t{salary}")
    salary *= 2

print(f"\nTotal pay is ${total:.2f}")
print(f"Average daily wage: ${total/days:.2f}")