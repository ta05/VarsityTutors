def read(filename):
    file = open("./files/" + filename, "r")
    return file.read()


def write(filename, message):
    file = open("./files/" + filename, "w")
    file.write(message)


def encode(plaintext, shift):
    ciphertext = ""
    alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for character in plaintext:
        if character in alphabet:
            ciphertext += alphabet[alphabet.index(character) + shift]
        else:
            ciphertext += character
    return ciphertext


def decode(ciphertext, shift):
    return encode(ciphertext, -1 * shift)


def main():
    while True:
        selection = input("Would you like to encode or decode the message?\nType E to encode, D to decode, or Q to quit: ").lower()
        if selection == "q":
            break
        elif selection == "e":
            infile = input("\nPlease enter a file for reading: ")
            plaintext = read(infile)
            ciphertext = encode(plaintext, 3)
            outfile = input("Please enter a file for writing: ")
            write(outfile, ciphertext)

            print("\nPlaintext:\n{}".format(plaintext))
            print("\nCiphertext:\n{}\n".format(ciphertext))
        elif selection == "d":
            infile = input("\nPlease enter a file for reading: ")
            ciphertext = read(infile)
            plaintext = decode(ciphertext, 3)
            outfile = input("Please enter a file for writing: ")
            write(outfile, plaintext)

            print("\nCiphertext:\n{}".format(ciphertext))
            print("\nPlaintext:\n{}\n".format(plaintext))
        else:
            print("The selection was invalid.\n")


if __name__ == "__main__":
    main()
