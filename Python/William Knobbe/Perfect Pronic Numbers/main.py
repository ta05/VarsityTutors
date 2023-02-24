import math

def is_perfect(n: int) -> bool:
    divisors = [i for i in range(1, n) if n % i == 0]
    return sum(divisors) == n


def is_pronic(n: int) -> bool:
    for i in range(1, math.ceil(math.sqrt(n))):
        if i * (i + 1) == n:
            return True
    return False


def pronic_and_perfect(n: int) -> None:
    if is_perfect(n):
        print(f"{n} is perfect.")
    else:
        print(f"{n} is not perfect.")
    if is_pronic(n):
        print(f"{n} is pronic.")
    else:
        print(f"{n} is not pronic.")


def main():
    num = int(input("Enter an integer: "))
    pronic_and_perfect(num)


if __name__ == "__main__":
    main()
