def combine_inventories(inv1, inv2):
    combined = inv1
    print("INVENTORY")
    for item in inv2:
        if item in combined:
            combined[item] += inv2[item]
        else:
            combined[item] = inv2[item]
    
    for item in combined:
        print("{}: {}".format(item, combined[item]))

elf = {"arrows": 15, "cures": 3, "coins": 72}
mage = {"energy": 16, "cures": 2, "coins": 52}

combine_inventories(elf, mage)



