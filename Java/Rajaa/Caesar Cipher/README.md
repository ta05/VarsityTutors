# Caesar Cipher

**Instructions**: Write a program to encode or decode a message using a Caesar Shift.

## Part 1: Encryption

Create two new classes called `CaesarShiftEncryption` and `CaesarShiftTester`. Provide a menu to allow the user to choose between encryption and decryption. Allow the user to continue entering messages for processing until he/she decides to quit. Ask the user to input a shift key calue (0-25) and the plaintext message. The `Alphabet` needs to be a class constant. You will need to figure out what class to put it in. Write a static method to generate the cipher alphabet based on the key and print the new alphabet to the screen. Write a static method to encrypt the plaintext message and print the result.

## Part 2: Decryption

Write a new class called `CaesarShiftDecryption`. Allow the user to input a shift key value (0-25) and a ciphertext message. Assign the key to a constant. You may resue any previously created methods or variables. Generate the cipher alphabet based on the key and print the alphabet to the screen. Write a static method to decrypt the ciphertext message and print the result.