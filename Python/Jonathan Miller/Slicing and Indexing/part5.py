def get_middle(nm: list) -> list:
    if nm.count("x") <= 1:
        return []
    first = nm.index("x")
    last = len(nm) - nm[::-1].index("x") - 1
    return nm[first + 1: last]

print(get_middle(['a', 'x', 4, 6, 'x', 7]))
print(get_middle(['a', 'x', 'x', 'x']))
print(get_middle([6, 'x']))
print(get_middle(['x', 1, 'a', 'X', 'x', ]))
