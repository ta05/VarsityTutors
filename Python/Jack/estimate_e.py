import math

def factorial(n):
    if n == 0 or n == 1:
        return 1
    return n * factorial(n-1)

def estimate_e(terms):
    if terms == 1:
        return 1
    return 1 / factorial(terms - 1) + estimate_e(terms - 1)

if __name__ == "__main__":
    print("This program estimates e using Newton's method")
    print("----------------------------------------------")
    terms = int(input("Enter the number of terms in the estimation: "))
    print("Newton's Estimate = {}".format(estimate_e(terms)))
    print("math.e value = {}".format(math.e))