# Polyalphabetic Encryption

A polyalphabetic cipher is any cipher based on substitution, using multiple substitution alphabets. The Vigenère cipher is probably the best-known example of a polyalphabetic cipher, though it is a simplified special case.

## Vigenere Cipher

To encrypt, a table of alphabets can be used, termed a tabula recta, Vigenère square or Vigenère table. It has the alphabet written out 26 times in different rows, each alphabet shifted cyclically to the left compared to the previous alphabet, corresponding to the 26 possible Caesar ciphers. At different points in the encryption process, the cipher uses a different alphabet from one of the rows. The alphabet used at each point depends on a repeating keyword.

![alt text](https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Vigen%C3%A8re_square_shading.svg/220px-Vigen%C3%A8re_square_shading.svg.png)

For example, suppose that the plaintext to be encrypted is

ATTACKATDAWN

The person sending the message chooses a keyword and repeats it until it matches the length of the plaintext, for example, the keyword "LEMON":

LEMONLEMONLE

Each row starts with a key letter. The rest of the row holds the letters A to Z (in shifted order). Although there are 26 key rows shown, a code will use only as many keys (different alphabets) as there are unique letters in the key string, here just 5 keys: {L, E, M, O, N}. For successive letters of the message, successive letters of the key string will be taken and each message letter enciphered by using its corresponding key row. The next letter of the key is chosen, and that row is gone along to find the column heading that matches the message character. The letter at the intersection of [key-row, msg-col] is the enciphered letter.

For example, the first letter of the plaintext, A, is paired with L, the first letter of the key. Therefore, column L and row A of the Vigenère square are used, namely L. Similarly, for the second letter of the plaintext, the second letter of the key is used. The letter at row E and column T is X. The rest of the plaintext is enciphered in a similar fashion:

Plaintext:  ATTACKATDAWN
Key:    LEMONLEMONLE
Ciphertext: LXFOPVEFRNHR

Decryption is performed by going to the row in the table corresponding to the key, finding the position of the ciphertext letter in that row and then using the column's label as the plaintext. For example, in row L (from LEMON), the ciphertext L appears in column A, which is the first plaintext letter. Next, in row E (from LEMON), the ciphertext X is located in column T. Thus T is the second plaintext letter.

## Program

The program has two functions that work using the Vigenere cipher.

- encrypt takes in a plaintext message and keyword, encrypts it using the Vigenere cipher and returns the encrypted message.
- decrypt takes in a coded message and keyword, decrypts it using the Vigenere cipher and returns the decoded message.

## Links

- [Vigenere Cipher](https://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher)
- [Polyalphabetic Coding](https://en.wikipedia.org/wiki/Polyalphabetic_cipher)