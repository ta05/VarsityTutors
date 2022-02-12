def caesercipher(message: str, encode: bool, shift: int):
    if not encode:
        shift = -1 * shift
    
    upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    lower = upper.lower()
    numbers = "0123456789"

    res = ""

    for char in message:
        if char.isupper():
            res += upper[(upper.index(char) + shift) % len(upper)]
        elif char.islower():
            res += lower[(lower.index(char) + shift) % len(lower)]
        elif char.isdigit():
            res += numbers[(numbers.index(char) + shift) % len(numbers)]
        else:
            res += char
    return res

print(caesercipher("Mouse", True, 5))

