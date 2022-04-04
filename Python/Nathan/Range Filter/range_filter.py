def rangeFilter(list1: list[float], lb: float, ub: float) -> list[float]:
    return [num for num in list1 if num >= lb and num <= ub]


if __name__ == "__main__":
    list1 = []
    lb = float(input())
    ub = float(input())
    val = float(input())
    while val != 0:
        list1.append(val)
        val = float(input())
    print(rangeFilter(list1, lb, ub))