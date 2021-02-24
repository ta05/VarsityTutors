
vigenere = {"a": 0, "b": 1, "c": 2, "d": 3, "e": 4, "f": 5, "g": 6, "h": 7, "i": 8, "j": 9, "k": 10, "l": 11, "m": 12, "n": 13, "o": 14, "p": 15, "q": 16, "r": 17, "s": 18, "t": 19, "u": 20, "v": 21, "w": 22, "x": 23, "y": 24, "z": 25}

# Given a plain text and a keyword, returns the encrypted message code
def encrypt(plain, key):
    letters = list(vigenere.keys())
    key_position = 0
    code = ""
    for char in plain:
        if char not in letters:
            code += char
        else:
            code += letters[(vigenere[char] + vigenere[key[key_position]]) % 26]
            key_position += 1
            key_position = key_position % len(key)
    return code

# Given a code and a keyword, returns the decrypted message decode
def decrypt(code, key):
    letters = list(vigenere.keys())
    key_position = 0
    decode = ""
    for char in code:
        if char not in letters:
            decode += char
        else:
            decode += letters[(vigenere[char] - vigenere[key[key_position]]) % 26]
            key_position += 1
            key_position = key_position % len(key)
    return decode



plain = "it was the threat of enemy interception that..."
key = "codebreaker"

code = encrypt(plain,key)

print("Code: ", encrypt(plain,key))
print("Decode: ", decrypt(code, key))