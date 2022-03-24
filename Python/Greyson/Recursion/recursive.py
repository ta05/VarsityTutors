# Question 5
def count_lowercase(s: str, low: int, high: int) -> int:
    if low > high:
        return 0
    if s[low].islower():
        return 1 + count_lowercase(s, low + 1, high)
    return count_lowercase(s, low + 1, high)

def is_number_of_lowercase_even(s: str, low: int, high: int) -> bool:
    return count_lowercase(s, low, high) % 2 == 0


# Question 6
def appearances(s: str, low: int, high: int) -> dict[str, int]:
    return appearances_helper(s, {}, low, high)

def appearances_helper(s: str, freq: dict[str, int], low: int, high: int) -> dict[str, int]:
    if low > high:
        return freq

    if s[low] in freq:
        freq[s[low]] += 1
    else:
        freq[s[low]] = 1
    
    return appearances_helper(s, freq, low + 1, high)


# Question 7
def split_by_sign(lst: list[int], low: int, high: int) -> list[int]:
    if low > high:
        return []
    
    if lst[low] < 0:
        return [lst[low]] + split_by_sign(lst, low + 1, high)
    return split_by_sign(lst, low + 1, high) + [lst[low]]


print(count_lowercase("doOg", 0, 3))
print(count_lowercase("doG", 0, 2))
print(is_number_of_lowercase_even("doOg", 0, 3))
print(appearances("Hello World", 0, 10))
print(split_by_sign([9, -6, -8, 10, 3, -1, 5], 0, 6))