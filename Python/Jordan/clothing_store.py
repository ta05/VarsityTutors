import math

def cost_shirts(num_shirts):
    return num_shirts * 10 * 0.8

def cost_pants(num_pants):
    return num_pants * 20

def cost_hats(num_hats):
    return math.ceil(num_hats/2) * 5

if __name__ == '__main__':
    shirts = int(input("Enter the number of shirts: "))
    pants = int(input("Enter the number of pants: "))
    hats = int(input("Enter the number of hats: "))
    final_price = cost_shirts(shirts) + cost_pants(pants) + cost_hats(hats)

    print("The final price of {} shirts, {} pants and {} hats is ${:.2f}.".format(shirts, pants, hats, final_price))