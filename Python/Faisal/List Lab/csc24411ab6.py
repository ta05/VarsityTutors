from numpy import char


def printStr(lst: list) -> None:
    char_str = ""
    for elem in lst:
        if isinstance(elem, int) and elem >= 0:
            char_str += chr(elem)
    print(char_str)


def alphabetical(lst: list) -> bool:
    for i in range(len(lst) - 1):
        if lst[i].lower() > lst[i+1].lower():
            return False
    return True


def main():
    print("Testing printStr:\n")
    lst1 = [84, 111, 100, 97, 121, 32, 105, 115, 32, 84, 117, 101, 115, 100, 97, 121, 46]
    printStr(lst1)
    lst2 = [37, 33, 35, 36, 33, 64, 35, 42, 36, 38, 35, 32, 119, 105, 115, 104, 32, 73, 32, 99, 111, 117, 108, 100, 32, 117, 100, 101, 114, 115, 116, 97, 110, 100, 32, 116, 104, 105, 115, 32, 98, 101, 116, 116, 101, 114, 46]
    printStr(lst2)
    printStr([65, 110, 110, 105, 107, 97])
    printStr([65, 110, -3, 110, 105, -8.5, 11.1, 107, 'ten', 97])
    printStr([])

    print("\nTesting alphabetical:\n")


    ans = alphabetical(['aardvark', 'Paris', 'zebra'])
    assert ans == True, f"expected True, got {ans}"

    ans = alphabetical(['Amber', 'Amsterdam', 'Amsterdam', 'pizza'])
    assert ans == True, f"expected True, got {ans}"

    ans = alphabetical(['ache', 'acne', 'acute', 'acted'])
    assert ans == False, f"expected False, got {ans}"

    ans = alphabetical(['Amber', 'Chad', 'Jack', 'JoJo', 'LaRue', 'Annika'])
    assert ans == False, f"expected True, got {ans}"

    ans = alphabetical(['Ash', 'Jack', 'pizza', 'wine', 'Zanzibar'])
    assert ans == True, f"expected True, got {ans}"

    ans = alphabetical(['Amber'])
    assert ans == True, f"expected True, got {ans}"

    ans = alphabetical([])
    assert ans == True, f"expected True, got {ans}"

    print("All tests passed!")


if __name__ == "__main__":
    main()