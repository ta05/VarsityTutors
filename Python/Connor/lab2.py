def prob1(num1, num2):
    return "{:.3f}".format(num1/num2)


def prob2(num1, num2):
    return "{:.5f}".format(num1/num2)


def prob3(num1, num2):
    return "{:.6e}".format(num1/num2)


def prob4(char):
    return ord(char)

def prob5(num1, num2):
    return (num1 + num2, num1 - num2, num1 * num2, num1 / num2, num1 // num2, num1 % num2, num1 ** num2)


if __name__ == "__main__":
    n1 = int(input("Please enter a number "))
    n2 = int(input("Please enter a number "))
    print(prob1(n1, n2))

    n1 = float(input("Please enter a number "))
    n2 = float(input("Please enter a number "))
    print(prob2(n1, n2))

    n1 = float(input("Please enter a number "))
    n2 = float(input("Please enter a number "))
    print(prob3(n1, n2))

    c1 = input("Please enter an upper or lower case letter ")
    print(prob4(c1))

    n1 = int(input("Please enter a number "))
    n2 = int(input("Please enter a number "))
    res = prob5(n1, n2)
    print("{:,} + {:,} = {:,}".format(n1, n2, res[0]))
    print("{:,} - {:,} = {:,}".format(n1, n2, res[1]))
    print("{:,} * {:,} = {:,}".format(n1, n2, res[2]))
    print("{:,} / {:,} = {:,.2f}".format(n1, n2, res[3]))
    print("{:,} // {:,} = {:,}".format(n1, n2, res[4]))
    print("{:,} % {:,} = {:,}".format(n1, n2, res[5]))
    print("{:,} ** {:,} = {:,}".format(n1, n2, res[6]))