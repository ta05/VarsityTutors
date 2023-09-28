def calculate_total_value(pennies: int, nickels: int, dimes: int, quarters: int, ones: int, fives: int, tens: int, twenties: int, fifties: int, hundreds: int) -> float:
    return 0.01 * pennies + 0.05 * nickels + 0.1 * dimes + 0.25 * quarters + ones + 5 * fives + 10 * tens + 20 * twenties + 50 * fifties + 100 * hundreds


def print_banner() -> None:
    print("=" * 37)
    print(f"{'Welcome to Store Cash Manager':^37}")
    print("=" * 37)


def main():
    print_banner()
    print()
    choice = "START"

    while choice == "START":
        deposits = int(input("Enter the number of deposits: "))
        print()

        bank_total = 0
        vault_total = 0

        for _ in range(deposits):
            pennies = int(input("Enter the number of pennies to deposit: "))
            nickels = int(input("Enter the number of nickels to deposit: "))
            dimes = int(input("Enter the number of dimes to deposit: "))
            quarters = int(input("Enter the number of quarters to deposit: "))
            ones = int(input("Enter the number of one dollar bills to deposit: "))
            fives = int(input("Enter the number of five dollar bills to deposit: "))
            tens = int(input("Enter the number of ten dollar bills to deposit: "))
            twenties = int(input("Enter the number of twenty dollar bills to deposit: "))
            fifties = int(input("Enter the number of fifty dollar bills to deposit: "))
            hundreds = int(input("Enter the number of hundred dollar bills to deposit: "))

            total = calculate_total_value(pennies, nickels, dimes, quarters, ones, fives, tens, twenties, fifties, hundreds)

            print()

            if total <= 50:
                vault_total += total
                print(f"${total:.2f} has been deposited into the local vault.")
            else:
                bank_total += total
                print(f"${total:.2f} has been deposited into the bank.")


            print()

        print(f"{'Total Funds':^17}")
        print("="*17)
        print(f"{'Bank':<6}|{f'${bank_total:.2f}':>10}")
        print("-"*17)
        print(f"{'Vault':<6}|{f'${vault_total:.2f}':>10}")

        print()

        choice = input("Would you like to START again or EXIT? ").upper()

        print()

    print("Goodbye")

if __name__ == "__main__":
    main()
