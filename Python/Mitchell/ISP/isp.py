def calc_charges(discount, hours):
    price_A = discount * (9.95 + 2 * max(hours - 10, 0))
    price_B = discount * (14.95 + 1 * max(hours - 20, 0))
    price_C = discount * 19.95
    return (price_A, price_B, price_C)

package_list = ['A', 'B', 'C']
package = input("Enter the package (A, B or C): ")
hours = int(input("Enter the number of hours used: "))
nonprofit = input("Are you a nonprofit (y/n): ")

discount = 0.8 if nonprofit.lower() == 'y' else 1

charges = calc_charges(discount, hours)
my_charge = charges[package_list.index(package)]

if package in package_list:
    print("Your charge for {} hours on package {} is ${:.2f}".format(hours, package, my_charge))

    for i in range(len(package_list)):
        if package < package_list[i] and charges[i] < my_charge:
            print("You would have saved ${:.2f} with package {}".format(my_charge - charges[i], package_list[i]))