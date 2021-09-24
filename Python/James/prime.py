def is_prime(num):
    if num == 0 or num == 1:
        return str(num) + " is not prime."
    return str(num) + " is prime." if is_prime_helper(num, 2) else str(num) + " is not prime."

def is_prime_helper(num, divisor):
    if divisor > num // 2:
        return True
    if num % divisor == 0:
        return False
    return is_prime_helper(num, divisor + 1)

print(is_prime(int(input("Please enter a number: "))))