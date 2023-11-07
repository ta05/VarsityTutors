from digitalclock import *

def number0(char: str) -> None:
    print(horizontal_line(5, char) + two_vertical_lines(5, 3, char) + horizontal_line(5, char))


def number1(char: str) -> None:
    print(vertical_line(4, 5, char))


def number2(char: str) -> None:
    print(horizontal_line(5, char) + vertical_line(4, 1, char) + horizontal_line(5, char) + vertical_line(0, 1, char) + horizontal_line(5, char))


def number3(char: str) -> None:
    print(horizontal_line(5, char) + vertical_line(4, 1, char) + horizontal_line(5, char) + vertical_line(4, 1, char) + horizontal_line(5, char))


def number4(char: str) -> None:
    print(two_vertical_lines(5, 2, char) + horizontal_line(5, char) + vertical_line(4, 2, char))


def number5(char: str) -> None:
    print(horizontal_line(5, char) + vertical_line(0, 1, char) + horizontal_line(5, char) + vertical_line(4, 1, char) + horizontal_line(5, char))


def number6(char: str) -> None:
    print(horizontal_line(5, char) + vertical_line(0, 1, char) + horizontal_line(5, char) + two_vertical_lines(5, 1, char) + horizontal_line(5, char))


def number7(char: str) -> None:
    print(horizontal_line(5, char) + vertical_line(4, 4, char))


def number8(char: str) -> None:
    print(horizontal_line(5, char) + two_vertical_lines(5, 1, char) + horizontal_line(5, char) + two_vertical_lines(5, 1, char) + horizontal_line(5, char))


def number9(char: str) -> None:
    print(horizontal_line(5, char) + two_vertical_lines(5, 1, char) + horizontal_line(5, char) + vertical_line(4, 2, char))


def main():
    number0(")")
    number1("!")
    number2("@")
    number3("#")
    number4("$")
    number5("%")
    number6("^")
    number7("&")
    number8("*")
    number9("(")


if __name__ == "__main__":
    main()