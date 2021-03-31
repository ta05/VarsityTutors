def straight_line(item, cost, item_life):
    print("Depreciation schedule for: {}\n".format(item))
    print("Year\tBegin\tDep\tEnd")
    year = 0
    begin = end = cost
    dep = 0
    print("{}\t{:.2f}\t{:.2f}\t{:.2f}".format(year, begin, dep, end))
    dep = cost / item_life
    for i in range(1, item_life + 1):
        year += 1
        begin = end
        end = begin - dep
        print("{}\t{:.2f}\t{:.2f}\t{:.2f}".format(year, begin, dep, end))

def double_declining(item, cost, item_life):
    print("Depreciation schedule for: {}\n".format(item))
    print("Year\tBegin\tDep\tEnd")
    year = 0
    begin = end = cost
    dep = 0
    print("{}\t{:.2f}\t{:.2f}\t{:.2f}".format(year, begin, dep, end))
    for i in range(1, item_life + 1):
        year += 1
        begin = end
        dep = (2/item_life) * begin if i != item_life else begin
        end = begin - dep
        print("{}\t{:.2f}\t{:.2f}\t{:.2f}".format(year, begin, dep, end))


item = input("Description of the item: ")
cost = float(input("Cost of the item: "))
item_life = int(input("Estimated life of the item in whole years: "))
method = input("Depreciation method (1 - straight line, 2 - double-declining balance): ")

if method == "1":
    straight_line(item, cost, item_life)
elif method == "2":
    double_declining(item, cost, item_life)