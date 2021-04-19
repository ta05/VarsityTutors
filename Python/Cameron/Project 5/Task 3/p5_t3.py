import random

alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
encrypt = list(alphabet)
random.shuffle(encrypt)
encrypter = ''.join(encrypt)

def encrypt(encrypter):
    message = input("Input message:\n").upper()

    encrypted_msg = ""
    for i in range(len(message)):
        if message[i] not in encrypter:
            encrypted_msg += message[i]
        else:
            encrypted_msg += encrypter[alphabet.index(message[i])]
    return encrypted_msg

def decrypt(message, encrypter):
    decrypted_msg = ""
    for i in range(len(message)):
        if message[i] not in encrypter:
            decrypted_msg += message[i]
        else:
            decrypted_msg += alphabet[encrypter.index(message[i])]
    return decrypted_msg



e_msg = encrypt(encrypter)
print("\nScrambled Alphabet:\n" + encrypter)

print("\nThe scrambled message is:\n" + e_msg)

print("\nYour scrambled message reads:\n" + decrypt(e_msg, encrypter))