def lettersOnly(s):
    res = ""
    for letter in s:
        if letter.lower() >= "a" and letter.lower() <= "z":
            res += letter
    return res

print(lettersOnly("Alph4Num3r1c!"))