# Steganography

## Problem 1: String methods and indexing

Steganography deals with only hiding messages, but also concealing the presence of a hidden message. More modern steganographic methods typically encrypt messages within digital media (images, audio files, video files, etc.), but they can also hide messages in text. One method of concealing the message is to make the text appears as gibberish or as though another cryptographic method is being used.

In this problem, define a function, `decrypt()`. `decrypt()` takes in a single positional argument, `ciphertext`. First, remove all non-alphabetical characters from `ciphertext`. Every fourth character in the resulting all-alphabetical string is part of the message. `decrypt()` should then return the `plaintext`, an all-lowercase string with the decrypted message.

To test your function, consider testing some of the messages from `messages.py` in IDLE interactive mode.

Below are some examples of `decrypt()` calls in IDLE's interactive mode.

### Example 1
*`decrypt('zerhvuli')`* returns `'hi'`

### Example 2
*`decrypt('llbsdryeobfcsisthvvieuiozxdnsyltdtjwliho')`* returns `'sectiontwo'`

### Example 3
*`decrypt('Glybkisa xuibrakyyyds huohmeiani erz cjk')`* returns `'babyshark'`

### Example 4
*`decrypt('Xatr, pyko te kmh. Oietfko')`* returns `'romeo'`

### Example 5
*`decrypt('Mox, jiwg uwh xlfhqi. Qqweaklt!')`* returns `'juliet'`

### Example 6
*`decrypt('Jo yr en oo vj es fi ga hp il mm wi mg vn vt qd.')`* returns `'rosalind'`
