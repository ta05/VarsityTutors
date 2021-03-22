def get_area_code(ten_digit_number):
    return ten_digit_number[0:3]

def get_prefix(ten_digit_number):
    return ten_digit_number[3:6]

def get_line_number(ten_digit_number):
    return ten_digit_number[6:]

if __name__ == '__main__':
    print("The following program reads 10 digits as a phone number")
    print("For example if the user enters: 8772692967, then the output will be: ", end=" ")
    print("(877) 269-2967")
    print()

    phone_number = input("Please enter 10 digits: ")
    print("Here is your formatted phone number: ({}) {}-{}".format(get_area_code(phone_number), get_prefix(phone_number), get_line_number(phone_number)))