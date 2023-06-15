# Investment

Write a program that compares the estimated final after-tax value of investing a fixed amount of money in a mortgage lump sum payment, a TFSA (Tax-Free Savings Account), or an RRSP (Registered Retirement Savings Plan) in Canada.

The Program should prompt the user for the following inputs:

- Amount of money available now
- Mortgage rate (annual interest rate for mortgage)
- Expected investment rate of return (annual percentage)
- Number of years to consider
- Current marginal tax rate
- Expected future marginal tax rate

The program should calculate and display the final after-tax value for each investment option, taking into account the mortgage payment, tax deduction from RRSP investment, tax on future RRSP withdraw.

Notes:

- Assume that the mortgage lump sum payment is made at the beginning of the investment period and that the mortgage interest is compounded annually.
- You may assume a constant mortgage rate and investment rate of return.
- TFSA withdraws are not taxed.
- You can assume that you have enough available RRSP and TFSA room to make these investments.
- Result of RRSP investment depends on your current and future tax rates. We will use current and future marginal tax rates.

Use the following formulas for calculations:
- $Mortgage = Amount \times (1 + \frac{mortgage\:rate}{100})^{time}$
- $TFSA = Amount \times (1 + \frac {investment\:rate}{100})^{time}$
- $RRSP\:Tax\:Return = Amount \times (\frac {current\:marginal\:tax\:rate}{100})$
- $RRSP = Amount \times (1 + \frac {investment\:rate}{100})^{time} \times (1 - \frac {future\:marginal\:tax\:rate}{100})$

Display the final after-tax value for each investment option. You can display the final values as integers. After displaying the result, prompt the user to enter "y/n" if they wish to test another scenario.

## Sample Run

~~~
Enter the amount of money ($): 1000
Enter the expected mortgage rate (%): 5
Enter the expected investment rate of return (%): 7
Enter the expected period of comparison (years): 25
Enter your current marginal tax rate (%): 40
Enter your expected marginal tax rate at end of period (%): 30

After tax value at end period is:
Mortgage = $ 3386
TFSA = $ 5427
RRSP:
  $ 400 tax return put in TFSA = $ 2171
  After tax RRSP = $ 3799
  RRSP Total Value = $ 5970

Test another scenario? (y/n) y

Enter the amount of money ($): 1000
Enter the expected mortgage rate (%): 5
Enter the expected investment rate of return (%): 5
Enter the expected period of comparison (years): 25
Enter your current marginal tax rate (%): 30
Enter your expected marginal tax rate at end of period (%): 30   

After tax value at end period is:
Mortgage = $ 3386
TFSA = $ 3386
RRSP:
  $ 300 tax return put in TFSA = $ 1016
  After tax RRSP = $ 2370
  RRSP Total Value = $ 3386

Test another scenario? (y/n) n
~~~