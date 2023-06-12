def main():
    while True:
        principal = int(input("Enter the amount of money ($): "))
        mortgage_rate = int(input("Enter the expected mortgage rate (%): "))/100
        investment_rate = int(input("Enter the expected investment rate of return (%): "))/100
        period = int(input("Enter the expected period of comparison (years): "))
        current_tax_rate = int(input("Enter your current marginal tax rate (%): "))/100
        future_tax_rate = int(input("Enter your expected marginal tax rate at end of period (%): "))/100

        mortgage = principal * (1 + mortgage_rate)**period
        tfsa = principal * (1 + investment_rate)**period
        rrsp_tax_return = principal * current_tax_rate
        rrsp = principal * (1 + investment_rate)**period * (1 - future_tax_rate)
        invested_tax_return = rrsp_tax_return * (1 + investment_rate)**period
        total_rrsp = rrsp + invested_tax_return

        
        print("\nAfter tax value at end period is:")
        print(f"Mortgage = $ {mortgage:.0f}")
        print(f"TFSA = $ {tfsa:.0f}")
        print("RRSP:")
        print(f"  $ {rrsp_tax_return:.0f} tax return put in TFSA = $ {invested_tax_return:.0f}")
        print(f"  After tax RRSP = $ {rrsp:.0f}")
        print(f"  RRSP Total Value = $ {total_rrsp:.0f}")

        repeat = input("\nTest another scenario? (y/n) ") == "n"
        print("")
        if repeat:
            break

if __name__ == "__main__":
    main()