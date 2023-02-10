
# Takes in a number as a string, returns the number as an int without the comma separator
def remove_separator(num_string: str) -> int:
    return int(num_string[:2] + num_string[-3:])


def main():
    num_string = input("Please enter an integer between 10,000 and 99,999: ")
    print(remove_separator(num_string))


if __name__ == "__main__":
    main()