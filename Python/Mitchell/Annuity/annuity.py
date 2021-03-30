import math

def period_from_annuity(PV, r, P):
    return -math.log(1 - PV * r / P) / math.log(1 + r)
    
def annuity(n, r, P):
    return (P / r) * (1 - (1 + r) ** (-n))
    

PV = float(input("Please enter your initial investment: "))
r = float(input("Please enter annual interest rate: "))*0.01/12
P = float(input("Please enter the monthly annuity payment: "))

n = int(period_from_annuity(PV, r, P))
print("After {} months your balance is {:.2f}".format(n, PV - annuity(n, r, P)))