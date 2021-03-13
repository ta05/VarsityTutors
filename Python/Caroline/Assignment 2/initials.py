def initials(x, y, z=None):
    if z is None:
        return (x[0] + "x" + y[0]).lower()
    return (x[0] + z[0] + y[0]).lower()

print(initials("edgar", "poe", "allen"))
print(initials("Jimmy", "Buckets", "Get"))
print(initials("cloud", "strife"))
print(initials("flo", "rida",))